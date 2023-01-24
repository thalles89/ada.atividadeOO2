package atividade.sistema;

import atividade.aluguel.Alugavel;
import atividade.aluguel.Aluguel;
import atividade.pessoa.Fisica;
import atividade.pessoa.Pessoa;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Fatura<T extends Alugavel> {


    private final List<Aluguel<T>> listaAlugueis;

    public Fatura(List<Aluguel<T>> lista){

        this.listaAlugueis = lista;
    }

    public double calcularTotal(Pessoa pessoa){
        AtomicReference<Double> value = new AtomicReference<>(0d);
        listaAlugueis.stream().filter(tAluguel -> tAluguel.getCliente() == pessoa).forEach(it->{
            value.updateAndGet(v -> v + it.getValorOrcado());
        });
        value.updateAndGet(v -> v - calcularDesconto(pessoa));
        return value.get();
    }

    public double calcularDesconto(Pessoa pessoa) {
        AtomicReference<Double> value = new AtomicReference<>(0d);
        listaAlugueis.forEach(it-> {
            if(it.getCliente().getDiasNecessariosParaDesconto() >= it.getDias()){
                value.updateAndGet(v -> v + it.getValorOrcado() * pessoa.getPercentualDeDesconto());
            }
        });
        return value.get();
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "listaAlugueis=" + listaAlugueis +
                '}';
    }
}

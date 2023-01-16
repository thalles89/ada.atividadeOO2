package atividade.aluguel;

import atividade.pessoa.Pessoa;

import java.util.*;

public class Aluguel<T extends Alugavel> {

    private Double valorOrcado;
    private final T alugavel;
    private final Pessoa cliente;
    private final int dias;

    private Map<Pessoa, Alugavel> historico;

    public Aluguel(T alugavel, Pessoa cliente, int dias) {
        historico = new HashMap<>();
        this.alugavel = alugavel;
        this.cliente = cliente;
        this.dias = dias;

        historico.put(cliente, alugavel);
    }

    public double orcaPreco() {
        valorOrcado = (1 - cliente.calculaDesconto(dias)) * alugavel.valorDiaria() * dias;
        return valorOrcado;
    }


    @Override
    public String toString() {
        return String.valueOf(valorOrcado);
    }

    public Alugavel getHistorico(Pessoa pessoa) {
        return (historico.get(pessoa));
    }

}
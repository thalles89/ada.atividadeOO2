package atividade.aluguel;

import atividade.pessoa.Pessoa;

public class Aluguel<T extends Alugavel>{

    private Double valorOrcado;
    public double orcaPreco(T alugavel, Pessoa cliente, int dias) {
        valorOrcado = (1-cliente.calculaDesconto(dias)) * alugavel.valorDiaria() * dias;
        return valorOrcado;
    }
    @Override
    public String toString() {
        return String.valueOf(valorOrcado);
    }
}
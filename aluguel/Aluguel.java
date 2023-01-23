package atividade.aluguel;

import atividade.pessoa.Pessoa;

import java.util.*;

public class Aluguel<T extends Alugavel> {

    private Double valorOrcado;
    private final T alugavel;
    private final Pessoa cliente;
    private final int dias;

    public Aluguel(T alugavel, Pessoa cliente, int dias) {
        this.alugavel = alugavel;
        this.cliente = cliente;
        this.dias = dias;
    }

    public double orcaPreco() {
        valorOrcado = (1 - cliente.calculaDesconto(dias)) * alugavel.valorDiaria() * dias;
        return valorOrcado;
    }

    @Override
    public String toString() {
        return String.valueOf(valorOrcado);
    }

    public Pessoa getCliente() {
        return cliente;
    }
}
package atividade.aluguel;

import atividade.pessoa.Pessoa;

public class Aluguel<T extends Alugavel> {

    private Double valorOrcado;
    private final T alugavel;
    private Pessoa cliente;
    private final int dias;

    public Aluguel(T alugavel, Pessoa cliente, int dias) {
        this.alugavel = alugavel;
        this.cliente = cliente;
        this.dias = dias;
    }

    public Aluguel<T> orcaPreco() {
        valorOrcado = alugavel.valorDiaria() * dias;
        return this;
    }

    @Override
    public String toString() {
        return alugavel.toString();
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public Double getValorOrcado() {
        return valorOrcado;
    }

    public int getDias() {
        return dias;
    }
}
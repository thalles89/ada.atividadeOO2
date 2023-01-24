package atividade.pessoa;

public class Juridica extends Pessoa {
    private final String nome;
    public Juridica(String nome){
        this.nome = nome;
    }
    private final int diasNecessariosParaDesconto = 3;
    private final double percentualDeDesconto = 0.10;

    public int getDiasNecessariosParaDesconto() {
        return diasNecessariosParaDesconto;
    }

    public double getPercentualDeDesconto() {
        return percentualDeDesconto;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
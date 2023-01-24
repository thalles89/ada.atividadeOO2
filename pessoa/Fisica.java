package atividade.pessoa;
public class Fisica extends Pessoa {
    private final String nome;
    public Fisica(String nome){
        this.nome = nome;
    }

    //    public double calculaDesconto(int dias){
//        if (dias >= diasNecessariosParaDesconto){
//            return 0.05;
//        }
//        return 0;
//    }

    public String getNome() {
        return nome;
    }

    public int getDiasNecessariosParaDesconto() {
        return 5;
    }
    public double getPercentualDeDesconto() {
        return 0.05;
    }

    @Override
    public String toString() {
        return nome;
    }
}
package atividade.pessoa;
public class Fisica implements Pessoa {
    final int diasNecessariosProDesconto = 5;
    
    public double calculaDesconto(int dias){
        if (dias >= diasNecessariosProDesconto){
            return 0.05;
        }
        return 0;
    }
}
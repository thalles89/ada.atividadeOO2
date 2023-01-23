package atividade.pessoa;

public class Juridica implements Pessoa {
    final int diasNecessariosProDesconto = 3;
    public double calculaDesconto(int dias){
        if( dias >= diasNecessariosProDesconto){
            return 0.10;
        }
        return 0;
    }

}
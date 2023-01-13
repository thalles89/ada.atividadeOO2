package atividade.pessoa;

import java.util.ArrayList;
import java.util.List;

public class Juridica implements Pessoa {
    final int diasNecessariosProDesconto = 3;
    public double calculaDesconto(int dias){
        if( dias >= diasNecessariosProDesconto){
            return 0.10;
        }
        return 0;
    }

}
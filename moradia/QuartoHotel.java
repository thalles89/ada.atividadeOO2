package atividade.moradia;

import atividade.aluguel.Alugavel;

public class QuartoHotel extends Quarto implements Alugavel {

    @Override
    public double valorDiaria() {
        return super.valorBase;
    }
}

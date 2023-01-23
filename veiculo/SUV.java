package atividade.veiculo;

import atividade.aluguel.Alugavel;

public class SUV extends Veiculo implements Alugavel {
    final double valorBase = 200;

    public double valorDiaria() {
        return this.valorBase;
    }

    @Override
    public String toString() {
        return " SUV {valorBase=" + valorBase + '}';
    }
}
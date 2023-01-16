package atividade.veiculo;

import atividade.aluguel.Alugavel;

public class CarroMedio extends Veiculo implements Alugavel {
    final double valorBase = 150;

    @Override
    public double valorDiaria() {
        return this.valorBase;
    }

    @Override
    public String toString() {
        return "CarroMedio{" +
                "valorBase=" + valorBase +
                '}';
    }
}
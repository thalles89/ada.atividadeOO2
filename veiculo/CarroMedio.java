package atividade.veiculo;

import atividade.aluguel.Alugavel;

public class CarroMedio implements Veiculo {
    final double valorBase = 150;

    @Override
    public double valorDiaria() {
        return this.valorBase;
    }
}
package atividade.veiculo;


import atividade.aluguel.Alugavel;

public class CarroPequeno implements Veiculo {
    
    final double valorBase = 100;

    @Override
    public double valorDiaria() {
        return this.valorBase;
    }
}
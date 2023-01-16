package atividade.veiculo;


import atividade.aluguel.Alugavel;

public class CarroPequeno extends Veiculo implements Alugavel {
    
    final double valorBase = 100;

    @Override
    public double valorDiaria() {
        return this.valorBase;
    }

    @Override
    public String toString() {
        return " Carro pequeno ";
    }
}
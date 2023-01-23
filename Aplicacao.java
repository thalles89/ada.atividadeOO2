package atividade;

import atividade.aluguel.Aluguel;
import atividade.historico.Historico;
import atividade.pessoa.Fisica;
import atividade.pessoa.Juridica;
import atividade.pessoa.Pessoa;
import atividade.veiculo.CarroMedio;
import atividade.veiculo.CarroPequeno;
import atividade.veiculo.SUV;
import atividade.veiculo.Veiculo;

import java.util.List;
import java.util.Objects;

public class Aplicacao {

    public static void main(String[] args) {
        Veiculo fusquinha = new CarroPequeno();
        Veiculo civic = new CarroMedio();
        Veiculo jeep = new SUV();

        var amanda = new Fisica();
        var boikoBank = new Juridica();

        var historico = new Historico<Pessoa, Veiculo>();

        List<Aluguel<Veiculo>> aluguelVeiculos = List.of(new Aluguel<>(fusquinha, amanda, 3),
        new Aluguel<>(fusquinha, amanda, 5),
        new Aluguel<>(civic, amanda, 3),
        new Aluguel<>(civic, amanda, 5),
        new Aluguel<>(jeep, boikoBank, 5),
        new Aluguel<>(fusquinha, boikoBank, 3),
        new Aluguel<>(fusquinha, boikoBank, 5),
        new Aluguel<>(jeep, boikoBank, 3));


        aluguelVeiculos.forEach(it -> {
            System.out.println(it.orcaPreco());
            historico.put(it.getCliente(), it);
        });

        System.out.println("Alugueis do BoikoBank");
        System.out.println(historico.getHistorico(boikoBank));

        System.out.println("Alugueis do Amanda");
        System.out.println(historico.getHistorico(amanda));

    }

}
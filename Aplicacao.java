package atividade;

import atividade.aluguel.Alugavel;
import atividade.moradia.Quarto;
import atividade.moradia.QuartoHotel;
import atividade.pessoa.*;
import atividade.veiculo.*;
import atividade.aluguel.Aluguel;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Aplicacao {

    public static void main(String[] args) {
        Veiculo fusquinha = new CarroPequeno();
        Veiculo civic = new CarroMedio();
        Veiculo jeep = new SUV();

        Pessoa amanda = new Fisica();
        Pessoa boikoBank = new Juridica();

//        Aluguel<Quarto> aluguelQuarto = new Aluguel<>(new QuartoHotel(), amanda, 2);

//        List<Double> aluguelQuartos = List.of(
//                aluguelQuarto.orcaPreco(new QuartoHotel(), amanda, 5),
//        aluguelQuarto.orcaPreco(new QuartoHotel(), amanda, 2));

        List<Aluguel<Veiculo>> aluguelVeiculos = List.of(
                new Aluguel<>(fusquinha, amanda, 3),
                new Aluguel<>(fusquinha, amanda, 5),
                new Aluguel<>(fusquinha, boikoBank, 3),
                new Aluguel<>(fusquinha, boikoBank, 5),
                new Aluguel<>(civic, amanda, 3),
                new Aluguel<>(civic, amanda, 5),
                new Aluguel<>(jeep, boikoBank, 3),
                new Aluguel<>(jeep, boikoBank, 5)
        );

        System.out.println("ALUGUEL DE VEICULOS");
        aluguelVeiculos.forEach(it-> System.out.println(it.orcaPreco()));
        System.out.println();
        System.out.println();
        aluguelVeiculos.forEach(it-> {
            if(Objects.nonNull(it.getHistorico(boikoBank))){
                System.out.println("Carros do BoikoBank" + " " + it.getHistorico(boikoBank));
            }
        });

        aluguelVeiculos.forEach(it-> {
            if(Objects.nonNull(it.getHistorico(amanda))){
                System.out.println("Carros da Amanda" + " " + it.getHistorico(amanda));
            }
        });
//        System.out.println("ALUGUEL DE QUARTOS");
//        aluguelQuartos.forEach(System.out::println);
    }

}
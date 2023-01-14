package atividade;

import atividade.aluguel.Alugavel;
import atividade.moradia.Quarto;
import atividade.moradia.QuartoHotel;
import atividade.pessoa.*;
import atividade.veiculo.*;
import atividade.aluguel.Aluguel;

import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {
        Veiculo fusquinha = new CarroPequeno();
        Veiculo civic = new CarroMedio();
        Veiculo jeep = new SUV();

        Pessoa amanda = new Fisica();
        Pessoa boikoBank = new Juridica();

        Aluguel<Veiculo> aluguel = new Aluguel<>();

        Aluguel<Quarto> aluguelQuarto = new Aluguel<>();

        List<Double> aluguelQuartos = List.of(aluguelQuarto.orcaPreco(new QuartoHotel(), amanda, 5),
        aluguelQuarto.orcaPreco(new QuartoHotel(), amanda, 2));

        List<Double> aluguelVeiculos = List.of(
                aluguel.orcaPreco(fusquinha, amanda, 3),
                aluguel.orcaPreco(fusquinha, amanda, 5),
                aluguel.orcaPreco(fusquinha, boikoBank, 3),
                aluguel.orcaPreco(fusquinha, boikoBank, 5),
                aluguel.orcaPreco(civic, amanda, 3),
                aluguel.orcaPreco(civic, amanda, 5),
                aluguel.orcaPreco(jeep, boikoBank, 3),
                aluguel.orcaPreco(jeep, boikoBank, 5)
        );

        System.out.println("ALUGUEL DE VEICULOS");
        aluguelVeiculos.forEach(System.out::println);

        System.out.println("ALUGUEL DE QUARTOS");
        aluguelQuartos.forEach(System.out::println);
    }

}
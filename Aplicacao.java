package atividade;

import atividade.aluguel.Aluguel;
import atividade.historico.Historico;
import atividade.pessoa.Fisica;
import atividade.pessoa.Juridica;
import atividade.pessoa.Pessoa;
import atividade.sistema.Fatura;
import atividade.veiculo.CarroMedio;
import atividade.veiculo.CarroPequeno;
import atividade.veiculo.SUV;
import atividade.veiculo.Veiculo;

import java.util.List;

public class Aplicacao {

    public static void main(String[] args) {
        Veiculo fusquinha = new CarroPequeno();
        Veiculo civic = new CarroMedio();
        Veiculo jeep = new SUV();

        var amanda = new Fisica("Amanda");
        var boikoBank = new Juridica("Boiko");
        var historico = new Historico<Pessoa, Veiculo>();

        List<Aluguel<Veiculo>> aluguelVeiculos = List.of(
                new Aluguel<>(fusquinha, amanda, 3),
                new Aluguel<>(fusquinha, amanda, 5),
                new Aluguel<>(civic, amanda, 3),
                new Aluguel<>(civic, amanda, 5),
                new Aluguel<>(jeep, boikoBank, 5),
                new Aluguel<>(fusquinha, boikoBank, 3),
                new Aluguel<>(fusquinha, boikoBank, 5),
                new Aluguel<>(jeep, boikoBank, 3));


        aluguelVeiculos.forEach(it -> {
            it.orcaPreco();
            historico.put(it.getCliente(), it);
        });

        var fatura = new Fatura<>(aluguelVeiculos);

        System.out.printf("Valor de desconto amanda: %s", fatura.calcularDesconto(amanda));
        System.out.println();
        System.out.printf("Valor Total amanda: %s", fatura.calcularTotal(amanda));
        System.out.println();
        System.out.println(fatura);


        System.out.printf("Calculo desconto boikoBank: %s",fatura.calcularDesconto(boikoBank));
        System.out.println();
        System.out.printf("Calculo Total: %s",fatura.calcularTotal(boikoBank));
        System.out.println();
        System.out.println(fatura);


//        fatura.imprimir();
        System.out.println("Alugueis do BoikoBank");
        System.out.println(historico.getHistorico(boikoBank));

        System.out.println("Alugueis do Amanda");
        System.out.println(historico.getHistorico(amanda));


    }

}
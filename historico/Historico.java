package atividade.historico;

import atividade.aluguel.Alugavel;
import atividade.aluguel.Aluguel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historico<Pessoa, T extends Alugavel> {

    private final Map<Pessoa, List<Aluguel<T>>>historico;

    public Historico() {
        historico = new HashMap<>();
    }

    public void put(Pessoa pessoa, Aluguel<T> a) {
        List<Aluguel<T>> values;
        if (historico.containsKey(pessoa)) {
            values = historico.get(pessoa);
        } else {
            values = new ArrayList<>();
            historico.put(pessoa, values);
        }
        values.add(a);
    }

    public List<Aluguel<T>> getHistorico(Pessoa pessoa) {
        return (historico.get(pessoa));
    }

}

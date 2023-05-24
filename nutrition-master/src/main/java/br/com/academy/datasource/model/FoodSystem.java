package br.com.academy.datasource.model;

import java.util.ArrayList;
import java.util.List;

class FoodSystem {
    private List<Alimento> alimentos;

    public FoodSystem() {
        alimentos = new ArrayList<>();
    }

    public boolean adicionarAlimento(Alimento alimento) {
        return alimentos.add(alimento);
    }

    public boolean atualizarAlimento(int posicao, Alimento alimento) {
        if (posicao >= 0 && posicao < alimentos.size()) {
            alimentos.set(posicao, alimento);
            return true;
        }
        return false;
    }

    public boolean removerAlimento(int posicao) {
        if (posicao >= 0 && posicao < alimentos.size()) {
            alimentos.remove(posicao);
            return true;
        }
        return false;
    }

    public List<Alimento> listarAlimentos() {
        return alimentos;
    }
}

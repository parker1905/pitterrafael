package br.com.academy.datasource.model;

import java.util.ArrayList;
import java.util.List;

class Trajetoria {
    private int trajetoriaId;
    private String descricao;

    public Trajetoria(int trajetoriaId, String descricao) {
        this.trajetoriaId = trajetoriaId;
        this.descricao = descricao;
    }

    // getters e setters

    public int getTrajetoriaId() {
        return trajetoriaId;
    }

    public void setTrajetoriaId(int trajetoriaId) {
        this.trajetoriaId = trajetoriaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

class RunSystem {
    private int localizacao;
    private List<Trajetoria> trajetorias;

    public RunSystem() {
        localizacao = 0;
        trajetorias = new ArrayList<>();
    }

    public boolean criarTrajetoria(Trajetoria trajetoria) {
        return trajetorias.add(trajetoria);
    }

    public boolean atualizarTrajetoria(int posicao, Trajetoria trajetoria) {
        if (posicao >= 0 && posicao < trajetorias.size()) {
            trajetorias.set(posicao, trajetoria);
            return true;
        }
        return false;
    }

    public boolean removerTrajetoria(int posicao) {
        if (posicao >= 0 && posicao < trajetorias.size()) {
            trajetorias.remove(posicao);
            return true;
        }
        return false;
    }

    public List<Trajetoria> listarTrajetorias() {
        return trajetorias;
    }
}
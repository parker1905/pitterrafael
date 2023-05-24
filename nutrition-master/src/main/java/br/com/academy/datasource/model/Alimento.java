package br.com.academy.datasource.model;

class Alimento {
    private int codigo;
    private String nome;
    private int calorias;
    private double porcao;
    private String infoNutricional;
    private String tipoDeAlimento;

    public Alimento(int codigo, String nome, int calorias, double porcao, String infoNutricional, String tipoDeAlimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.calorias = calorias;
        this.porcao = porcao;
        this.infoNutricional = infoNutricional;
        this.tipoDeAlimento = tipoDeAlimento;
    }

    // getters e setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getPorcao() {
        return porcao;
    }

    public void setPorcao(double porcao) {
        this.porcao = porcao;
    }

    public String getInfoNutricional() {
        return infoNutricional;
    }

    public void setInfoNutricional(String infoNutricional) {
        this.infoNutricional = infoNutricional;
    }

    public String getTipoDeAlimento() {
        return tipoDeAlimento;
    }

    public void setTipoDeAlimento(String tipoDeAlimento) {
        this.tipoDeAlimento = tipoDeAlimento;
    }
}


package br.com.academy.datasource.model;

import javax.persistence.Entity;

@Entity
public class Usuario extends Pessoa {
    private double latitude;
    private double longitude;
    private double peso;
    private short altura;
    private short imc;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getPeso() {
        return peso;
    }

    public short getAltura() {
        return altura;
    }

    public short getImc() {
        return imc;
    }
}
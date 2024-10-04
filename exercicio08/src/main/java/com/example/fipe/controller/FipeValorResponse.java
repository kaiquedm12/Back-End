package com.example.fipe.controller;

public class FipeValorResponse {
    private double valor;
    private String mes;

    public FipeValorResponse(double valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    // Getters
    public double getValor() { return valor; }
    public String getMes() { return mes; }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Punto2;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
    private String placa;
    private String tipo;
    private int horaLlegada;
    private int numeroIngreso;
    private int valor;

    public Vehiculo(String placa, String tipo, int horaLlegada, int numeroIngreso) {
        this.placa = placa;
        this.tipo = tipo;
        this.horaLlegada = horaLlegada;
        this.numeroIngreso = numeroIngreso;

        if (tipo.equalsIgnoreCase("carro")) {
            this.valor = 60;
        } else if (tipo.equalsIgnoreCase("moto")) {
            this.valor = 30;
        } else if (tipo.equalsIgnoreCase("bici")) {
            this.valor = 20;
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido.");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public int getHoraLlegada() {
        return horaLlegada;
    }

    public int getNumeroIngreso() {
        return numeroIngreso;
    }

    public int getValor() {
        return valor;
    }
}
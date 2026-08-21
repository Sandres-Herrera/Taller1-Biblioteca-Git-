/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author SANTIAGO HERRERA
 */
public class Cliente extends Persona {

    private int codigoCliente;
    private String telefono;

    public Cliente(String nombre, String identificacion, int codigoCliente, String telefono) {
        super(nombre, identificacion);
        this.codigoCliente = codigoCliente;
        this.telefono = telefono;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
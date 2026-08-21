/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca.git;

/**
 *
 * @author ESTUDIANTES
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
    }
    
    static void crearCliente() {
    System.out.print("Ingrese el nombre del cliente: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese la identificacion del cliente: ");
    String identificacion = sc.nextLine();

    System.out.print("Ingrese el codigo del cliente: ");
    int codigoCliente = Integer.parseInt(sc.nextLine());

    System.out.print("Ingrese el telefono del cliente: ");
    String telefono = sc.nextLine();

    Cliente cliente = new Cliente(
        nombre,
        identificacion,
        codigoCliente,
        telefono
    );

    clientes.add(cliente);

    System.out.println("Cliente creado correctamente.");
    }
    
    static void listarClientes() {
    if (clientes.isEmpty()) {
        System.out.println("No hay clientes registrados.");
        return;
    }

    for (Cliente cliente : clientes) {
        System.out.println("-------------------------");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Identificacion: " + cliente.getIdentificacion());
        System.out.println("Codigo: " + cliente.getCodigoCliente());
        System.out.println("Telefono: " + cliente.getTelefono());
    }

    System.out.println("-------------------------");
    }
    
    static void buscarCliente() {
    System.out.print("Ingrese la identificacion del cliente: ");
    String identificacion = sc.nextLine();

    for (Cliente cliente : clientes) {
        if (cliente.getIdentificacion().equals(identificacion)) {

            System.out.println("Cliente encontrado.");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Identificacion: " + cliente.getIdentificacion());
            System.out.println("Codigo: " + cliente.getCodigoCliente());
            System.out.println("Telefono: " + cliente.getTelefono());

            return;
        }
    }

    System.out.println("Cliente no encontrado.");
    }
}


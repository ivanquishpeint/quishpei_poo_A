/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Usuario
 */
public class Bicicleta {

    int numeroRin;
    String marca;
    double precio;
    int tamanio;
    String color;
    
    public Bicicleta(){    
    }

    public Bicicleta(int numeroRin, String marca, double precio, int tamanio, String color) {
        this.numeroRin = numeroRin;
        this.marca = marca;
        this.precio = precio;
        this.tamanio = tamanio;
        this.color = color;
    }
    

}

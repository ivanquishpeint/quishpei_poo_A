/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Punto;
import ec.edu.intsuperior.modelo.Bicicleta;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Autor;
/**
 *
 * @author QUISHPE IVAN
 */
public class Aplicacion {
    public static void main(String[] args) {
        Punto p1=new Punto(-1,7);
        Punto p2=new Punto();
        Bicicleta b1=new Bicicleta();
        Bicicleta b2=new Bicicleta(26,"especialized",520.50,60,"negra");
        Autor au1=new Autor("1234567890", "Soledad", "Flores", "Ingeniero", "1984-05-20");
        Libro l1=new Libro("La belleza en la programacion", "int", au1);
        Biblioteca biblio=new Biblioteca(34.0f, 55, l1, "Cayambe");
        
        System.out.println("cordenadas x de l punto 1: " + p1.getX());
        System.out.println("cordenadas y del punto 1: " + p1.getY());
        
        System.out.println("el autor del libro 1 es: "+l1.getAutor().getNombre());
        
    }
    
}

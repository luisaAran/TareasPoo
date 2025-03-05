/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clases;

/**
 *
 * @author Luisa Arango
 */
public class Estudiante {
    //Atributos Privados
    private String nombre;
    private int edad;
    private double nota;
    
    //Constructor para inicializar un estudiante con nombre, edad y nota
    public Estudiante(String nombre, int edad, double nota ){
        this.nombre =nombre;
        this.edad = edad;
        this.nota = nota;
    }
    //Metodos de acceso
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getNota(){
        return nota;
    }
    
    //Metodo para mostrar los datos del estudiante en texto
    @Override
    public String toString(){
        return "Nombre "+ nombre + "Edad "+ edad + "Nota ";
    } 
}

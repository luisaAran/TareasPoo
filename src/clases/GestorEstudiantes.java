/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author estuam
 */
/**
 *Clase que permite gestionar una lista de estudiantes, proporcionando métodos
 *para agregar estudiantes, obtener la lista completa y calcular el promedio de notas de dichos estudiantes
 */
public class GestorEstudiantes {
    
    /** 
     *Lista de estudiantes gestionada por la clase
     */
    private List<Estudiante> listaEstudiantes = new ArrayList<>();
    
    /**
     * Agrega un estudiante a la lista de estudiantes
     * 
     * @param e El estudiante a agregar
     */
    public void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }
    
    /**
     * Obtiene la lista completa de estudiantes
     * 
     * @return Lista de estudiantes
     */
    public List<Estudiante> obtenerListaEstudiantes() {
        return listaEstudiantes;
    }
    
    /**
     * Calcula el promedio de las notas de todos los estudiantes en la lista
     * 
     * @return Promedio de las notas o 0 si no hay estudiantes
     */
    public double calcularPromedioNotas() {
        if (listaEstudiantes.isEmpty()) {
            return 0; //retorna 0 si no hay estudiantes
        }
        double suma = 0;
        for (Estudiante e : listaEstudiantes) {
            suma += e.getNota();
        }
        return suma / listaEstudiantes.size();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejhashmap;

/**
 *
 * @author AlumnoT
 */
public class Horario {
    //Atributos de horario de un trabajador
    private String horaInicio;
    private String horaFin;
    
    //Constructor
    public Horario(String hI, String hF) {
        horaInicio = hI;
        horaFin = hF;
    }
    
    //Getters
    //Setters
    
    //Imprimir (para imprimir el horario)
    public String imprimir() {
        return horaInicio + " : " + horaFin;
    }
}

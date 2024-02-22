/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejhashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author AlumnoT
 */
public class EJHashMap {

    
    public static void main(String[] args) {
        //Ejercicio 2
        //Creamos el HashMap
        HashMap<Integer, ArrayList <Horario>> horariosEmpleados = new HashMap<>();
        
        //Creamos un ArrayList para el horario de empleado
        ArrayList<Horario> listaHorarios = new ArrayList<Horario>();
        
        //Asignar horarios de empleados
        asignarHorariosEmpleados(horariosEmpleados, 123456, "Jueves", "7:00", "16:00");
        asignarHorariosEmpleados(horariosEmpleados, 19795, "Jueves", "8:00", "15:00");
        
        //Horario de empelado en un dia especifico
        System.out.println("HORARIO DE UN EMPLEADO EL JUEVES: ");
        listaHorarios = consultarHorarioEmpleado(horariosEmpleados, 123456);
        for (Horario tmp : listaHorarios) {
            System.out.println(tmp.imprimir());
        }
        
        //Consultar el horario de todos los empleados un día específico
        System.out.println("HORARIO DE TODOS EL JUEVES: ");
        consultarHorarioUnDia(horariosEmpleados, "Jueves");
        
        //Mostrar horario completo de un empleado de una semana entera
        System.out.println("HORARIO COMPLETO DE UN EMPLEADO: ");
        mostrarHorarioCompleto(horariosEmpleados, 123456);
        
    }
    
    //Método para asignar horarios a los empleados
    static void asignarHorariosEmpleados (HashMap<Integer, ArrayList<Horario>> horarios, int idEmpleado, String dia, String hI, String hF) {
            //Llamamos al constructor de la clase horario > inicializar y declarar un objeto de tipo horario
            Horario horarioTMP = new Horario(hI, hF);
            
            //horarios.put(idEmpleado, lista.add(horarioTMP));
            horarios.computeIfAbsent(idEmpleado, k -> 
                    new ArrayList<>()).add(horarioTMP);
            
    }
    
    //Consultar solo el horario de un empleado en un día específico
    static ArrayList<Horario> consultarHorarioEmpleado(HashMap<Integer, ArrayList<Horario>> horariosMap, int idEmp) {
        return horariosMap.get(idEmp);
    }
    
    //Consultar horario de todos los empleados un día
    static void consultarHorarioUnDia(HashMap<Integer, ArrayList<Horario>> horariosMap, String dia) {
        //ArrayList<Horario> horarios = horarios.getOrDefault(idEmpleado, new ArrayList<>());
        horariosMap.forEach((id, horarios) -> {
            System.out.println("Empleado: nº" + id + " trabaja el " + dia +  " con horario: ");
            for (Horario tmp : horarios) {
                System.out.println(tmp);
            }
        });       
    }
    
    static void mostrarHorarioCompleto(HashMap<Integer, ArrayList<Horario>> horariosMap, int idEmp) {
        ArrayList<Horario> horariosTMP = horariosMap.get(idEmp);
        for (Horario horario : horariosTMP) {
            System.out.println(horario.imprimir());
        }
    }
}

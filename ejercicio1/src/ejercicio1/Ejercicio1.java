/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Date;

/**
 *
 * @author Pc
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1=new Persona();
        persona1.setId(1);
        persona1.setNombre("Nancy");
        persona1.setApellido("Pajaro Morales");
        Date fecha_nacimiento =new Date ("01/04/1968");
        persona1.setFecha_nacimiento(fecha_nacimiento);
        persona1.setEstado_civil("casada");
        System.out.println(persona1);
        
        Cargo cargo1 = new Cargo("Desarrollador","Desarrollador de Software");
        
        Empleado emp1=new Empleado();
        emp1.setCargo(cargo1);
        emp1.setId(2);
        emp1.setNombre("yessica");
        emp1.setApellido("espinosa");
        emp1.setEstado_civil("casada");
        emp1.setArp("positiva");
        emp1.setEps("comeeva");
        Date fecha_nacimiento1=new Date("18/08/1989");
        emp1.setFecha_nacimiento(fecha_nacimiento1);
        
      System.out.println(emp1.obtenerEdad());
      System.out.println(emp1);
        
      String texto="";
      String nombre=persona1.mostrarNombre(emp1);
      System.out.println(nombre);
        
    }
    
}

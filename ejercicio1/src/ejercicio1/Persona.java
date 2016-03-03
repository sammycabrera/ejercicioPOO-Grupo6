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
public class Persona {
    
    /* identificacion persona **/
    private int Id;
    
     /* nombre de  persona **/
    private String nombre;
    
     /* apellido de  persona **/
    private String apellido;
    
     /* estado civil  de  esa persona **/
    private String estado_civil;
    
    /* fecha de nacimiento  de   persona **/
    private Date fecha_nacimiento ;

    
    /*constructor por defecto*/
    
    public Persona() {
    }
    
    
    /*constructor con los atributos de persona*/

    public Persona(int Id, String nombre, String apellido, String estado_civil, Date fecha_nacimiento) {
        this.Id = Id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
    
    /* metodos para modificar */
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

  
    
    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    
    
    
    
    
    
      public long obtenerEdad(){
    
        Date hoy =new Date();
        long days=(hoy.getTime()-this.fecha_nacimiento.getTime())/(1000 *60 *60 * 24);
        
    return days/365;
      }

    @Override
    public String toString() {
        return "Persona{" + "Id=" + Id + ", nombre=" + nombre + ", apellido=" + apellido + ", estado_civil=" + estado_civil + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }
    
    
    
    
    
}

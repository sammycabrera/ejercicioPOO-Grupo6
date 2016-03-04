/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Pc
 */
public class Empleado  extends Persona{
    
    
    /* la Eps que esta afiliado el empleado*/
    private  String Eps;
    
    /* La aseguradora si le sucede un accidente laboral dicho empleado*/
    private String Arp;
    
    /*El cargo que desempeña el empleado*/
    private Cargo cargo ;
    
    
    
    /* El constructor por defecto o vacio*/

    public Empleado() {
    }

   /* public Empleado(String Eps) {
        this.Eps = Eps;
    }

    public Empleado(String Eps, String Arp) {
        this.Eps = Eps;
        this.Arp = Arp;
    }
    
    
    
    
    

    
    
    
    /* el constructor con los atributos que se deben llenar los datos a la hora de ingresar*/
    
    public Empleado(String Eps, String Arp, Cargo cargo) {
        this.Eps = Eps;
        this.Arp = Arp;
        this.cargo = cargo;
    }
     
    
    
    /* los metodos para modificar y capturar los datos*/
    
    public void setEps(String Eps) {
        this.Eps = Eps;
    }

    public void setArp(String Arp) {
        this.Arp = Arp;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getEps() {
        return Eps;
    }

    public String getArp() {
        return Arp;
    }

    public Cargo getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        
 
        return "Empleado:"+ " "+"id="+getId()+" "+"Nombre:"+getNombre()+" "+"Apellido:"+getApellido()+" "+"Fecha de Nacimiento:"+getFecha_nacimiento()+""+"Estado de civil"+getEstado_civil()+""+
                "Eps=" + Eps + ", Arp=" + Arp + ", cargo=" + cargo.getId_cargo();
    }

   
    
    
    
    
    
}

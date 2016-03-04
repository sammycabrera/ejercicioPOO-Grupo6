/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
public class Cargo {
    
    
    /* El id del cargo */
    private String IdCargo;
    
    
    /* descripcion del cargo */
    private String descripcion;

    public Cargo() {
    }

    public Cargo(String IdCargo, String descripcion) {
        this.IdCargo = IdCargo;
        this.descripcion = descripcion;
    }

    public void setIdCargo(String IdCargo) {
        this.IdCargo = IdCargo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdCargo() {
        return IdCargo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
    
    
    
    /* sobreescribir el metodo toString*/

    @Override
    public String toString() {
        return "Cargo{" + "IdCargo=" + IdCargo + ", descripcion=" + descripcion + '}';
    }
    
    
    
}

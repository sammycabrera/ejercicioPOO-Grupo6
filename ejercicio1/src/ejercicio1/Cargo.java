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
class Cargo {
    
    private String Id_cargo;
    private String descripcion;

    public Cargo() {
    }

    public Cargo(String Id_cargo, String descripcion) {
        this.Id_cargo = Id_cargo;
        this.descripcion = descripcion;
    }

    public void setId_cargo(String Id_cargo) {
        this.Id_cargo = Id_cargo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_cargo() {
        return Id_cargo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Cargo{" + "Id_cargo=" + Id_cargo + ", descripcion=" + descripcion + '}';
    }
    
    
    
}

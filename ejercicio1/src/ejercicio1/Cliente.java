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
public class Cliente {
    
    /* Numero telefonico del cliente */
    private String telefono;
    
    
    /* El correo electronico del cliente */
    private String email;

    
    
    
    public Cliente() {
    }

    public Cliente(String telefono, String email) {
        this.telefono = telefono;
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    
    
}

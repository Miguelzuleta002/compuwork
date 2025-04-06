/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork;

import java.util.Date;

/**
 *
 * @author migue
 */
public class Empleado {
    
    private int id; 
    private String nombre;
    private String apellido; 
    private String email; 
    private Date fechaContratacion;
    
    // Constructor 
    public Empleado(int id, String nombre, String apellido, String email, Date fechaContratacion) {

        this.id = id;

        this.nombre = nombre;

        this.apellido = apellido;

        this.email = email;

        this.fechaContratacion = fechaContratacion;

    }
   
      // Getters y Setters 
    public int getId() { return id; }

    public String getNombre() { return nombre; } 

    public String getApellido() { return apellido; } 

    public String getEmail() { return email; } 

    public Date getFechaContratacion() { return fechaContratacion; }
    
    public void setId(int id) {
    this.id = id;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public void setEmail(String email) {
    this.email = email;
}

public void getfechaContratacion(Date fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
}



    //Métodos CRUD
    public boolean crearEmpleado() { return true; }
    public boolean actualizarEmpleado(Empleado empleado) { return true; }
    public boolean eliminarEmpleado(Empleado empleado) { return true; }
    public Empleado obtenerInformacion() { return this; }
 
    
}

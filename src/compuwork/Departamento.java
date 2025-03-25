/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork;

/**
 *
 * @author migue
 */
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    private String nombre;
    private String ubicacion;
    private double presupuesto;
    private final List<Empleado> empleados;

    public Departamento(int id, String nombre, String ubicacion, double presupuesto) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.empleados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public boolean crearDepartamento() {
        return true;
    }

    public boolean actualizarDepartamento() {
        return true;
    }

    public boolean eliminarDepartamento() {
        return true;
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    public boolean asignarPresupuesto(double nuevoPresupuesto) {
        this.presupuesto = nuevoPresupuesto;
        return true;
    }

    
}

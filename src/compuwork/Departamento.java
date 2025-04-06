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
//Getters y Setters
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

    public void setPresupuesto(double presupuesto) throws Exception {
        if (presupuesto < 0) {
            throw new Exception("El presupuesto no puede ser negativo.");
        }
        this.presupuesto = presupuesto;
    }

    //Crear Departamento
    public boolean crearDepartamento() {
        return true;
    }
    
    //Acualizar Departamento
    public boolean actualizarDepartamento() {
        return true;
    }
    
    //Eliminar Departamento
    public boolean eliminarDepartamento() {
        return true;
    }

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) throws Exception {
        if (empleado == null) {
            throw new Exception("El empleado no puede ser nulo.");
        }
        if (empleados.contains(empleado)) {
            throw new Exception("El empleado ya está asignado a este departamento.");
        }
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) throws Exception {
        if (empleado == null) {
            throw new Exception("El empleado no puede ser nulo.");
        }
        if (!empleados.contains(empleado)) {
            throw new Exception("El empleado no pertenece a este departamento.");
        }
        empleados.remove(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados en el departamento " + nombre + ":");
        for (Empleado emp : empleados) {
            System.out.println("- " + emp.getNombre());
        }
    }
    
}

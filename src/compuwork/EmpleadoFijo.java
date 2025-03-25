/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author migue
 */
public class EmpleadoFijo extends Empleado {

    // Atributos
    private double salarioBase;
    private List<String> beneficios;
    private double bonificacion;

    // Constructor corregido
    public EmpleadoFijo(int id, String nombre, String apellido, String email, Date fechaContratacion, double salarioBase) {
        super(id, nombre, apellido, email, fechaContratacion);
        this.salarioBase = salarioBase; // Asignación correcta
        this.beneficios = new ArrayList<>();
        this.bonificacion = 0.0;
    }

    // Getter y Setter para salarioBase
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    public List<String> getBeneficios() {
        return new ArrayList<>(beneficios); // Copia defensiva
    }

    public void setBeneficios(List<String> beneficios) {
        this.beneficios = new ArrayList<>(beneficios); // Copia defensiva
    }

    // Getter y Setter 
    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
    
       public double calcularSalario() { 

        return salarioBase + calcularBonificacion();

    } 

  

    public void agregarBeneficio(String beneficio) { 

        beneficios.add(beneficio); 

    } 

  

    public double calcularBono(double bonoAnual) { 

        // Lógica para calcular bono 

        return bonoAnual; 

    } 

    private double calcularBonificacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
 
    
}

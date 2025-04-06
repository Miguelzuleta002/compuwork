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

//Getter y Setter para salarioBase
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            throw new IllegalArgumentException("El salario base no puede ser negativo.");
        }
        this.salarioBase = salarioBase;
    }

    // Getter y Setter para beneficios
    public List<String> getBeneficios() {
        return new ArrayList<>(beneficios); // Copia defensiva
    }

    public void setBeneficios(List<String> beneficios) {
        if (beneficios == null) {
            throw new IllegalArgumentException("La lista de beneficios no puede ser nula.");
        }
        this.beneficios = new ArrayList<>(beneficios); // Copia defensiva
    }

    // Getter y Setter para bonificacion
    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        if (bonificacion < 0) {
            throw new IllegalArgumentException("La bonificación no puede ser negativa.");
        }
        this.bonificacion = bonificacion;
    }

    // Método para calcular el salario total
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }

    // Método para agregar un beneficio
    public void agregarBeneficio(String beneficio) {
        if (beneficio == null || beneficio.isEmpty()) {
            throw new IllegalArgumentException("El beneficio no puede ser nulo o vacío.");
        }
        beneficios.add(beneficio);
    }

    // Método para calcular el bono anual
    public double calcularBono(double bonoAnual) {
        if (bonoAnual < 0) {
            throw new IllegalArgumentException("El bono anual no puede ser negativo.");
        }
        return bonoAnual;
    }

    // Método privado para calcular bonificación adicional (puede personalizarse según lógica de negocio)
    private double calcularBonificacion() {
        return bonificacion * 0.1; // Ejemplo: 10% de la bonificación como extra
    }
}

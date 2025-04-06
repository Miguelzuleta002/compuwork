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
public class EmpleadoTemporal extends Empleado {
    //Atributos
    private double tarifaHora; 
    private Date fechaFinContrato; 
    private int horasTrabajadas; 

    //Constructor
    public EmpleadoTemporal(int id, String nombre, String apellido, String email, Date fechaContratacion, 
                            double tarifaHora, Date fechaFinContrato, int horasTrabajadas) {
        super(id, nombre, apellido, email, fechaContratacion);
        if (tarifaHora < 0) {
            throw new IllegalArgumentException("La tarifa por hora no puede ser negativa.");
        }
        if (fechaFinContrato.before(fechaContratacion)) {
            throw new IllegalArgumentException("La fecha de fin de contrato no puede ser anterior a la fecha de contratación.");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }

        this.tarifaHora = tarifaHora;
        this.fechaFinContrato = fechaFinContrato;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Get y Set
    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        if (tarifaHora < 0) {
            throw new IllegalArgumentException("La tarifa por hora no puede ser negativa.");
        }
        this.tarifaHora = tarifaHora;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        if (fechaFinContrato.before(new Date())) {
            throw new IllegalArgumentException("La nueva fecha de fin de contrato no puede ser anterior a hoy.");
        }
        this.fechaFinContrato = fechaFinContrato;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        this.horasTrabajadas = horasTrabajadas;
    }

    // Métodos
    public double calcularSalario() {
        if (tarifaHora <= 0 || horasTrabajadas <= 0) {
            throw new IllegalStateException("La tarifa por hora y las horas trabajadas deben ser mayores que cero.");
        }
        return tarifaHora * horasTrabajadas;
    }

    public boolean extenderContrato(Date nuevaFecha) {
        if (nuevaFecha.after(fechaFinContrato)) { // Verifica que la nueva fecha sea posterior
            this.fechaFinContrato = nuevaFecha;
            return true;
        }
        throw new IllegalArgumentException("La nueva fecha de fin de contrato debe ser posterior a la actual.");
    }

    public void registrarHoras(int horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas registradas deben ser mayores que cero.");
        }
        this.horasTrabajadas += horas;
    }
}

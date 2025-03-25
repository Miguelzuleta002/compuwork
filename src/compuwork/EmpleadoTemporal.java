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
        this.tarifaHora = tarifaHora; 
        this.fechaFinContrato = fechaFinContrato;
        this.horasTrabajadas = horasTrabajadas;
    }

  
   


    //Get y set
    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
//Metodos
    public double calcularSalario() { 
        return tarifaHora * horasTrabajadas; 
    } 

    public boolean extenderContrato(Date nuevaFecha) { 
        if (nuevaFecha.after(fechaFinContrato)) { // Verifica que la nueva fecha sea posterior
            this.fechaFinContrato = nuevaFecha;
            return true;
        }
        return false;
    } 

    public void registrarHoras(int horas) { 
        if (horas > 0) {
            this.horasTrabajadas += horas;
        }
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork;

/**
 *
 * @author migue
 */
import java.util.Date;
import java.util.List;

public class ReporteDesempeño {
    private final int id;
    private Date fecha;
    private double calificacion;

    public ReporteDesempeño(int id, Date fecha, double calificacion) {
        this.id = id;
        this.fecha = fecha;
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void generarReporteIndividual() {
        System.out.println("Reporte Individual - ID: " + id + ", Fecha: " + fecha + ", Calificación: " + calificacion);
    }

    public void generarReporteDpto(List<Empleado> empleados) {
        System.out.println("Reporte Departamento - Total Empleados: " + empleados.size());
    }

    public static double calcularPromedio(List<ReporteDesempeño> reportes) {
        return reportes.stream().mapToDouble(ReporteDesempeño::getCalificacion).average().orElse(0.0);
    }


}

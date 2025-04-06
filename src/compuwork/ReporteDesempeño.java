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
    private int id;
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

    /**
     * Genera un reporte individual de un empleado con validación.
     * @param empleado El empleado para el cual se genera el reporte.
     * @throws Exception Si el empleado es nulo.
     */
    public void generarReporteIndividual(Empleado empleado) throws Exception {
        if (empleado == null) {
            throw new Exception("Error: No se puede generar el reporte porque el empleado es nulo.");
        }
        System.out.println("Reporte Individual - ID: " + id + ", Fecha: " + fecha + ", Calificación: " + calificacion);
    }

    /**
     * Genera un reporte de departamento con validación.
     * @param empleados Lista de empleados del departamento.
     * @throws Exception Si la lista de empleados es nula o está vacía.
     */
    public void generarReporteDpto(List<Empleado> empleados) throws Exception {
        if (empleados == null || empleados.isEmpty()) {
            throw new Exception("Error: No se puede generar el reporte porque el departamento no tiene empleados.");
        }
        System.out.println("Reporte Departamento - Total Empleados: " + empleados.size());
    }

    /**
     * Calcula el promedio de calificaciones de una lista de reportes.
     * @param reportes Lista de reportes de desempeño.
     * @return El promedio de las calificaciones.
     * @throws Exception Si la lista de reportes es nula o está vacía.
     */
    public static double calcularPromedio(List<ReporteDesempeño> reportes) throws Exception {
        if (reportes == null || reportes.isEmpty()) {
            throw new Exception("Error: No se puede calcular el promedio porque la lista de reportes está vacía.");
        }
        return reportes.stream().mapToDouble(ReporteDesempeño::getCalificacion).average().orElse(0.0);
    }
}

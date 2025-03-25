/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compuwork;

import java.util.Date;
import java.util.List;

/**
 *
 * @author migue
 */


    /**
     * @param args the command line arguments
     */
 
    import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear fechas de ejemplo
        Date fechaContratacion = new Date(); // Fecha actual
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(fechaContratacion);
        calendario.add(Calendar.MONTH, 6);
        Date fechaFinContrato = calendario.getTime();

        // ------ Ejemplo con Empleado Fijo ------
        EmpleadoFijo empleadoFijo = new EmpleadoFijo(
            1, 
            "María", 
            "López", 
            "maria@empresa.com", 
            fechaContratacion, 
            3000.0
        );
        empleadoFijo.setBonificacion(500.0); // Asignar bonificación
        empleadoFijo.agregarBeneficio("Seguro médico");
        empleadoFijo.agregarBeneficio("Gimnasio gratuito");

        System.out.println("\n--- Empleado Fijo ---");
        System.out.println("Salario total: $" + empleadoFijo.calcularSalario());
        System.out.println("Beneficios: " + empleadoFijo.getBeneficios());

        // ------ Ejemplo con Empleado Temporal ------
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal(
            2, 
            "Carlos", 
            "Martínez", 
            "carlos@empresa.com", 
            fechaContratacion, 
            20.0, 
            fechaFinContrato, 
            80
        );
        empleadoTemporal.registrarHoras(40); // Registrar horas extras

        // Intentar extender el contrato
        calendario.add(Calendar.MONTH, 2);
        Date nuevaFechaFin = calendario.getTime();
        boolean extensionExitosa = empleadoTemporal.extenderContrato(nuevaFechaFin);

        System.out.println("\n--- Empleado Temporal ---");
        System.out.println("Horas trabajadas: " + empleadoTemporal.getHorasTrabajadas());
        System.out.println("Salario calculado: $" + empleadoTemporal.calcularSalario());
        System.out.println("Extensión de contrato: " + (extensionExitosa ? "Éxito" : "Falló"));

        // ------ Reportes de Desempeño ------
        ReporteDesempeño reporte1 = new ReporteDesempeño(1, new Date(), 4.2);
        ReporteDesempeño reporte2 = new ReporteDesempeño(2, new Date(), 4.8);

        List<ReporteDesempeño> reportes = new ArrayList<>();
        reportes.add(reporte1);
        reportes.add(reporte2);

        System.out.println("\n--- Reportes ---");
        reporte1.generarReporteIndividual();
        reporte1.generarReporteDpto(Arrays.asList(empleadoFijo, empleadoTemporal));
        System.out.println("Promedio de calificaciones: " + ReporteDesempeño.calcularPromedio(reportes));
    }
}
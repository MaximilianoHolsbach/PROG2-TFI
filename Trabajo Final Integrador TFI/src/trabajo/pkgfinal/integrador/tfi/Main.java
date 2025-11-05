package trabajo.pkgfinal.integrador.tfi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Paciente> listaPacientes = new ArrayList<>();

        // Crear historias clínicas
        HistoriaClinica hc1 = new HistoriaClinica("HC001", "Sin antecedentes", "Ninguna", "Paciente estable");
        HistoriaClinica hc2 = new HistoriaClinica("HC002", "Alergia leve", "Ibuprofeno", "Control anual recomendado");

        // Crear pacientes (grupoSanguineo ahora en Paciente)
        Paciente p1 = new Paciente("Ana", "Pérez", "12345678", "A+", LocalDate.of(1990, 5, 20), hc1);
        Paciente p2 = new Paciente("Juan", "Gómez", "87654321", "O-", LocalDate.of(1985, 10, 10), hc2);
        Paciente p3 = new Paciente("Lucía", "Martínez", "11223344", "B+", LocalDate.of(2000, 2, 15), hc1);

        // Agregar a la lista
        listaPacientes.add(p1);
        listaPacientes.add(p2);
        listaPacientes.add(p3);

        // Mostrar pacientes
        System.out.println("Pacientes ingresados:");
        listaPacientes.forEach(System.out::println);

        // Marcar uno como eliminado
        p2.eliminar();

        System.out.println("\nDespués de marcar eliminado:");
        listaPacientes.forEach(System.out::println);
    }
}

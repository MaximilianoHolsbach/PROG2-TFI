package trabajo.pkgfinal.integrador.tfi;

import java.time.LocalDate;

public class Paciente {
    private static Long contador = 0L;
    private Long id;
    private boolean eliminado;
    private String nombre;
    private String apellido;
    private String dni;
    private String grupoSanguineo;
    private LocalDate fechaNacimiento;
    private HistoriaClinica historiaClinica;
    
    // Constructor vacío
    public Paciente() {
        contador++;
        this.id = contador;
        this.eliminado = false;
    }

    // Constructor principal (sin campo eliminado, por defecto false)
    public Paciente(String nombre, String apellido, String dni, String grupoSanguineo, LocalDate fechaNacimiento, HistoriaClinica historiaClinica) {
        contador++;
        this.id = contador;
        this.eliminado = false;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.historiaClinica = historiaClinica;
    }

    // Constructor que recibe eliminado explícitamente (si lo necesitás)
    public Paciente(boolean eliminado, String nombre, String apellido, String dni, String grupoSanguineo, LocalDate fechaNacimiento, HistoriaClinica historiaClinica) {
        contador++;
        this.id = contador;
        this.eliminado = eliminado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.historiaClinica = historiaClinica;
    }

    // Getters / Setters
    public Long getId() { return id; }

    public boolean isEliminado() { return eliminado; }
    public void setEliminado(boolean eliminado) { this.eliminado = eliminado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getGrupoSanguineo() { return grupoSanguineo; }
    public void setGrupoSanguineo(String grupoSanguineo) { this.grupoSanguineo = grupoSanguineo; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public HistoriaClinica getHistoriaClinica() { return historiaClinica; }
    public void setHistoriaClinica(HistoriaClinica historiaClinica) { this.historiaClinica = historiaClinica; }

    // Marcar como eliminado
    public void eliminar() { this.eliminado = true; }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", historiaClinica=" + (historiaClinica != null ? historiaClinica.getNroHistoria() : "sin historia") +
                ", eliminado=" + eliminado +
                '}';
    }
}

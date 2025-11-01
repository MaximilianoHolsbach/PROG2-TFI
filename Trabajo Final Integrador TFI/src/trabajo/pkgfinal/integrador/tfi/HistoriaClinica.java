/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.pkgfinal.integrador.tfi;

public class HistoriaClinica {
    private static Long contador = 0L;
    private Long id;
    private boolean eliminado; 
    private String nroHistoria;
    private String antecedentes;
    private String medicacionActual;
    private String observaciones;
    
    // Constructor vacío
    public HistoriaClinica() {
        contador++;
        this.id = contador;
        this.eliminado = false;
    }

    // Constructor principal (sin grupo sanguíneo, ya que lo moviste a Paciente)
    public HistoriaClinica(String nroHistoria, String antecedentes, String medicacionActual, String observaciones) {
        contador++;
        this.id = contador;
        this.eliminado = false;
        this.nroHistoria = nroHistoria;
        this.antecedentes = antecedentes;
        this.medicacionActual = medicacionActual;
        this.observaciones = observaciones;
    }

    // Getters / Setters
    public Long getId() { return id; }

    public boolean isEliminado() { return eliminado; }
    public void setEliminado(boolean eliminado) { this.eliminado = eliminado; }

    public String getNroHistoria() { return nroHistoria; }
    public void setNroHistoria(String nroHistoria) { this.nroHistoria = nroHistoria; }

    public String getAntecedentes() { return antecedentes; }
    public void setAntecedentes(String antecedentes) { this.antecedentes = antecedentes; }

    public String getMedicacionActual() { return medicacionActual; }
    public void setMedicacionActual(String medicacionActual) { this.medicacionActual = medicacionActual; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    @Override
    public String toString() {
        return "HistoriaClinica{" +
                "id=" + id +
                ", nroHistoria='" + nroHistoria + '\'' +
                ", antecedentes='" + antecedentes + '\'' +
                ", medicacionActual='" + medicacionActual + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", eliminado=" + eliminado +
                '}';
    }
}

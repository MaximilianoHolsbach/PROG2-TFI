/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.pkgfinal.integrador.tfi;

/**
 *
 * @author Maxi
 */
public class HistoriaClinica {
    private Long id;
    private boolean eliminado; 
    private String nroHistoria;
    private String grupoSanguineo;
    private String antecedentes;
    private String medicacionActual;
    private String observaciones;
    
    public HistoriaClinica() {
    }

    public HistoriaClinica(Long id, boolean eliminado, String nroHistoria, String grupoSanguineo, String antecedentes, String medicacionActual, String observaciones) {
        this.id = id;
        this.eliminado = eliminado;
        this.nroHistoria = nroHistoria;
        this.grupoSanguineo = grupoSanguineo;
        this.antecedentes = antecedentes;
        this.medicacionActual = medicacionActual;
        this.observaciones = observaciones;
    }

        public Long getId() {
        return id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public String getNroHistoria() {
        return nroHistoria;
    }

    public void setNroHistoria(String nroHistoria) {
        this.nroHistoria = nroHistoria;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getMedicacionActual() {
        return medicacionActual;
    }

    public void setMedicacionActual(String medicacionActual) {
        this.medicacionActual = medicacionActual;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "HistoriaClinica{" + "id=" + id + ", eliminado=" + eliminado + ", nroHistoria=" + nroHistoria + ", grupoSanguineo=" + grupoSanguineo + ", medicacionActual=" + medicacionActual + ", observaciones=" + observaciones + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhospital;

import java.util.List;

public class ExpedienteMedico {
    private List<Diagnostico> diagnosticos;
    private List<Tratamiento> tratamientos;
    private List<Prescripcion> prescripciones;

    public List<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public List<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public List<Prescripcion> getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(List<Prescripcion> prescripciones) {
        this.prescripciones = prescripciones;
    }

    public void agregarDiagnostico(Diagnostico diagnostico) {
        // Implementación
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        // Implementación
    }

    public void agregarPrescripcion(Prescripcion prescripcion) {
        // Implementación
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhospital;

import java.util.Date;
import java.time.LocalTime;

public class Cita {
    private Date fecha;
    private LocalTime hora;
    private Medico medico;
    private Paciente paciente;
    private ESTADO_CITA estado;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ESTADO_CITA getEstado() {
        return estado;
    }

    public void setEstado(ESTADO_CITA estado) {
        this.estado = estado;
    }

    public void confirmarCita() {
        // Implementación de la confirmación de la cita
        this.estado = ESTADO_CITA.REALIZADA;
    }

    public void cancelarCita() {
        // Implementación de la cancelación de la cita
        this.estado = ESTADO_CITA.CANCELADA;
    }
}

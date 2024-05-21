/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhospital;

import java.util.List;

public class Horario {
    private List<String> dias;
    private List<Time> horas;

    public List<String> getDias() {
        return dias;
    }

    public void setDias(List<String> dias) {
        this.dias = dias;
    }

    public List<Time> getHoras() {
        return horas;
    }

    public void setHoras(List<Time> horas) {
        this.horas = horas;
    }
}

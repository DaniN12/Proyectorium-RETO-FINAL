/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorium.crud.entities;

/**
 *
 * @author 2dam
 */
public enum MovieHour {
    HOUR_16("16:00"),
    HOUR_18("18:00"),
    HOUR_20("20:00"),
    HOUR_22("22:00");

    private final String hour;

    MovieHour(String hour) {
        this.hour = hour;
    }

    public String getHour() {
        return hour;
    }
}

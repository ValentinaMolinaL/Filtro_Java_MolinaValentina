/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filtro_java_molina_valentina.model;

/**
 *
 * @author Uniminuto Tibu
 */
public class Habilidad {
    private String nombreMision;
    private String descripcion;

    public Habilidad() {
    }

    public Habilidad(String nombreMision, String descripcion) {
        this.nombreMision = nombreMision;
        this.descripcion = descripcion;
    }

    public String getNombreMision() {
        return nombreMision;
    }

    public void setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

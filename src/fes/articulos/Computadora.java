/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.articulos;

import fes.articulos.factory.Articulo;

/**
 *
 * @author richi
 */
public class Computadora implements Articulo{
    String almacenamiento;
    String nombreProcesador;
    String sistemaOperativo;

    public Computadora() {
    }

    public Computadora(String almacenamiento, String nombreProcesador, String sistemaOperativo) {
        this.almacenamiento = almacenamiento;
        this.nombreProcesador = nombreProcesador;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getNombreProcesador() {
        return nombreProcesador;
    }

    public void setNombreProcesador(String nombreProcesador) {
        this.nombreProcesador = nombreProcesador;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
}

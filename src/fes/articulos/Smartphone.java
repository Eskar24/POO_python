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
public class Smartphone implements Articulo{
    String marca;
    String almacenamiento;
    String color;
    String tamaloPantalla;
    String megapixeles;

    public Smartphone() {
    }

    public Smartphone(String marca, String almacenamiento, String color, String tamaloPantalla, String megapixeles) {
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.color = color;
        this.tamaloPantalla = tamaloPantalla;
        this.megapixeles = megapixeles;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaloPantalla() {
        return tamaloPantalla;
    }

    public void setTamaloPantalla(String tamaloPantalla) {
        this.tamaloPantalla = tamaloPantalla;
    }

    public String getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(String megapixeles) {
        this.megapixeles = megapixeles;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", almacenamiento=" + almacenamiento + ", color=" + color + ", tamaloPantalla=" + tamaloPantalla + ", megapixeles=" + megapixeles + '}';
    }
    
    
            
}

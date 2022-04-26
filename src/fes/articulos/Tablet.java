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
public class Tablet implements Articulo{
    String marca;
    String color;
    String almacenamiento;
    String megapixeles;
    String tamañoPantalla;

    public Tablet(){
    }

    public Tablet(String marca, String color, String almacenamiento, String megapixeles, String tamañoPantalla) {
        this.marca = marca;
        this.color = color;
        this.almacenamiento = almacenamiento;
        this.megapixeles = megapixeles;
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMegapixeles() {
        return megapixeles;
    }

    public void setMegapixeles(String megapixeles) {
        this.megapixeles = megapixeles;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ", color=" + color + ", almacenamiento=" + almacenamiento + ", megapixeles=" + megapixeles + ", tama\u00f1oPantalla=" + tamañoPantalla + '}';
    }
    
    
}

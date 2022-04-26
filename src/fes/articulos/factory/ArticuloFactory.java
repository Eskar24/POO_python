/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.articulos.factory;

import fes.articulos.Computadora;
import fes.articulos.Smartphone;
import fes.articulos.Tablet;

/**
 *
 * @author richi
 */
public class ArticuloFactory {
        public static Articulo creatArticulo(int tipo){
        switch (tipo) {
            case Articulo.IPHONE12:
                return new Smartphone("Apple", "128gb", "Rojo", "6.1 pulgadas", "24MP");
            case Articulo.MOTO_G:
                return new Smartphone("Motorola", "32gb", "Blanco", "5.4 pulgadas", "12MP");
            case Articulo.XIAOMI_REDMI_NOTE_11:
                return new Smartphone("XIAOMI", "64gb", "Morado", "4.5 pulgadas", "12MP");
            case Articulo.HUAWEI_MEDIA_PAD_M1:
                return new Tablet("HUAWEI", "NEGRO", "128gb", "12MP", "8.5 pulgadas");
            case Articulo.SAMSUNG_TAB_37:
                return new Tablet("SAMSUNG", "BLANCO", "64gb", "13MP", "9 pulgadas");
            case Articulo.IPAD_PRO11:
                return new Tablet("Apple", "Morado", "128gb", "12MP", "10 pulgadas");
            case Articulo.APPLE_II:
                return new Computadora("500gb", "Chip M1", "MacOs");
            case Articulo.IBM_XT_286:
                return new Computadora("128kb", "Intel 8088", "Windows96");
            case Articulo.TOSHIBA_T1100:
                return new Computadora("512kb", "Intel 8088", "MS-DOS");
            default:
                throw new AssertionError();
               
        }
    }
}

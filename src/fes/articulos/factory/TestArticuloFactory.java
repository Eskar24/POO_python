/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.articulos.factory;

import java.util.Scanner;

/**
 *
 * @author richi
 */
public class TestArticuloFactory {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿Que articulo deseas ver sus caracteristicas?:");
        System.out.println(Articulo.IPHONE12 + ") IPHONE12");
        System.out.println(Articulo.MOTO_G + ") MOTO_G");
        System.out.println(Articulo.XIAOMI_REDMI_NOTE_11 + ") XIAOMI_REDMI_NOTE_11");
        System.out.println(Articulo.HUAWEI_MEDIA_PAD_M1 + ") HUAWEI_MEDIA_PAD_M1");
        System.out.println(Articulo.SAMSUNG_TAB_37 + ") SAMSUNG_TAB_37");
        System.out.println(Articulo.IPAD_PRO11 + ") IPAD_PRO11");
        System.out.println(Articulo.IBM_XT_286 + ") IBM_XT_286");
        System.out.println(Articulo.TOSHIBA_T1100 + ") TOSHIBA_T1100");
        
        try {
            System.out.print("Elige el numero:");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
        }
        
        Articulo producto = ArticuloFactory.creatArticulo(eleccion);
        System.out.println(producto.toString());
    }
    }


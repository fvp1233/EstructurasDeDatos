package org.Ejercicio4;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        mostrarPrecios();
    }

    public static void mostrarPrecios(){
        TreeMap <String, Integer> precios = new TreeMap<>();

        precios.put(" computadora ",1000);
        precios.put( " mouse ", 30);
        precios.put(" teclado ", 25);
        precios.put( " monitor ", 200);

        System.out.println("Los productos y sus precios son: " + precios);

        System.out.println("El producto mas antiguo es: " + precios.firstEntry());
        System.out.println("El producto mas reciente es: " + precios.lastEntry());
        System.out.println("Valor de una computadora es de:  " + precios.get(" computadora "));
    }
}
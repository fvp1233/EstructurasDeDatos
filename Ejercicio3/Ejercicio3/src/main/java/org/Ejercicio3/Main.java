package org.Ejercicio3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        mostrarPalabras();
    }

    public static void mostrarPalabras() {
        Set<String> palabras = new HashSet<>();
        palabras.add("hola");
        palabras.add("mundo");
        palabras.add("hola");
        palabras.add("java");

        for (String palabra : palabras){
            System.out.println("Palabra única en mayúscula: " + palabra.toUpperCase());
        }



    }
}
package org.Ejercicio4;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
    mostrarTemperaturas();
    }

    public static void mostrarTemperaturas(){
        TreeMap <String, Integer> temperaturaCiudad = new TreeMap<>();

        temperaturaCiudad.put(" Vancuber ",-12);
        temperaturaCiudad.put( " San Salvador ", 35);
        temperaturaCiudad.put(" California ", 18);
        temperaturaCiudad.put( " Apopa ", 200);

        System.out.println("La temperautra en gradios celcius en las siguientes ciudades es de : " + temperaturaCiudad);

        System.out.println("La ciudad mas caliente es: " + temperaturaCiudad.firstEntry());
        System.out.println("La ciudad mas fria es: " + temperaturaCiudad.lastEntry());



    }
}
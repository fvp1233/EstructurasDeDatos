package org.Ejercicio6;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        mostrarJugaodres();
    }

    public static void mostrarJugaodres() {
        TreeMap<String, Integer> ranking = new TreeMap<>();

        ranking.put(" Van Dijk ",89);
        ranking.put( " Cristiano Ronaldo ", 86);
        ranking.put(" Mbappé ", 91);
        ranking.put( " Messi ", 88);
        ranking.put( "Raphinha", 84);

        System.out.println("Los Jugadores y sus puntajes son: " + ranking);

        System.out.println("El jugador con mas puntaje es: " + ranking.firstEntry());
        System.out.println("El jugador con menos puntaje es: " + ranking.lastEntry());


    }
}
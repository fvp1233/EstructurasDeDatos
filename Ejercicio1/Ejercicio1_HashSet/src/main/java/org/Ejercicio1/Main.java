package org.Ejercicio1;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    Usuarios();

    }

    public  static void Usuarios() {
        Set<String> usuarios = new HashSet<>();

        usuarios.add("Daniela Villalta");
        usuarios.add(("Jorge Pérez"));
        usuarios.add("Astrid Murgas");
        usuarios.add("Herbert Cortéz");
        usuarios.add("Josue Guinea");

        System.out.println("Los usuarios son: " + usuarios);
        System.out.println("Se encuentra 'Josue Guinea en los usuarios?' " + usuarios.contains("Josue Guinea") );
    }


}
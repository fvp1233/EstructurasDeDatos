package org.Ejercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Escaneo();
    }

    public static void Escaneo(){
        Set<String> asistentes = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Ingresar un código");
            System.out.println("2. Mostrar los códigos");
            System.out.println("3. Salir");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Ingrese su código");
                    String asistenteInv = sc.nextLine();
                    if ((asistentes.contains(asistenteInv))){
                        System.out.println("Código existente ingrese otro");
                    } else {
                        asistentes.add(asistenteInv);
                    }
                    break;
                case 2:
                    System.out.println(asistentes);
                    break;
                case 3:
                    System.out.println("Saliendo ...");
                    break;
            }

        } while (opc<3);



    }


}



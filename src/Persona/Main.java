package Persona;

import java.util.Scanner;

public class Main {


    public static void hacerPersona(){

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona Carmen = new Persona("Carmen", 18, "2893462934D", "O", 60, 1.60f);
        Persona Jesus = new Persona("Jesús", 19, "23807465040f", "H", 72, 1.80f);

        System.out.println("\nVamos a ver los datos de la primera persona");
        System.out.println(Carmen.saberPesoIdeal());
        Carmen.pintarPeso();
        Carmen.mayorEdad();

        System.out.println("\nAhora vamos a ver los datos de la segunda persona");
        System.out.println(Jesus.saberPesoIdeal());
        Jesus.pintarPeso();
        Jesus.mayorEdad();

        System.out.println("\nAhora vamos a oredenarlas alfabeticamente");

        if (Carmen.compareToNombres(Jesus)<0){
            System.out.println(Carmen);
            System.out.println(Jesus);
        }else {
            System.out.println(Jesus);
            System.out.println(Carmen);
        }

        String respuesta = null;


        do {
            System.out.println("Introduzca los datos de las persona que quiere crear");
            System.out.println("¿Cómo se llama?");


        } while (respuesta == "s");



        int opc;
        System.out.println("Elige la acción que quieres realizar");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("1. Calcular el peso medio de las personas");
                break;
            case 2:
                System.out.println("2. Calcular la altura media de las personas");
                break;
            case 3:
                System.out.println("3. Calcular la edad media de las personas");
                break;
            default:
                System.out.println("4. Salir del programa");
                break;
        }


    }
}

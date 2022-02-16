package Persona;

import java.util.Scanner;

public class Main {


    public static void hacerPersona(){

    }
    public static void main(String[] args) {

        menu();
        /**
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

        if (Carmen.compareTo (Jesus)<0){
            System.out.println(Carmen);
            System.out.println(Jesus);
        }else {
            System.out.println(Jesus);
            System.out.println(Carmen);
        }


**/
    }

    public static catalogoPersonas miPersona;
    public static Scanner teclado;

    public static void menu() {

        miPersona = new catalogoPersonas();

        teclado = new Scanner(System.in);

        String opc;

        do {
            System.out.println("1.-Introducir Astros");
            System.out.println("2.-Visualizar Personas");
            System.out.println("3.-Media peso");
            System.out.println("4.-Media altura");
            System.out.println("5.-Media edad");
            System.out.println("Presione FIN para Salir");
            opc = teclado.nextLine();

            //opc=opc.toUpperCase();

            switch (opc) {
                case "1":
                    introduce_datos();
                    break;
                case "2":
                    visualiza_personas();
                    break;
               /** case "3":
                    media_peso();
                    break;
                case "4":
                    media_altura();
                    break;
                case "5":
                    media_edad();
                    break;
                **/
            }

        } while (!opc.equals("FIN"));
        //teclado.nextLine();
    }

    private static void introduce_datos() {

        try{
            System.out.println("Ingrese nombre");
            String nombre=teclado.next();

            System.out.println("Ingrese edad");
            int edad=teclado.nextInt();
            teclado.nextLine();

            System.out.println("Ingrese DNI");
            String dni=teclado.nextLine();

            System.out.println("Ingrese el género (1. Hombre, 2. Mujer, 3. Otro)");
            String genero=teclado.nextLine();

            System.out.println("Ingrese el peso");
            double peso=teclado.nextDouble();

            System.out.println("Ingrese la altura");
            double altura= teclado.nextDouble();

            miPersona.añade(new Persona(nombre, edad, dni, genero, (float) peso, (float) altura));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void visualiza_personas() {

        miPersona.visualizaCatalogo();

    }

}

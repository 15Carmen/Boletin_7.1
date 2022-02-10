package Persona;

public class Main {


    public static void main(String[] args) {


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
        }else{
            System.out.println(Jesus);
            System.out.println(Carmen);
        }

    }
}

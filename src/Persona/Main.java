package Persona;

public class Main {

    public static void main(String[] args) {

        Persona Carmen = new Persona();

        Carmen.setAltura(1.63f);
        Carmen.setPeso(60);

        Carmen.saberPesoIdeal();

        Carmen.pintarPeso();
    }
}

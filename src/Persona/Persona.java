package Persona;

import java.util.Objects;
import java.util.Scanner;

public class Persona implements Comparable<Persona>{

    static Scanner personaSC = new Scanner(System.in);

    /**
     * Atributos
     */
    private String nombre;
    private int edad;
    private String dni;
    private String genero;
    private double peso;
    private double altura;
    static int contadorPeso=0;
    static int contadorAltura=0;
    static int contadorPersonas=0;
    static int contadorEdad=0;

    /**
     * Constructor por defecto
     */

    public Persona(){

        contadorPeso++;
        contadorAltura++;
        contadorPersonas++;
        contadorEdad++;
    }

    /**
     * Constructor con parametros
     *
     * @param nombre
     * @param edad
     * @param dni
     * @param genero
     * @param peso
     * @param altura
     */

    public Persona (String nombre, int edad, String dni,
                    String genero, float peso, float altura){
        this.nombre= nombre;
        this.edad= edad;
        this.dni= dni;
        this.genero=genero;
        this.peso=peso;
        this.altura=altura;
        contadorPeso++;
        contadorAltura++;
        contadorPersonas++;
        contadorEdad++;

    }

    /**
     * constructor copia
     * @param copyPerson
     */

    public Persona (Persona copyPerson){
        this.nombre= copyPerson.nombre;
        this.edad=copyPerson.edad;
        this.dni= copyPerson.dni;
        this.genero= copyPerson.genero;
        this.peso=copyPerson.peso;
        this.altura=copyPerson.altura;
        contadorPeso++;
        contadorAltura++;
        contadorPersonas++;
        contadorEdad++;
    }

    /**
     * getters y setters
     * @return
     */

    //nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    //dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    //genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    //peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    //altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * metodo para calcular el IMC
     *      *
     * precondiciones:
     *
     *   queremos calcular el indice de masa corporal de la persona
     *   para saber si la persona está en su peso ideal usando la fórmula
     *   peso (kg)/altura^2 (m) =
     *   @return this.peso/Math.pow(this.altura, 2.0)
     *
     *   IMC	                          Nivel de peso
     *   Por debajo de 18.5	                Bajo peso
     *   18.5—24.9	                         Normal
     *   25.0—29.9	                        Sobrepeso
     *   30.0 o más	                          Obeso
     */

    public double calcularIMC(){
        return this.peso/Math.pow(this.altura, 2.0);
    }

    /**
     * metodo para saber si la persona está en su peso ideal
     * @return ideal
     */
    public int saberPesoIdeal(){
        int ideal=0;

        if (calcularIMC()<18.5){
            ideal=-1;
        }else
            if(calcularIMC()>=25.0){
            ideal=1;
        }

        return ideal;
    }

    /**
     * metodo para imprimir en pantalla si la persona está en su
     * peso ideal o no usando el metodo anterior
     */
    public void pintarPeso(){

        if (saberPesoIdeal()==-1){
            System.out.println("Está por debajo de su peso ideal");
        }else if (saberPesoIdeal()==1){
            System.out.println("Está usted gordit@");
        }else{
            System.out.println("Está usted en su peso ideal");
        }
    }

    /**
     * metodo para saber si la persona es mayor de edad
     */

    public void mayorEdad(){

        if (this.edad>=18){
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.println("Está chiquit@, no tienes edad para beber todavía");
        }

    }

    @Override
    public int compareTo (Persona personita){
        return (this.nombre).compareTo(personita.nombre);
    }

    @Override
    public boolean equals(Object obj) {
        boolean oli = false;
        if (this==obj){
            oli=true;
        }else if (obj!=null && obj instanceof Persona){
            Persona personita = (Persona) obj;
            if (this.nombre.equals(personita.nombre)) &&
            this
            }
        }
        return super.equals(obj);
    }

    public String toString(){
        return "Nombre: "+ this.nombre+ System.lineSeparator()+
                " Edad: "+ this.edad+ System.lineSeparator()+
                " Dni: "+ this.dni + System.lineSeparator()+
                " Peso: "+ this.peso + System.lineSeparator()+
                " Altura: "+ this.altura+ System.lineSeparator()+
                " IMC: "+ calcularIMC();
    }

    /**
     * metodo para crear a la persona
     * @return personita
     */

    public static Persona crearPersona(){

        Persona personita = new Persona();

        System.out.println("Indique el nombre de la persona:");
        personita.nombre= personaSC.nextLine();

        System.out.println("Indique su DNI:");
        personita.dni= personaSC.nextLine();

        System.out.println("Indique la edad que tiene: ");
        personita.edad= personaSC.nextInt();

        System.out.println("Indique su peso: ");
        personita.peso= personaSC.nextDouble();

        System.out.println("Indique su altura:");
        personita.altura= personaSC.nextDouble();

        System.out.println("Indique su género (hombre, mujer, otro): ");
        personita.genero= Persona.comprobarGenero();

        return personita;
    }

    public static String comprobarGenero(){


        String genero;

        do {
            personaSC.nextLine();
            genero= personaSC.next();

            if (Objects.equals(genero, "mujer")){
                genero= "mujer";
            }else
                if (Objects.equals(genero, "hombre")){
                    genero= "hombre";
                }else
                    if (Objects.equals(genero, "otro")){
                         genero= "otro";
                    }else{
                        System.out.println("Género no válido");
                    }

        }while (genero != "mujer" && genero != "hombre" && genero != "otro");
     return genero;
    }

    public double mediaPeso(){

        contadorPeso += this.peso;
        double media = 0.0;
        media=contadorPeso/contadorPersonas;
        return media;
    }

    public double mediaAltura(){

        contadorAltura+= this.altura;
        double media = 0.0;
        media=contadorAltura/contadorPersonas;
        return media;
    }

    public double mediaEdad(){

        contadorEdad+= this.edad;
        double media = 0.0;
        media=contadorEdad/contadorPersonas;
        return media;
    }

}

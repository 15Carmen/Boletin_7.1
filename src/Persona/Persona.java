package Persona;

import com.sun.source.doctree.SummaryTree;

public class Persona {

    /**
     * Atributos
     */
    private String nombre;
    private int edad;
    private String dni;
    private String genero;
    private float peso;
    private float altura;
    static int contadorPeso=0;
    static int contadorAltura=0;
    static int contadorPersonas=0;
    static int contadorEdad=0;

    /**
     * Constructor sin parametros
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
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

    public int compareToNombres(Persona personita){
        return (this.nombre).compareTo(personita.getNombre());
    }

    public String toString(){
        return "Nombre: "+ this.nombre+ System.lineSeparator()+
                " Edad: "+ this.edad+ System.lineSeparator()+
                " Dni: "+ this.dni + System.lineSeparator()+
                " Peso: "+ this.peso + System.lineSeparator()+
                " Altura: "+ this.altura+ System.lineSeparator()+
                " IMC: "+ calcularIMC();
    }



}

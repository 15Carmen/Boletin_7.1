package Persona;

public class Persona {

    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    private char genero;
    private float peso;
    private float altura;

    //Constructor

    public Persona (String nombre, int edad, String dni,
                    char genero, float peso, float altura){
        this.nombre= nombre;
        this.edad= edad;
        this.dni= dni;
        this.genero=genero;
        this.peso=peso;
        this.altura=altura;

    }

    //Constructor copia

    public Persona (Persona copyPerson){
        this.nombre= copyPerson.nombre;
        this.edad=copyPerson.edad;
        this.dni= copyPerson.dni;
        this.genero= copyPerson.genero;
        this.peso=copyPerson.peso;
        this.altura=copyPerson.altura;
    }

    public Persona(){

    }

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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
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

    /*
    queremos calcular el indice de masa corporal de la persona
    para saber si la persona está en su peso ideal usando la fórmula
    peso (kg)/altura^2 (m)

    IMC	                                Nivel de peso
    Por debajo de 18.5	                 Bajo peso
    18.5—24.9	                            Normal
    25.0—29.9	                          Sobrepeso
    30.0 o más	                            Obeso

     */

    public double calcularIMC(){
        return this.peso/Math.pow(this.altura, 2.0);
    }

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

    public void pintarPeso(){

        if (saberPesoIdeal()==-1){
            System.out.println("Está por debajo de su peso ideal");
        }else if (saberPesoIdeal()==1){
            System.out.println("Está usted gordit@");
        }else{
            System.out.println("Está usted en su peso ideal");
        }
    }
}

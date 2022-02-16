package Persona;

    public class catalogoPersonas {
        private final int MAX_PERSONAS = 99;
        private int numPersonas;
        private Persona catalogo[];


        public catalogoPersonas() {
            catalogo = new Persona[MAX_PERSONAS];
            numPersonas = 0;
        }

        public int getNumPersonas() {
            return numPersonas;
        }

        private int posicionDe(Persona a){

            for(int pos=0;pos<numPersonas;pos++){
                Persona obj=catalogo[pos];
                if(obj.equals(a)){
                    //Persona existe
                    return pos;
                }
            }
            return -1;
        }

        public boolean añade (Persona a){
            int pos=posicionDe(a);
            if(pos>=0){
                //Persona ya existe
            }else{
                //Persona no existe y se procede a añadirlo al arreglo si el contador de elementos
                // de mi arreglo es menor o igual al limite de elementos de mi arreglo
                if(numPersonas<=MAX_PERSONAS){
                    catalogo[numPersonas]=a;
                    //actualiza el numero de elementos que tiene mi arreglo
                    numPersonas++;
                    return true;
                }
            }
            return false;
        }

        public void visualizaCatalogo(){

            if(numPersonas>0){
                for(int pos=0;pos<numPersonas;pos++){
                    System.out.println(catalogo[pos].toString());
                }
            }else{
                System.out.println("Mi Catalogo esta Vacio!!");
            }

        }
    }



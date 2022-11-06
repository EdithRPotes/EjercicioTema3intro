public class Main {
    public static void main(String[] args) {

        //Primer Punto
        //inicializo la variable
        int resultado = 0;
        // llamo a la función suma y le doy valores a los 3 parametros
        resultado = suma(5, 10 , 2);
        //muestro por pantalla el resultado
        System.out.println(resultado);

        //Segundo Punto
        // creación de objeto
        Coche miCoche= new Coche();
        //llamando a la funcion AumentoPuertas
        miCoche.AumentoPuerta();
        System.out.println(miCoche.Puertas);

    }

    //Primer Punto
    /**Crear una función con tres parámetros que sean números que se suman entre sí.
    Llamar a la función en el main y darle valores.**/

    public static int suma(int a, int b, int c) {

                return a+b+c;
            }

    }
//Segundo Punto
/**Crear una clase coche.

 Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

 Una función que incremente el número de puertas que tiene el coche.

 Crear un objeto miCoche en el main y añadirle una puerta.

 Mostrar el número de puertas que tiene el objeto.**/

class Coche {

    //Creacion de variable
    int Puertas=4;

    //Funcion para incrementar el numero de puertas del coche
    public void AumentoPuerta(){
        this.Puertas++;
    }
}

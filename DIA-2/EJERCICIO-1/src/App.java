    // Importación de la Clase ArrayList
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
            // Declaración de las variables del Programa
        int contador = 0;

            // Instanciación de la Clase ArrayList  --> Creación del Objeto "numeros"
        ArrayList <Integer> numeros = new ArrayList<>();

            // Inicialización del ArrayList creado
        for(int i = 20; i <= 50; i++) {
            numeros.add(contador, i);
            contador++;
        }

            // Impresión por terminal del ArrayList creado
        System.out.println("______________________________________________\n");
        System.out.println("ArrayList: \n\n" + numeros);
        System.out.println("______________________________________________\n");

            // Cierre del objeto "numeros"
        numeros = null;
    }
}

/* Consigna:

    1) Crear un arraylist 
    2) Inicializarlo mediante un bucle con los números del 20 al 50. 
    3) Mostrar después todo el contenido del arraylist final.
*/

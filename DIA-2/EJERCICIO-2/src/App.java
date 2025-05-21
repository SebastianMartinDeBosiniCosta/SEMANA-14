    // Importación de la clase Scanner y ArrayList
import java.util.Scanner;
import java.util.ArrayList;


public class App {
    /* - - - - - - - - - - - - INICIO DE EJECUCIÓN DEL PROGRAMA - - - - - - - - - - - - */
    public static void main(String[] args) throws Exception {

            /* Declaración de las variables del programa

                    --> elements: Almacenará cada elemento ingresado por el usuario
            */
        String elements = "";

            /* Instanciación de la Clase Scanner y ArrayList 
                --> Creación del objeto "teclado"
                --> Creación del objeto "jordiElements" --> Conjunto de elementos festivos
            */
        ArrayList <String> jordiElements= new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
    

            System.out.println("Ingresa un elemento típico de la Fiesta de Sant Jordi: ");
            elements = teclado.nextLine();
            System.out.println("");

        while(!elements.equalsIgnoreCase("salir")) {
            jordiElements.add(elements);
            System.out.println("Ingresa un elemento típico de la Fiesta de Sant Jordi: ");
            elements = teclado.nextLine();
            System.out.println("");
        }

            // Impresión por terminal de la lista de elementos
        for(String elemento : jordiElements) {
            System.out.print(" | " + elemento + " |  ");
        }
        

            // Cierre del objeto "teclado" y "jordiElements"
        teclado.close();
        jordiElements = null;

    }
}




/* Consigna:

    1) Preguntar al usuario elementos típicos de la fiesta de Sant Jordi.
    2) Para acabar, escribir 'salir'. 
    3) Al final, mostrar todos los elementos introducidos por el usuario.
*/

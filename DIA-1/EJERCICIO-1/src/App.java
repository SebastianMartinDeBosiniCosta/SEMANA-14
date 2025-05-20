    // Importación de la clase Scanner
import java.util.Scanner;


public class App {

           /* - - - - - - - - - - - - - - - - - - - - INICIO DE EJECUCIÓN DEL PROGRAMA  - - - - - - - - - - - - - - - - - - -  */
    public static void main(String[] args) throws Exception {

            // Declaración de las variables del Programa
        int tamanio = 0;

            // Instanciación de la clase Scanner --> Creación del objeto "teclado"
        Scanner teclado = new Scanner(System.in);

            /* Solicitud al usuario, Verificación y Declaración del Array

                --> Solicitud: Ingreso por teclado del número de elementos
                --> Requerimiento: Número entero positivo.
                --> Declaración del Array
            */
        System.out.println("Indica el tamaño de tu playlist de canciones favoritas: ");
        if(!teclado.hasNextInt()) {
            System.out.println("¡INGESO INVÁLIDO! Verifique e intente nuevamente más tarde");
        } else {
            tamanio = teclado.nextInt();
            teclado.nextLine();     // Consumo del Salto de línea pendiente
            if(tamanio < 0) {
                System.out.println("¡INGESO INVÁLIDO! Verifique e intente nuevamente más tarde");
            }
        }

        String[] playList = new String[tamanio];

            /* Estrutura iterativa de Solicitud al usuario e Inicialización del Array 

                --> Solicitud: Ingreso por teclado una canción favorita.
                --> Requerimiento: Cadena de carácetres libre.
                --> Incorporación a la playlist (array)
            */
        for(int i = 0; i < playList.length; i++) {
            System.out.println("Ingresa tu " + (i + 1) + "° canción: \t");
            playList[i] = teclado.nextLine();
        }

            // Impresión por pantalla de la Playlist creada
        System.out.println("_______________ YOUR PLAYLIST _______________");
        for(String canciones: playList) {
            System.out.println("-" + canciones);
        }

        // Cierre del objeto "teclado"
        teclado.close();
    }
}


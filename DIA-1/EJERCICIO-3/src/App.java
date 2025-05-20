    // Importación de la Clase Scanner
import java.util.Scanner;

public class App {

        /* - - - - - - - - - - - - - - - - - - - INICIO DE EJECUCIÓN DEL PROGRAMA - - - - - - - - - - - - - - - - - - - */
    public static void main(String[] args) throws Exception {

            /* Declaración de las variables del programa

                --> Array participantesIron = Almacenará la lista de nombres de los participantes del Sorteo
                --> participanteSeleccionado = Almacenará el índice generado aleatoriamente para la selección del ganador
                --> continuar = Almacenará el valor de la expresión a evaluar en la continuidad del programa.
                --> respuesta = Almacenará la respuesta del usuario.
            */
        String[] participantesIron = {"Alejandro", "Albert", "Aranzazu", "Andrea", "Carla", "Connor", "Cristian", "Dayana", "Elisabeth", "Emilia", "Francisco", "Jordi", "Jorge", "Laura", "Matias", "Romain", "Victor", "Sebastian", "Freegalado"};
        int participanteSelectionado = 0;
        boolean continuar = true;
        String respuesta = "";

            // Instanciación de la Clase Scanner --> Creación del objeto "teclado"
        Scanner teclado = new Scanner(System.in);

            //  Desarrollo del Sorteo
        do {
                // Generación aletoria del índice para la selección del participante ganador
            participanteSelectionado = (int) (Math.random() * 19);

                // Impresión por consola del Ganador del Sorteo
            System.out.println("___________________________________________________\n");
            System.out.println("El ganador es: \t" + participantesIron[participanteSelectionado]);
            System.out.println("___________________________________________________");
            System.out.println("");

                // Solicitud al usuario de confirmación de continuidad de la ejecución del programa
            System.out.println("");
            System.out.print(" ¿Deseas continuar? Responde ['Si' | 'No']: \t\t");
            System.out.println("");
            respuesta = teclado.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            } else if (!respuesta.equalsIgnoreCase("si")) {
                System.out.println("¡¡ INGRESO INVÁLIDO !! Reinicie el programa.");
                    continuar = false;
                } 
        } while (continuar);
        
            // Mensaje de Cierre
        System.out.println("\n");
        System.out.println("***** ¡SORTEO FINALIZADO! Felicitaciones a los ganadores. ***** \n");

            // Cierre del objeto "teclado" y "participantesIron"
        teclado.close();
        participantesIron = null;

    }
}

// 3- Premio vacaciones en Ibiza: tienes un listado de nombres de personas en un array. Aleatoriamente, seleccionar el ganador y mostrarlo. Entonces preguntar: "otra vez? (S/N)", y si es que sí, volver a generar nuevo ganador y mostrarlo. Seguir preguntando hasta que el usuario diga que no.

    // Importación de la Clase ArrayList y Arrays
import java.util.ArrayList;
import java.util.Arrays;

public class App {

        /* - - - - - - - - - - -  INICIO DE EJECUCIÒN DEL PROGRAMA  - - - - - - - - - - - */
    public static void main(String[] args) throws Exception {

            // | C | --> CREATE
        ArrayList <String> listaInvitados = new ArrayList<>(Arrays.asList("Sebastian", "Melisa", "Agustina", "Josè", "Mara"));

            // | R | --> READ
        for(int i = 0; i < listaInvitados.size(); i++) {
            System.out.print(" | " + i + ") " + listaInvitados.get(i) + " |  ");
        }
        System.out.println("");
        System.out.println("__________________________________________________________________________________");
        System.out.println("");


            // | U | --> UPDATE
        // listaInvitados.remove(2);
        // listaInvitados.remove(3);
        listaInvitados.set(2, "");
        listaInvitados.set(3, "");
        
            // | R | --> READ
        for(int i = 0; i < listaInvitados.size(); i++) {
            System.out.print(" | " + i + ") " + listaInvitados.get(i) + " |  ");
        }
        System.out.println("");
        System.out.println("__________________________________________________________________________________");
        System.out.println("");


            // | U | --> UPDATE
        // listaInvitados.add(2, "Carlos");
        listaInvitados.set(2, "Carlos");
        
            
            // | R | --> READ
        for(int i = 0; i < listaInvitados.size(); i++) {
            System.out.print(" | " + i + ") " + listaInvitados.get(i) + " |  ");
        }
        System.out.println("");
        System.out.println("__________________________________________________________________________________");
        System.out.println("");

            // | U | --> UPDATE
        // listaInvitados.remove(listaInvitados.size()-1);
        // listaInvitados.add(listaInvitados.size(), "Matias");
        listaInvitados.set(listaInvitados.size()-1, "Matias");

        
            // | R | --> READ
        for(int i = 0; i < listaInvitados.size(); i++) {
            System.out.print(" | " + i + ") " + listaInvitados.get(i) + " |  ");
        }
        System.out.println("");
        System.out.println("__________________________________________________________________________________");
        System.out.println("");

            // | U | --> UPDATE
        // listaInvitados.add(3, "Federico");
        listaInvitados.set(3, "Federico");
        
            
            // | R | --> READ
        for(int i = 0; i < listaInvitados.size(); i++) {
            System.out.print(" | " + i + ") " + listaInvitados.get(i) + " |  ");
        }
        System.out.println("");
        System.out.println("__________________________________________________________________________________");
        System.out.println("");
         
            // | D | --> DELETE
        listaInvitados = null;      // Inutilización del objeto
        // listaInvitados.clear();     // Vaciamiento del objeto

    }
}


/*  Consigna:


    1) Crear una lista de 5 invitados.
    2) Eliminar de la lista a los invitados 2 y 3. 
    3) Incluír a un nuevo invitado en la posición 2.
    4) Eliminar al último invitado de la lista y agregar a otro nuevo invitado en dicha posición.
    5) Añadir un nuevo invitado en la posición 3.
    6) Ir mostrando tras cada modificación la lista de invitados.
*/

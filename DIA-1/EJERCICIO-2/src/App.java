import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* Declaración de los arrays del programa

            --> Array Original: Almacenará los 20 números.
            --> Array Pares: Almacenará los números pares.
            --> Array Impares: Almacenará los números impares.
        */
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] pares = new int[10], impares = new int[10];

            /*  Estrutura de verificación e inicialización del arrays pares e impares

                --> Condición pares: numero % 2 = 0.
                --> condición impares: numero % 2 != 0.
                --> Utilización de un índices alternos (e y f)
             */
        int e = 0, f = 0;
        for(int i = 0; i < original.length; i++) {
            if (original[i] % 2 == 0) {
                pares[e] = original[i];
                e++;
            } else {
                impares[f] = original[i];
                f++;
            }
        }
        
            // Impresión por pantalla de los 3 arrays
        System.out.println("___________________________________________________________\n");
        System.out.println("- Array Original:  \t" + Arrays.toString(original));
        System.out.println("___________________________________________________________\n");
        System.out.println("- Array Números Pares:  \t" + Arrays.toString(pares));
        System.out.println("___________________________________________________________\n");
        System.out.println("- Array Números Impares:  \t" + Arrays.toString(impares));
        System.out.println("___________________________________________________________\n");
    }
}


// 2 - Tienes un array de 20 números enteros: decir cuales son pares e impares. Recordar el módulo (%) (resto de una división) 10%3 => 1
// +EXTRA: añadirlos a nuevos arrays: 'arrayPares' y 'arrayImpares', y al final mostrar los tres arrays. En este caso, deberías saber por adelantado el length de cada uno (que hay 3 pares y 5 impares), o bien hacer arrays más grandes y dejar los últimos en null.

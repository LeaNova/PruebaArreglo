package pruebaarreglo;

/**
 * @author Leandro Heredia
 */
public class Arreglo {
    
    static void sumarLista(int[] lista) {
        int suma = 0;
        System.out.println("Cantidad de elementos en el arreglo:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
            suma += lista[i];
        }
        System.out.println();
        System.out.println("La suma total del arreglo es: " + suma);
    }
    
    static void buscarMayor(int[][] lista) {
        int mayor = 0;
        System.out.println("Cantidad de elementos en el arreglo:");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.println(lista[i][j]);
                if (lista[i][j] > mayor) {
                    mayor = lista[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("El número mayor es: " + mayor);
    }
    
    static void cuentaVocales(String str) {
        char[] caracteres = str.toCharArray();
        int vocalesM = 0;
        int vocalesm = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u') {
                vocalesm++;
            } else if (caracteres[i] == 'A' || caracteres[i] == 'E' || caracteres[i] == 'I' || caracteres[i] == 'O' || caracteres[i] == 'U') {
                vocalesM++;
            }
        }
        System.out.println("La cadena: " + str);
        System.out.println("Contiene " + vocalesM + " vocales mayúsculas.");
        System.out.println("Contiene " + vocalesm + " vocales minúsculas.");
    }
    
    static void cuentaCaracter(String str, char car) {
        char[] caracteres = str.toCharArray();
        int cantidad = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == car) {
                cantidad++;
            }
        }
        System.out.println("La cadena: " + str);
        System.out.println("Contiene " + cantidad + " caracteres " + car + ".");
    }
}
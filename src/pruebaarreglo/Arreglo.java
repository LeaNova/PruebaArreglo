package pruebaarreglo;

/**
 * @author Leandro Heredia
 */
public class Arreglo {
    
    static void sumarLista(int[] lista) {
        int suma = 0;
        System.out.println("Cantidad de elementos en el arreglo:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
            suma += lista[i];
        }
        System.out.println();
        System.out.println("La suma total del arreglo es: " + suma);
        System.out.println("El promedio total es arreglo es: " + (float)suma/lista.length);
    }
    
    static void buscarMayor(int[][] lista) {
        int mayor = 0;
        System.out.println("Cantidad de elementos en el arreglo:");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.print(lista[i][j] + " ");
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
        int vocalesm = 0;
        int vocalesM = 0;
        for (int i = 0; i < caracteres.length; i++) {
            switch (caracteres[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'á':
                case 'é':
                case 'í':
                case 'ó':
                case 'ú':
                    vocalesm++;
                    break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Á':
                case 'É':
                case 'Í':
                case 'Ó':
                case 'Ú':
                    vocalesM++;
                    break;
                default:
                    break;
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
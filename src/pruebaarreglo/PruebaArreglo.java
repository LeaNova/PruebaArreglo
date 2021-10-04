package pruebaarreglo;
import java.util.Scanner;

/**
 * @author Leandro Heredia
 */
public class PruebaArreglo {

    public static void main(String[] args) {
        
        int[] arr1 = {5, 12, 19, 12, 23};
        int[][] arr2 = {{11, 15, 55}, {14, 45, 33, 11}};
        
        System.out.println("---------------------------------------");
        Arreglo.sumarLista(arr1);
        System.out.println("---------------------------------------");
        Arreglo.buscarMayor(arr2);
        System.out.println("---------------------------------------");
        Arreglo.cuentaVocales("caminando");
        System.out.println("---------------------------------------");
        Arreglo.cuentaCaracter("esternocleidomastoideo", 'e');
        
        /* ------------------------------------------------------------------------ */
        
        System.out.println("Bienvenido a éste programa que ejecuta 4 funciones diferentes!");
        System.out.println("Te dire las instrucciones a seguir para cada función.");
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Primera función: Sumar y Promediar!");
        System.out.println("Ingrese un número para definir el largo del arreglo:");
        
        int cant1 = sc.nextInt();
        int[] arrSc1 = new int[Math.abs(cant1)];

        System.out.println("Ahora ingrese números enteros para el arreglo:");
        for (int i = 0; i < cant1; i++) {
            int numSc1 = sc.nextInt();
            arrSc1[i] = numSc1;
        }

        System.out.println("---------------------------------------");
        Arreglo.sumarLista(arrSc1);
        System.out.println("---------------------------------------");
        
        /* ------------------------------------------------------------------------ */
        
        System.out.println("Segunda función: Identificar el mayor!");
        System.out.println("Ingrese un número para definir el largo del primer arreglo:");
        int cant2a = sc.nextInt();
        if (cant2a == 0) {
            cant2a++;
        }
        int[] arrSc2a = new int[Math.abs(cant2a)];
        
        System.out.println("Ingrese números enteros el arreglo:");
        for (int i = 0; i < cant2a; i++) {
            int numSc1 = sc.nextInt();
            arrSc2a[i] = numSc1;
        }
        
        System.out.println("Ingrese un numero para definir el largo del segundo arreglo:");
        int cant2b = sc.nextInt();
        if (cant2b == 0) {
            cant2b++;
        }
        int[] arrSc2b = new int[Math.abs(cant2b)];
        
        System.out.println("Ingrese numeros enteros al arreglo:");
        for (int i = 0; i < cant2b; i++) {
            int numSc1 = sc.nextInt();
            arrSc2b[i] = numSc1;
        }
        
        int[][] arrSc2 = {arrSc2a, arrSc2b};
        
        System.out.println("---------------------------------------");
        Arreglo.buscarMayor(arrSc2);
        System.out.println("---------------------------------------");
        
        /* ------------------------------------------------------------------------ */
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Tercera función: Cantidad de vocales!");
        System.out.println("Ingrese algúna palabra u oración para calcular sus vocales:");
        String str1 = sc2.nextLine();
        
        System.out.println("---------------------------------------");
        Arreglo.cuentaVocales(str1);
        System.out.println("---------------------------------------");
        
        /* ------------------------------------------------------------------------ */
        
        System.out.println("Cuarta función: Cuantas veces se repite la letra!");
        System.out.println("Ingrese algúna palabra u oración:");
        String str2 = sc2.nextLine();      
        
        System.out.println("Ingrese un caracter para ver cuantas veces se repite en la palabra u oración:");
        char caracter = sc2.next().charAt(0);
        
        System.out.println("---------------------------------------");
        Arreglo.cuentaCaracter(str2, caracter);
        System.out.println("---------------------------------------");
        
        /* ------------------------------------------------------------------------ */
    }
}
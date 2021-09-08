package pruebaarreglo;

/**
 * @author Leandro Heredia
 */
public class PruebaArreglo {

    public static void main(String[] args) {

        int[] arr1 = {5, 15, 19, 11, 20};
        int[][] arr2 = {{11, 15, 55}, {14, 45, 33, 11}};
        
        System.out.println("---------------------------------------");
        Arreglo.sumarLista(arr1);
        System.out.println("---------------------------------------");
        Arreglo.buscarMayor(arr2);
        System.out.println("---------------------------------------");
        Arreglo.cuentaVocales("caminando");
        System.out.println("---------------------------------------");
        Arreglo.cuentaCaracter("esternocleidomastoideo", 'e');
    }
}
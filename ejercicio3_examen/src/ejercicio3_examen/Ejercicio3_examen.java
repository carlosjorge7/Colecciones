
package ejercicio3_examen;


public class Ejercicio3_examen {

    
    public static void main(String[] args) {
        
        
        String[] cadenas1 = {"UNO", "DOS", "TRES"};
        String[] cadenas2 = {"uno", "dos", "TRES"};
        System.out.println(Utilidades.estaMayusculas(cadenas1)); //true
        System.out.println(Utilidades.estaMayusculas(cadenas2)); //false
        
        int[] numeros1 = {2, 1, 3};
        int[] numeros2 = {10, 20, 30, 40};
        System.out.println(Utilidades.esCreciente(numeros1)); //false
        System.out.println(Utilidades.esCreciente(numeros2)); //true
        
        int[] nums1 = {1, 2, 7, 10};
        int[] nums2 = {0, 3, 7, 11};
        System.out.println(Utilidades.elementoComun(nums1, nums2));//Revisar
        
        int[][] mat1 = {{1, 2}, {2, 1}};
        int[][] mat2 = {{1, 2, 3}, {2, 1, 7}};
        
        System.out.println(Utilidades.esCuadrado(mat1)); //true
        System.out.println(Utilidades.esCuadrado(mat2)); //false
        
        
        
    }
    
}

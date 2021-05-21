
package ejercicio3_examen;


public class Utilidades {
    
    
    
    public static boolean estaMayusculas(String[] cadenas){
        
        for (int i = 0; i < cadenas.length; i++) {
            
            if(!cadenas[i].equals(cadenas[i].toUpperCase())){
                return false;
            }
        }
        return true;
    }
    
    public static boolean esCreciente(int[] numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = i; j < numeros.length - 1; j++) {
                
                if(numeros[j] > numeros[j+1]){
                    return false;
                }
                
            }
        }
        return true;
    }
    
   public static boolean elementoComun(int[] numeros1, int[] numeros2){
           
        for (int i = 0; i < numeros1.length; i++) {
            
            for (int j = 0; j < numeros2.length; j++) {
                
                if(numeros1[i] != numeros2[j]){
                     return false;
                } 
            }
       }
       return true;
       
   }
   
   public static boolean esCuadrado(int[][] matriz){
       
       for (int i = 0; i < matriz.length; i++) {
           
           for (int j = 0; j < matriz[0].length; j++) {
               
               if(matriz.length != matriz[0].length){
                   return false;
               }
           }
       }
       return true;
   }
}

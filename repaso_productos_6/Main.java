package repaso_productos_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int NUM = 5;
        Producto[] productos = new Producto[NUM];
        String nombre;
        int unidades;
        int cont = 0;
 
        System.out.println("Producto : ");
        nombre = sc.nextLine();

        while(cont < NUM && !nombre.equals("fin")){

            System.out.println("Unidades : ");
            unidades = Integer.parseInt(sc.nextLine());

            for(int i = 0; i < productos.length; i++){
                if(nombre.equalsIgnoreCase(productos[i].getNombre())){
                    unidades = unidades + productos[i].getUnidades();
                    productos[i] = new Producto(nombre, unidades);
                }
                else{
                    productos[i] = new Producto(nombre, unidades);
                }
            }
            cont++;
            System.out.println("Producto : ");
            nombre = sc.nextLine();
        }
        sc.close();
        System.out.println("Ventas : ");
        System.out.println("-----------------");
        for(int i = 0; i < productos.length; i++){
            System.out.println(productos[i].getNombre() + " : " + 
            productos[i].getUnidades());
        }
    }
    
}
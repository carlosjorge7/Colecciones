package productos_ventas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        File fileProductos = new File("productos_ventas/productos_precio.txt");
        File fileVentas = new File("productos_ventas/ventas.txt");

        if(!fileVentas.exists()){
            System.out.println("No existe");
            return;
        }
        if(!fileProductos.exists()){
            System.out.println("No existe");
            return;
        }
        TreeMap<String, Venta> tVentas = new TreeMap<>();
        HashMap<Integer, Double> hProductos = new HashMap<>();
        try{
            // pasamos los datos del fichero productos al hasmap
            Scanner fScannerProductos = new Scanner(fileProductos);
            String linea;
            String[] data;
            Integer codigo;
            double precio = 0.0;

            while(fScannerProductos.hasNextLine()){
                linea = fScannerProductos.nextLine();
                data = linea.split(" ");
                codigo = Integer.parseInt(data[0]);
                precio = Double.parseDouble(data[1]);

                if(!hProductos.containsKey(codigo)){
                    hProductos.put(codigo, precio);
                }
            }
            fScannerProductos.close();

            // leemos el fichero ventas y buscamos el precio con X codigo de producto
            Scanner fScannerVentas = new Scanner(fileVentas);
            String nombre;
            Integer unidades;
            double importe;

            while(fScannerVentas.hasNextLine()){
                linea = fScannerVentas.nextLine();
                data = linea.split(" ");
                nombre = data[0];
                codigo = Integer.parseInt(data[1]);
                // recorro el hasmap de productos
                for(Integer cod : hProductos.keySet()){
                    if(cod == codigo){
                        precio = hProductos.get(cod);
                    }
                }
                unidades = Integer.parseInt(data[2]);
                importe = precio * unidades;

                if(!tVentas.containsKey(nombre)){
                    tVentas.put(nombre, new Venta(precio, unidades, importe));
                }
                else{
                    importe = tVentas.get(nombre).getImporte() + importe;
                    tVentas.put(nombre, new Venta(precio, unidades, importe));
                }
            }
            fScannerVentas.close();

            double total = 0.0;

            for(String nom : tVentas.keySet()){
                total += tVentas.get(nom).getImporte();
            }

            System.out.println("Total importe en ventas: " + total );
            System.out.println(" -----------------------------------");
            for(String nom : tVentas.keySet()){
                System.out.println(nom + " " + tVentas.get(nom).getImporte());
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
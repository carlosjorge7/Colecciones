package productos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		HashMap<Integer, String> hmProductos = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		int codigo;
		String descripcion;


		System.out.print("Código: ");
		codigo = Integer.parseInt(sc.nextLine());
		while(codigo != -1)
		{
			System.out.print("Descripción: ");
			descripcion = sc.nextLine();

			if(hmProductos.put(codigo, descripcion) == null)
			{
				System.out.println("Nuevo producto insertado.");
			}
			else
			{
				System.out.println("Descripción actualizada.");
			}
			System.out.print("Código: ");
			codigo = Integer.parseInt(sc.nextLine());
		}

		System.out.println("Total productos insertados (" + hmProductos.size() + "):");

		listarProductos(hmProductos);

		System.out.println("Borrado de productos:");
		Iterator<Integer> iterator = hmProductos.keySet().iterator();
		String respuesta;
		while(iterator.hasNext())
		{
			codigo = iterator.next();
			System.out.print("Código : " + codigo + " Valor : " + hmProductos.get(codigo)
					+ " ¿Borrar? (s/n):");
			respuesta = sc.nextLine();
			if(respuesta.equals("s"))
			{
				iterator.remove();
			}
		}
		sc.close();
		System.out.println("Productos restantes (" + hmProductos.size() + "):");

		listarProductos(hmProductos);
	}

	private static void listarProductos(HashMap<Integer, String> hmProductos)
	{
		for (Integer cod: hmProductos.keySet())
		{
			System.out.println("Código : " + cod + " Valor : " + hmProductos.get(cod));
		}
	}

}

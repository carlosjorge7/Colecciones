package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		HashSet<Empleado> hsEmpleados = new HashSet<>();

		String nombre;
		double sueldo;

		while(!opcion.equals("7"))
		{
			mostrarMenu();
			opcion = sc.nextLine();
			switch(opcion)
			{
				case "1": // Introducir
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					if(hsEmpleados.contains(new Empleado(nombre,-1)))
					{
						System.out.println("Ya existe.");
					}
					else
					{
						System.out.print("Sueldo: ");
						sueldo = Double.parseDouble(sc.nextLine());
						hsEmpleados.add(new Empleado(nombre, sueldo));
					}
					break;
				case "2": // Listar
					for(Empleado empleado: hsEmpleados)
					{
						System.out.println(empleado.getNombre() + " Sueldo: "
								+ empleado.getSueldo());
					}
					break;
				case "3": // Eliminar
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					if(!hsEmpleados.remove(new Empleado(nombre, -1)))
					{
						System.out.println("Empleado no encontrado.");
					}
					break;
				case "4": // Borrar todos
					hsEmpleados.clear();
					break;
				case "5": // Mostrar tamaño
					System.out.println(hsEmpleados.size());
					break;
				case "6": // Buscar
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					if(hsEmpleados.contains(new Empleado(nombre, -1)))
					{
						System.out.println("Encontrado.");
					}
					else
					{
						System.out.println("No encontrado.");
					}
					break;
				case "7": // Salir
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}
		}
		sc.close();
	}

	private static void mostrarMenu()
	{
		System.out.println("Opciones\n" +
		"1.-Introducir empleado\n" +
		"2.-Listar empleados\n" +
		"3.-Eliminar empleado\n" +
		"4.-Borrar todos\n" +
		"5.-Mostrar tamaño\n" +
		"6.-Buscar\n" +
		"7.-Salir");
	}

}
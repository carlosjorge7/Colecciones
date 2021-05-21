package jugadores;

import java.util.Scanner;
import java.util.TreeSet;

public class Main
{

	public static void main(String[] args)
	{

		TreeSet<Jugador> tsJugadores = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
		String nombre;
		int estatura;
		while(!opcion.equals("5"))
		{
			mostrarMenu();
			opcion = sc.nextLine();
			switch(opcion)
			{
				case "1":
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					if(tsJugadores.contains(new Jugador(nombre,-1)))
					{
						System.out.println("Ya existe.");
					}
					else
					{
						System.out.print("Estatura: ");
						estatura = Integer.parseInt(sc.nextLine());
						tsJugadores.add(new Jugador(nombre, estatura));
					}
				break;
				case "2":
					for (Jugador jugador: tsJugadores)
					{
						System.out.println(jugador.getNombre() + ": " + jugador.getEstatura());
					}
				break;
				case "3":
					System.out.print("Nombre: ");
					nombre = sc.nextLine();
					if(!tsJugadores.remove(new Jugador(nombre,-1)))
					{
						System.out.println("No encontrado.");
					}
				break;
				case "4":
					tsJugadores.clear();
				break;
				case "5":
				break;
				default:
					System.out.println("Opción no válida.");
			}
		}
		sc.close();
	}

	private static void mostrarMenu()
	{
		System.out.println("1.-Introducir jugador\n" +
				"2.-Listar jugadores\n" +
				"3.-Eliminar jugador\n" +
				"4.-Borrar todos\n" +
				"5.-Salir");
	}

}

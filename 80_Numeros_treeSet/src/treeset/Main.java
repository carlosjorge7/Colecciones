package treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Main
{

	public static void main(String[] args)
	{
		TreeSet<Integer> tsNumeros = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce números:");
		for(String num: sc.nextLine().split(" "))
		{
			try
			{
				if(!tsNumeros.add(Integer.parseInt(num)))
				{
					System.out.println("El número " + num + " está repetido.");
				}
			}
			catch(NumberFormatException e){ /* No hacer nada */}
		}
		sc.close();
		System.out.println("Los números ordenados ascendentemente y sin repetidos son:");
		for(int num: tsNumeros)
		{
			System.out.print(num + " ");
		}
	}

}

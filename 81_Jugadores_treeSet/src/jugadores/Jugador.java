package jugadores;

public class Jugador implements Comparable<Jugador>
{

	private String nombre;
	private int estatura;
	public Jugador(String nombre, int estatura)
	{
		super();
		this.nombre = nombre;
		this.estatura = estatura;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public int getEstatura()
	{
		return estatura;
	}
	public void setEstatura(int estatura)
	{
		this.estatura = estatura;
	}
	@Override
	public int compareTo(Jugador jugador)
	{
		return nombre.compareToIgnoreCase(jugador.getNombre());
	}
}

package hashset;

public class Empleado
{
	private String nombre;
	private double sueldo;
	public Empleado(String nombre, double sueldo)
	{
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String getNombre()
	{
		return nombre;
	}
	public double getSueldo()
	{
		return sueldo;
	}

	@Override
	public int hashCode()
	{
		return nombre.toLowerCase().hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		Empleado empleado = (Empleado) obj;
		return nombre.equalsIgnoreCase(empleado.getNombre());
	}

}

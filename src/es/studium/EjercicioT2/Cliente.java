package es.studium.EjercicioT2;

public class Cliente
{
	//Aqu� creamos los atributos, todos ellos privados y de tipo String al contener todos ellos letras.
	private String dni; 
	private String nombre;
	private String direccion;
	
	public Cliente() //Esto es un m�todo constructor "vac�o", cuyas variables inicializamos pero sin darle un valor.
	{
		dni = "";
		nombre = "";
		direccion = "";
	}
	
	public Cliente(String d, String n, String dr) /*Esto es tambi�n un constructor, pero a 
	diferencia del anterior, este es un constructor donde se le pasan par�metros, de ah� que se le
	llame "constructor por par�metros".*/
	{
		dni = d;
		nombre = n;
		direccion = dr;
	}
	
	/* Desde aqu� hasta el final lo que tenemos son los m�todos inspectores, tanto get como set,
	 con los que tenemos acceso a los atributos de un objeto.*/
	 
	public String getDni() 
	{
		return dni;
	}
	
	public void setDni(String d) 
	{
		dni = d;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String n) 
	{
		nombre = n;
	}
	
	public String getDireccion() 
	{
		return direccion;
	}
	
	public void setDireccion(String dr) 
	{
		direccion = dr;
	}
	
	
}

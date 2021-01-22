package es.studium.EjercicioT2;

/*En esta clase hemos hecho prácticamente lo mismo que en la clase Clientes, con la diferencia de
que aquí el atributo "cliente" no es de un tipo predefinido por Java, sino que lo hemos definido
nosotros mismos, conectándolo así con la clase anterior Clientes*/

public class Cuenta
{
	private int numero;
	private int saldo;
	private Cliente cliente;
	
	public Cuenta() 
	{
		numero = 0;
		saldo = 0;
		cliente = new Cliente();
	}
	
	public Cuenta(int n, int s, Cliente c) 
	{
		numero = n;
		saldo = s;
		cliente = c;
	}
	
	public int getNumero() 
	{
		return numero;
	}
	
	public void setNumero(int n) 
	{
		numero = n;
	}
	
	public int getSaldo() 
	{
		return saldo;
	}
	
	public void setSaldo(int s) 
	{
		saldo = s;
	}
	
	public Cliente getCliente() 
	{
		return cliente;
	}
	
	public void setNombre(Cliente c) 
	{
		cliente = c;
	}
}

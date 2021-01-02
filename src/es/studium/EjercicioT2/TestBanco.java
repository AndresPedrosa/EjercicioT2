package es.studium.EjercicioT2;

public class TestBanco
{

/*En esta clase llamada TestBanco escribimos el método main para poder crear objetos de las dos 
 * clases anteriormente creadas, es decir, de Clientes y de Cuentas, pudiendo aquí personalizar
 * los valores de los atributos de ambas clases para, finalmente, poder tanto mostrar dichos valores
 * mediante el método get como modificarlos con el método set y, acabar mostrando finalmente los
 * resultados de algunas de esas modificaciones.
 */
	public static void main(String[] args)
	{
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

		
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

		
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + " euros.");

		
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);

		
		System.out.println("La cuenta de " + cuentaAntonio.getCliente().getNombre() + " tiene "
				+ cuentaAntonio.getSaldo() + " euros.");
		System.out.println("La cuenta de " + cuentaBeatriz.getCliente().getNombre() + " tiene "
				+ cuentaBeatriz.getSaldo() + " euros.");

		
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);

		
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);

		
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
	}

}



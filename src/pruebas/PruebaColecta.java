package pruebas;

import org.junit.Assert;
import org.junit.Test;

import ejercicios.Colecta;

public class PruebaColecta {

	@Test
	public void crearColectaConUnMontoPositivoARecaudar() {
		
		/* operaci�n */
		Colecta colecta = new Colecta(40000.0);
		
		/* comprobaci�n */
		Assert.assertEquals("monto objetivo", 
							40000.0, colecta.obtenerObjetivo(), 0.01);	
	}
	
	@Test(expected = Error.class)
	public void crearColectaConUnMontoNegativoGeneraUnError() {
		
		new Colecta(-10000.0);
	}
	
	@Test
	public void realizarDonacionDe5000Pesos() {
		
		/* inicializaci�n */
		Colecta colecta = new Colecta(100000.0);
		
		/* operaci�n */
		colecta.donar(5000.0);
		
		/* comprobaci�n */
		Assert.assertEquals("Monto recaudado", 
							5000.0, colecta.calcularRecaudacion(), 0.01);
	}
	
	@Test
	public void realizarDosDonacionesDe5000y600Pesos() {
		
		/* inicializaci�n */
		Colecta colecta = new Colecta(100000.0);
		
		/* operaci�n */
		colecta.donar(5000.0);
		colecta.donar(600.0);
		
		/* comprobaci�n */
		Assert.assertEquals("Monto recaudado", 
							5600.0, colecta.calcularRecaudacion(), 0.01);
	}
	
	@Test(expected = Error.class)
	public void realizarDonacionConUnMontoNegativoGeneraError() {

		/* inicializaci�n */
		Colecta colecta = new Colecta(30000.0);
		
		/* operaci�n */
		colecta.donar(-100.0);
	}
}

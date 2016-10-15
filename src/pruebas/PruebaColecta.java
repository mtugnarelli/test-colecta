package pruebas;

import org.junit.Assert;
import org.junit.Test;

import ejercicios.Colecta;

public class PruebaColecta {

	@Test
	public void crearColectaConUnMontoPositivoARecaudar() {
		
		/* operación */
		Colecta colecta = new Colecta(40000.0);
		
		/* comprobación */
		Assert.assertEquals("monto objetivo", 
							40000.0, colecta.obtenerObjetivo(), 0.01);	
	}
	
	@Test(expected = Error.class)
	public void crearColectaConUnMontoNegativoGeneraUnError() {
		
		new Colecta(-10000.0);
	}
	
	@Test
	public void realizarDonacionDe5000Pesos() {
		
		/* inicialización */
		Colecta colecta = new Colecta(100000.0);
		
		/* operación */
		colecta.donar(5000.0);
		
		/* comprobación */
		Assert.assertEquals("Monto recaudado", 
							5000.0, colecta.calcularRecaudacion(), 0.01);
	}
	
	@Test
	public void realizarDosDonacionesDe5000y600Pesos() {
		
		/* inicialización */
		Colecta colecta = new Colecta(100000.0);
		
		/* operación */
		colecta.donar(5000.0);
		colecta.donar(600.0);
		
		/* comprobación */
		Assert.assertEquals("Monto recaudado", 
							5600.0, colecta.calcularRecaudacion(), 0.01);
	}
	
	@Test(expected = Error.class)
	public void realizarDonacionConUnMontoNegativoGeneraError() {

		/* inicialización */
		Colecta colecta = new Colecta(30000.0);
		
		/* operación */
		colecta.donar(-100.0);
	}
	
	@Test
	public void contarDonacionesLuegoDeDonarCincoVeces() {
		
		/* inicialización */
		Colecta colecta = new Colecta(40000);
		
		/* operación */
		colecta.donar(100);
		colecta.donar(600);
		colecta.donar(700);
		colecta.donar(100);
		colecta.donar(500);
		int donaciones = colecta.contarDonaciones();
		
		/* comprobación */
		Assert.assertEquals("donaciones", 5, donaciones);
	}
	
	@Test
	public void contarDonacionesSinDonar() {
		
		/* inicialización */
		Colecta colecta = new Colecta(40000);
		
		/* operación */
		int donaciones = colecta.contarDonaciones();
		
		/* comprobación */
		Assert.assertEquals("donaciones", 0, donaciones);
	}
} 

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
	
}

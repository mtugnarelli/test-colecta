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
}

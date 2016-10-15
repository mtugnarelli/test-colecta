package ejercicios;

public class Colecta {

	private double objetivo;

	/**
	 * post: Colecta lista para recaudar el objetivo indicado
	 *       en 'montoObjetivo'.
	 */
	public Colecta(double montoObjetivo) {

		this.objetivo = montoObjetivo;
	}

	/**
	 * post: devuelve el monto que representa el objetivo a recaudar.
	 */
	public double obtenerObjetivo() {
		
		return this.objetivo;
	}
}

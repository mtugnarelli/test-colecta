package ejercicios;

public class Colecta {

	private double objetivo;
	private double recaudacion;

	/**
	 * pre : 'montoObjetivo' debe ser un valor positivo, en [$].
	 * post: Colecta lista para recaudar el objetivo indicado
	 *       en 'montoObjetivo'.
	 */
	public Colecta(double montoObjetivo) {

		if (montoObjetivo < 0) {
			
			Error montoNegativo = new Error("El monto no puede ser negativo");
			throw montoNegativo;
		}
		
		this.objetivo = montoObjetivo;
	}

	/**
	 * post: devuelve el monto que representa el objetivo a recaudar.
	 */
	public double obtenerObjetivo() {
		
		return this.objetivo;
	}

	/**
	 * pre : 'donacion' es un valor positivo que repesenta un monto en [$].
	 * post: realiza una donación en la Colecta, agregando 'donacion' [$] 
	 * 		 a la recuadación.
	 */
	public void donar(double donacion) {
		
		if (donacion < 0) {
			
			Error montoNegativo = new Error("El monto no puede ser negativo");
			throw montoNegativo;
		}
		
		this.recaudacion = this.recaudacion + donacion;
	}

	/**
	 * post: devuelve el total de [$] recaudado en la Colecta.
	 */
	public double calcularRecaudacion() {

		return this.recaudacion;
	}
}

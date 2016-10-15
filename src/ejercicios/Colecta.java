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

		this.validar(montoObjetivo);
		
		this.objetivo = montoObjetivo;
	}

	/**
	 * post: genera un error si 'monto' es un valor invalido, es decir
	 * 		 que no corresponde con un monto en [$] porque es menor a 0.
	 */
	private void validar(double monto) {
		
		if (monto < 0) {
			
			Error montoNegativo = new Error("El monto no puede ser negativo");
			throw montoNegativo;
		}		
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
		
		this.validar(donacion);
		
		this.recaudacion = this.recaudacion + donacion;
	}

	/**
	 * post: devuelve el total de [$] recaudado en la Colecta.
	 */
	public double calcularRecaudacion() {

		return this.recaudacion;
	}
}

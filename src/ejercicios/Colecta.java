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

	public void donar(double donacion) {
		
		if (donacion < 0) {
			
			Error montoNegativo = new Error("El monto no puede ser negativo");
			throw montoNegativo;
		}
		
		this.recaudacion = this.recaudacion + donacion;
	}

	public double calcularRecaudacion() {

		return this.recaudacion;
	}
}

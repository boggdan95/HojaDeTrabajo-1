
/**
 * @author Boggdan Barrientos, Bryan Chan, Pablo Arriola
 *
 */
public interface radio {
	
	
	/**
	 * es mi constante int que me da por cuanto va a ser el cambio de emisora en AM
	 */
	static final int constCambioAM = 10;
	
	/**
	 *  es mi constante double que me va a decir por cuanto va a ser el cambio en FM
	 */
	
	static final double constCambioFM = 0.2;
	
	/**
	 * es una constante y es la ultima emisora que va a sonar de esa no puede pasar AM
	 */
	static final int maxAM = 1610;
	
	
	/**
	 * es una constante y es la ultima emisora que va a sonar de esa no puede pasar AM
	 */
	static final int minAM = 530;
	
	/**
	 * es una constante y es la ultima emisora que va a sonar de esa no puede pasar FM
	 */
	static final double maxFM = 107.9;
	
	/**
	 * es una constante y es la ultima emisora que va a sonar de esa no puede pasar FM
	 */
	static final double minFM = 87.9;
	
	/**
	 * sirve para apagar o prender la radio
	 * @return boolean 
	 */
	public boolean encenderApagar();
	
	/**
	 * sirve para cambiar la frecuencia en la radio
	 * @return String
	 */
	public String cambiarFrecuencia ();
	
	/**
	 * este me carga la emisora
	 * @param posicion es la posicion de la emisora en el arreglo
	 * @return String
	 */
	public double cargarEmisora(int posicion);
	
	/**
	 * para cambiar de emisora hacia adelante
	 * @return double
	 */
	public double adelantarEmisora();
	
	/**
	 * para cambiar de emisora o retornar a la anterior
	 * @return double
	 */
	public double retrocederEmisora();
	
	/**
	 * @param emisora pasa el numero de la emisora que esta sonando
	 * @param posicion pasa la posicion de esta en el arreglo
	 * @return double que es donde se va a guardar la emisora
	 */
	public double guardarEmisora(double emisora, int posicion);
	
	/**
	 * para subir el volumen de la radio
	 * @return int
	 */
	public int subirVolumen();
	
	/**
	 * para bajar el volumen de la radio
	 * @return int
	 */
	public int bajarVolumen();
}

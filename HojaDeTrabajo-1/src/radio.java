
public interface radio {
	
	
	static final int constCambioAM = 10;
	static final double constCambioFM = 0.2;
	static final int maxAM = 1610;
	static final int minAM = 530;
	static final double maxFM = 107.9;
	static final double minFM = 87.9;
	
	public boolean encenderApagar();
	
	public String cambiarFrecuencia ();
	
	public double cargarEmisora(int posicion);
	
	public double adelantarEmisora();
	
	public double retrocederEmisora();
	
	public double guardarEmisora(double emisora, int posicion);
	
	public int subirVolumen();
	
	public int bajarVolumen();
}

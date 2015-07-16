/**
 * 
 */

/**
 * @author Boggdan Barrientos, Bryan Chan, Pablo Arriola
 *
 */
public class radioBBP implements radio {

	
	private int volumenActual = 0;
	private double emisoraActual = 87.9;
	private String frecuenciaActual = "FM";
	private boolean estadoActual = false;
	private double[] ams = new double[12];
	private double[] fms = new double[12];
	
	
	
	/* (non-Javadoc)
	 * @see radio#encenderApagar()
	 */
	@Override
	public boolean encenderApagar() {
		// TODO Auto-generated method stub
		if(estadoActual==true){
			estadoActual = false;
		} else {
			estadoActual = true;
		}
		
		return estadoActual;
	}

	/* (non-Javadoc)
	 * @see radio#cambiarFrecuencia()
	 */
	@Override
	public String cambiarFrecuencia() {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			frecuenciaActual = "AM";
		} else {
			frecuenciaActual = "FM";
		}
		
		return frecuenciaActual;
	}

	/* (non-Javadoc)
	 * @see radio#cambiarEmisora()
	 */
	@Override
	public double cargarEmisora(int posicion) {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			return fms[posicion-1];
		} else {
			return ams[posicion-1];
		}
	}

	/* (non-Javadoc)
	 * @see radio#adelantarEmisora()
	 */
	@Override
	public double adelantarEmisora() {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			if(emisoraActual<107.9){
				emisoraActual = emisoraActual + 0.2;
			}
		} else {
			if(emisoraActual<1610){
				emisoraActual = emisoraActual + 10;
			}
		}
		
		return (double)Math.round(emisoraActual * 10) / 10;
	}

	/* (non-Javadoc)
	 * @see radio#retrocederEmisora()
	 */
	@Override
	public double retrocederEmisora() {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			if(emisoraActual>87.9){
				emisoraActual = emisoraActual - 0.2;
			}
		} else {
			if(emisoraActual>530){
				emisoraActual = emisoraActual - 10;
			}
		}
		
		return (double)Math.round(emisoraActual * 10) / 10;
	}

	/* (non-Javadoc)
	 * @see radio#guardarEmisora()
	 */
	@Override
	public double guardarEmisora(double emisora, int posicion) {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			fms[posicion] = emisora;
		} else {
			ams[posicion] = emisora;
		}
		
		return emisora;
	}

	/* (non-Javadoc)
	 * @see radio#subirVolumen()
	 */
	@Override
	public int subirVolumen() {
		// TODO Auto-generated method stub
		if(volumenActual!=100){
			volumenActual++;
		}
		return volumenActual;
	}

	/* (non-Javadoc)
	 * @see radio#bajarVolumen()
	 */
	@Override
	public int bajarVolumen() {
		// TODO Auto-generated method stub
		if(volumenActual!=0){
			volumenActual--;
		}
		return volumenActual;
	}

}

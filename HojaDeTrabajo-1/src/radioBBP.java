/**
 * 
 */

/**
 * @author Boggdan Barrientos, Bryan Chan, Pablo Arriola
 *
 */
public class radioBBP implements radio {

	
	private int volumenActual = 0;
	private double emisoraActual = 87.5;
	private String frecuenciaActual = "FM";
	private boolean estadoActual = false;
	
	
	
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
	public double cambiarEmisora() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see radio#adelantarEmisora()
	 */
	@Override
	public double adelantarEmisora() {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			if(emisoraActual!=107.9){
				emisoraActual = emisoraActual + 0.2;
			}
		} else {
			if(emisoraActual!=1610){
				emisoraActual = emisoraActual + 10;
			}
		}
		
		return emisoraActual;
	}

	/* (non-Javadoc)
	 * @see radio#retrocederEmisora()
	 */
	@Override
	public double retrocederEmisora() {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			if(emisoraActual!=87.9){
				emisoraActual = emisoraActual - 0.2;
			}
		} else {
			if(emisoraActual!=530){
				emisoraActual = emisoraActual - 10;
			}
		}
		
		return emisoraActual;
	}

	/* (non-Javadoc)
	 * @see radio#guardarEmisora()
	 */
	@Override
	public double guardarEmisora() {
		// TODO Auto-generated method stub
		return 0;
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

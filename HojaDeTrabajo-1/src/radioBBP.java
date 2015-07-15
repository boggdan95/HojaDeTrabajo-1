/**
 * 
 */

/**
 * @author Boggdan Barrientos, Bryan Chan, Pablo Arreola
 *
 */
public class radioBBP implements radio {

	
	private int volumenActual = 0;
	private String emisoraActual = "FM";
	private double frecuenciaActual = 87.5;
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
		return null;
	}

	/* (non-Javadoc)
	 * @see radio#cambiarEmisora()
	 */
	@Override
	public double cambiarEmisora() {
		// TODO Auto-generated method stub
		if(emisoraActual=="FM"){
			emisoraActual = "AM";
		} else {
			emisoraActual = "FM";
		}
		
		return emisoraActual;
	}

	/* (non-Javadoc)
	 * @see radio#adelantarEmisora()
	 */
	@Override
	public double adelantarEmisora() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see radio#retrocederEmisora()
	 */
	@Override
	public double retrocederEmisora() {
		// TODO Auto-generated method stub
		return 0;
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
		volumenActual++;
		return volumenActual;
	}

	/* (non-Javadoc)
	 * @see radio#bajarVolumen()
	 */
	@Override
	public int bajarVolumen() {
		// TODO Auto-generated method stub
		volumenActual--;
		return volumenActual;
	}

}

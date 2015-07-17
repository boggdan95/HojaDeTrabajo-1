
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
	
	
	
	/* 
	 * @see radio#encenderApagar()
	 * este va a ser el metodo que se va a utlizar para encender la radio si esta prendida se apaga si esta apagada se enciende
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

	/* 
	 * @see radio#cambiarFrecuencia()
	 * va a ser mi metodo para cambiar de frecuencia si es esta en am va a pasar a fm. Cada una tiene su frecuencia inicial que se acordo en clase
	 */
	@Override
	public String cambiarFrecuencia() {
		// TODO Auto-generated method stub
		if(frecuenciaActual=="FM"){
			frecuenciaActual = "AM";
			emisoraActual = 530;
		} else {
			frecuenciaActual = "FM";
			emisoraActual = 87.9;
		}
		
		return frecuenciaActual;
	}

	/* 
	 * @see radio#cambiarEmisora()
	 * este me va a servir para cambiar de emisora, seleccionando un boton
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

	/* 
	 * @see radio#adelantarEmisora()
	 * este es mi metodo para adelantar de la emisora se le va a sumar a la emisora actual una constante dependiendo de si es am o fm
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

	/* 
	 * @see radio#retrocederEmisora()
	 * es el mismo que para adelantar la emisora pero ahora se resta en vez de sumar
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

	/* 
	 * @see radio#guardarEmisora()
	 * sirve para guardar la estacion actual en una emisora
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

	/* 
	 * @see radio#subirVolumen()
	 * sirve para subir de volumen no puede pasar de 100
	 */
	@Override
	public int subirVolumen() {
		// TODO Auto-generated method stub
		if(volumenActual!=100){
			volumenActual++;
		}
		return volumenActual;
	}

	/* 
	 * @see radio#bajarVolumen()
	 * sirve para bajar de volumen y el minimo es 0
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

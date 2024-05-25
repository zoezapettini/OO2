package ejercicio22.ejercicio22;

public class SubteWay {
	
	private Constructor constructor;
	
	public SubteWay(Constructor constructor) {
		this.constructor=constructor;
		// TODO Auto-generated constructor stub
	}

	public void cambiarConstructor(Constructor constructor) {
		this.constructor=constructor;
	}
	
	public void hacerSandwich() {
		this.constructor.crearSandwich();
		this.constructor.agregarPan();
		this.constructor.agregarAderezo();
		this.constructor.agregarPrincipal();
		this.constructor.agregarAdicional();
	}
}

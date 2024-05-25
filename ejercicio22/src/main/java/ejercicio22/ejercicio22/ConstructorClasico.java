package ejercicio22.ejercicio22;

public class ConstructorClasico extends Constructor{
	
	public void agregarPan() {
		this.getSanguche().setPan(100);
	}
	
	public void agregarAderezo() {
		this.getSanguche().setAderezo(20);
	}
	
	public void agregarPrincipal() {
		this.getSanguche().setPrincipal(300);
	}
	
	public void agregarAdicional() {
		this.getSanguche().setAdicional(80);
	}

}

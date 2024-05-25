package ejercicio22.ejercicio22;

public class ConstructorVegano extends Constructor{
	
	public void agregarPan() {
		this.getSanguche().setPan(100);
	}
	
	public void agregarAderezo() {
		this.getSanguche().setAderezo(20);
	}
	
	public void agregarPrincipal() {
		this.getSanguche().setPrincipal(500);
	}
	
	public void agregarAdicional() {
		this.getSanguche().setAdicional(0);
	}


}

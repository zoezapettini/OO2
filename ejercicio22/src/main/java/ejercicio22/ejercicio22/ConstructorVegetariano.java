package ejercicio22.ejercicio22;

public class ConstructorVegetariano extends Constructor {
	public void agregarPan() {
		this.getSanguche().setPan(120);
	}
	
	public void agregarAderezo() {
		this.getSanguche().setAderezo(0);
	}
	
	public void agregarPrincipal() {
		this.getSanguche().setPrincipal(200);
	}
	
	public void agregarAdicional() {
		this.getSanguche().setAdicional(100);
	}


}

package ejercicio22.ejercicio22;

public abstract class Constructor {
	private Sandwich sanguche; //es que es 25 de mayo
	
	public void crearSandwich() {
		this.sanguche= new Sandwich();
	}
	
	public Sandwich getSanguche() {
		return sanguche;
	}

	public abstract void agregarPan();

	public abstract void agregarAderezo();

	public abstract void agregarPrincipal();

	public abstract void agregarAdicional();

}

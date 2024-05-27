package repasoOO2.repasoEjercicio4;

public abstract class Empleado {
	
	private boolean estaCasado;
	private int cantidadHijos;
	
	public Empleado(boolean estaCasado, int cantidadHijos) {
		this.estaCasado= estaCasado;
		this.cantidadHijos= cantidadHijos;
		// TODO Auto-generated constructor stub
	}
	
	public abstract double sueldoBasico();
	
	public abstract double adicional();
	
	public double descuento() {
		return this.sueldoBasico() * 0.13 + this.adicional() * 0.05;
	}
	
	public double sueldo() {
		return (this.sueldoBasico() + this.adicional() )-  this.descuento();
	}
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	public boolean isEstaCasado() {
		return estaCasado;
	}

}

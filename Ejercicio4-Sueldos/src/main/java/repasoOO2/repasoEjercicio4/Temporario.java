package repasoOO2.repasoEjercicio4;

public class Temporario extends Empleado {
	
	private int cantidadHoras;
	
	public Temporario(boolean estaCasado, int cantidadHijos, int cantidadHoras) {
		super(estaCasado, cantidadHijos);
		this.cantidadHoras=cantidadHoras;
		// TODO Auto-generated constructor stub
	}
	
	public double sueldoBasico() {
		return 20000 + this.cantidadHoras * 300;
	}
	
	public double adicional() {
		double adicional=0;
		if (this.isEstaCasado())
			adicional= 5000;
		return adicional + (2000*this.getCantidadHijos());
	}

}

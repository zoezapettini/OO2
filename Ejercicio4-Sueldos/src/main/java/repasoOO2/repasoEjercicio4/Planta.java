package repasoOO2.repasoEjercicio4;

public class Planta extends Empleado{
	
	private int antiguedad;
	
	public Planta(boolean estaCasado, int cantHijos, int antiguedad) {
		super(estaCasado, cantHijos);
		this.antiguedad=antiguedad;
		// TODO Auto-generated constructor stub
	}
	
	public double sueldoBasico() {
		return 50000;
	}
	
	public double adicional() {
		double adicional=0;
		if (this.isEstaCasado())
			adicional= 5000;
		return adicional + (2000*this.getCantidadHijos()) + (this.antiguedad *2000);
	}


}

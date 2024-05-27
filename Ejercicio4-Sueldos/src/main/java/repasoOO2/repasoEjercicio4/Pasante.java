package repasoOO2.repasoEjercicio4;

public class Pasante extends Empleado{
	
	private int cantExamenesRendidos;
	
	public Pasante(int cantExamenes) {
		super(false, 0);
		this.cantExamenesRendidos= cantExamenes;
	}
	
	public double sueldoBasico() {
		return 20000;
	}
	
	public double adicional() {
		return this.cantExamenesRendidos *2000;
	}

}

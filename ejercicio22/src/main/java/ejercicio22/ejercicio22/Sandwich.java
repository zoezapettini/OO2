package ejercicio22.ejercicio22;

public class Sandwich {
   
	private double pan, aderezo, principal, adicional;
	
	public Sandwich() {
		// TODO Auto-generated constructor stub
	}
	
	public void setAderezo(double aderezo) {
		this.aderezo = aderezo;
	}

  public void setAdicional(double adicional) {
	this.adicional = adicional;
}
  public void setPan(double pan) {
	this.pan = pan;
}
  public void setPrincipal(double princial) {
	this.principal = princial;
}
  
  public double calcularCosto() {
	  return this.pan + this.aderezo + this.adicional + this.principal;
  }
  
  
}

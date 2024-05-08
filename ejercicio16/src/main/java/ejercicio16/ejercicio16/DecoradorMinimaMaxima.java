package ejercicio16.ejercicio16;

public class DecoradorMinimaMaxima extends Decorator {
	
	public DecoradorMinimaMaxima(Temperatura temp) {
		super(temp);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String displayData() {
		// TODO Auto-generated method stub
		return super.displayData() + "; Minimo: " + this.minimaHistorica() + "Máximo: "+ this.maximaHistorica();
	}

	
	private double minimaHistorica() {
		return this.getTemperaturas().stream().mapToDouble(temp-> temp.doubleValue()).min().orElse(0);
	}
	
	private double maximaHistorica() {
		return this.getTemperaturas().stream().mapToDouble(temp-> temp.doubleValue()).min().orElse(0);
	}
	
}

package oo2TerceraFecha2023.terceraFecha2023;

public abstract class ComponenteVisual {
	
	private ConfiguracionDeEstilo estiloActual;
	
	public ComponenteVisual(ConfiguracionDeEstilo estilo) {
		this.estiloActual=estilo;
		// TODO Auto-generated constructor stub
	}
	
	public void setEstiloActual(ConfiguracionDeEstilo estiloActual) {
		this.estiloActual = estiloActual;
	}
	
	public ConfiguracionDeEstilo getEstiloActual() {
		return estiloActual;
	}
	
	public abstract void aplicarEstilo(ConfiguracionDeEstilo estilo);
	public abstract String imprimir();

}

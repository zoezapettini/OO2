package oo2TerceraFecha2023.terceraFecha2023;

public abstract class ElementoBasico extends ComponenteVisual{
	
	private String texto;
	
	public ElementoBasico(ConfiguracionDeEstilo estilo, String texto){
		super(estilo);
		this.texto=texto;
		// TODO Auto-generated constructor stub
	}
	
	public String imprimir() {
		return this.imprimir();
	}

	public String getTexto() {
		return texto;
	}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.setEstiloActual(estilo);
		
	}
	

}

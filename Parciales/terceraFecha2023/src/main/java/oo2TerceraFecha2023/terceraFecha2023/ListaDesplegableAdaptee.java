package oo2TerceraFecha2023.terceraFecha2023;

public class ListaDesplegableAdaptee extends ComponenteVisual{
	
	private ListaDesplegable adaptee;
	
	public ListaDesplegableAdaptee(ListaDesplegable lista, ConfiguracionDeEstilo estilo) {
		super(estilo);
		this.adaptee=lista;
		// TODO Auto-generated constructor stub
	}

	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.adaptee.setStyle(estilo.getEstiloEtiqueta());
		// TODO Auto-generated method stub
		
	}
	
	
	public String imprimir() {
		
		return this.adaptee.print();
	}
	

}

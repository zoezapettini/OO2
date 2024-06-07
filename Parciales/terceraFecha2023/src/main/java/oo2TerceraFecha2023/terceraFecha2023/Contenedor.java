package oo2TerceraFecha2023.terceraFecha2023;
import java.util.*;
import java.util.stream.Collectors;

public class Contenedor extends ComponenteVisual{
	
	private List<ComponenteVisual>componentes;
	
	public Contenedor(ConfiguracionDeEstilo estilo, List<ComponenteVisual>componentes) {
		super(estilo);
		this.componentes=componentes;
		// TODO Auto-generated constructor stub
	}
	
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.componentes.forEach(componente-> componente.aplicarEstilo(estilo));
		
	}
	
	public String imprimir() {
		return "<contenedor>" + this.componentes.stream().map(componente-> componente.imprimir()).collect(Collectors.joining())+ "<contenedor>";
	}
	

}

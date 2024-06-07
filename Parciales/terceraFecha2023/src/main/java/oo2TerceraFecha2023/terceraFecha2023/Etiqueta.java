package oo2TerceraFecha2023.terceraFecha2023;

public class Etiqueta extends ElementoBasico {
	
	public Etiqueta(ConfiguracionDeEstilo estilo, String texto) {
		super(estilo, texto);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return "<etiqueta>" + this.getEstiloActual().getEstiloEtiqueta() + " " + this.getTexto() + "</etiqueta>" ;
	}

}

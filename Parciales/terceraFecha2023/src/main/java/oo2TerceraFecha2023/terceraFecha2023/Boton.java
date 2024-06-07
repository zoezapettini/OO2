package oo2TerceraFecha2023.terceraFecha2023;

public class Boton extends ElementoBasico {
	private String accion;
	
	public Boton(ConfiguracionDeEstilo estilo, String texto, String accion) {
		// TODO Auto-generated constructor stub
		super(estilo, texto);
		this.accion=accion;
	}
	
	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return "<etiqueta>" + this.getEstiloActual().getEstiloBoton() + "texto=" + this.getTexto() + " 'accion=" + this.accion +" '/>" ;
	}

}

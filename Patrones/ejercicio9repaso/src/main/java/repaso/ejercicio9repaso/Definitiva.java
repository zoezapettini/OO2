package repaso.ejercicio9repaso;

public class Definitiva implements Etapa {

	@Override
	public void inscribirse(Excursion excursion, Usuario usuario) {
		if (excursion.llegoAlMaximo())
			excursion.setEtapa(new Llena());
		excursion.añadirInscripto(usuario);

	}
	
	public String infoExcursion(Excursion excursion) {
		return  excursion.toString() + "Cantidad de usuarios faltantes para el cupo maximo: "+ excursion.faltantesMaximo();
	}

}

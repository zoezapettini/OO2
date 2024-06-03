package repaso.ejercicio9repaso;

public class Provisoria implements Etapa {

	public void inscribirse(Excursion excursion, Usuario usuario) {
		if (excursion.llegoAlMinimo())
			excursion.setEtapa(new Definitiva());
		excursion.añadirInscripto(usuario);
	}
	
	public String infoExcursion(Excursion excursion) {
		return  excursion.toString() + "Cantidad de usuarios faltantes para el cupo minimo: "+ excursion.faltantesMinimo();
	}
}

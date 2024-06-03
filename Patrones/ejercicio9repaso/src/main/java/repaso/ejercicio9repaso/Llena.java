package repaso.ejercicio9repaso;

public class Llena implements Etapa {

	@Override
	public void inscribirse(Excursion excursion, Usuario usuario) {
		excursion.añadirALista(usuario);

	}

	public String infoExcursion(Excursion excursion) {
		return  excursion.toString();
	}
}

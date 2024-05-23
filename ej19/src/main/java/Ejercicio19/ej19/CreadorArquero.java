package Ejercicio19.ej19;

public class CreadorArquero implements CreadorPersonaje {
	
	public Arquero crearPersonaje(String nombre) {
		return new Arquero(nombre, new DeCuero(), new Arco(), "tiros de flecha");
	}

}

package Ejercicio19.ej19;

public class CreadorMago implements CreadorPersonaje{
	
	public Mago crearPersonaje(String nombre) {
		return new Mago(nombre, new DeCuero(), new Baston(), "magia y combate a distancia");
	}

}

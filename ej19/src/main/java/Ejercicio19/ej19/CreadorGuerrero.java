package Ejercicio19.ej19;

public class CreadorGuerrero implements CreadorPersonaje{
	
	public Guerrero crearPersonaje(String nombre) {
		return new Guerrero(nombre, new DeAcero(), new Espada(), "combate cuerpo a cuerpo");
	}

}

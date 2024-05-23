package Ejercicio19.ej19;

public abstract class Personaje {
	
	private String nombre;
	private Armadura armadura;
	private Arma arma;
	private String habilidades;//ver si es una lista
	private int ptosVida;
	
	
	public Personaje(String nombre, Armadura armadura, Arma arma, String habilidades) {
		this.nombre=nombre;
		this.arma=arma;
		this.armadura=armadura;
		this.habilidades=habilidades;
		this.ptosVida=100;
		// TODO Auto-generated constructor stub
	}
	

	
	public Armadura getArmadura() {
		return armadura;
	}
	private void restarPtosVida(int resta) {
		this.ptosVida-= resta;
	}

	public int getPtosVida() {
		return ptosVida;
	}
   public Arma getArma() {
	return arma;
}
	private boolean vivo() {
		return this.getPtosVida()>0;
	}
   
	public void darCombate(Personaje otroPersonaje) {
		if (this.vivo()) {
		int resta =this.getArma().contraArmadura(otroPersonaje.getArmadura());
		otroPersonaje.restarPtosVida(resta);
		}
	}

}

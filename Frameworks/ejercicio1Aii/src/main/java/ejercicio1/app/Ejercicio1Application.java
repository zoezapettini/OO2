package ejercicio1.app;

import java.io.IOException;

import javax.swing.SwingUtilities;

import ejercicio1.ui.WallPostUI;

import java.util.logging.*;

public class Ejercicio1Application {

	
	
	public static void main(String[] args) throws SecurityException, IOException {
		Logger modeloLogger= Logger.getLogger("modelo");
		Logger interfazLogger= Logger.getLogger("interfaz");
		modeloLogger.setLevel(Level.WARNING);
		interfazLogger.setLevel(Level.INFO);
        FileHandler fileHandler = new FileHandler("registro.txt");
        fileHandler.setFormatter(new SimpleFormatter());
        modeloLogger.addHandler(fileHandler);
	interfazLogger.addHandler(fileHandler);
        SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
        		new WallPostUI();
        	}
        });
	

}
}

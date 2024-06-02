package fwOO2.ejercicio1FW;


import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class DatabaseRealAccessProxy implements DatabaseAccess {
	
	private String password;
	private DatabaseRealAccess db;
	private boolean log;
	
	public DatabaseRealAccessProxy(String password, DatabaseRealAccess database) throws IOException {
	    this.password = password;
	    this.db = database;
	}

	public DatabaseRealAccess getDb() {
		return this.db;
	}
	
	
	private boolean verificarAcceso() {
		String password;
		System.out.println("Ingrese la contraseña de la bd");
	    Scanner scanner = new Scanner(System.in); 
        password = scanner.nextLine(); 
        scanner.close();
        return this.password.equals(password);
	}

	public boolean isLog() {
		return log;
	}
	
	 public int insertNewRow(List<String> rowData) {
		 if(!this.isLog()) {
		 if (this.verificarAcceso()) {
			this.log=true;
			Logger.getLogger("bd").log(Level.WARNING, "Se insertó en la base de datos exitosamente");
			return this.db.insertNewRow(rowData);
			
		 }
		 else {
			 System.out.println("Error: contraseña incorrecta");
			 Logger.getLogger("bd").log(Level.SEVERE, "Acceso inválido a la base de datos");
			 
			 return -1;
		 }
		 }
		 return this.db.insertNewRow(rowData);
	 }
	 public Collection<String> getSearchResults(String queryString){
		 if(!this.isLog()) {
		 if (this.verificarAcceso()) {
			 this.log=true;
			 Logger.getLogger("bd").log(Level.INFO, "Se accedió a la busqueda de información exitosamente");
			 return this.db.getSearchResults(queryString);
		 }
		 else {
			 System.out.println("Error:contraseña incorrecta");
			 Logger.getLogger("bd").log(Level.SEVERE, "Acceso inválido a la base de datos");
			 return null;
		 }
		 }
		 return this.db.getSearchResults(queryString);
	 }
	 
}

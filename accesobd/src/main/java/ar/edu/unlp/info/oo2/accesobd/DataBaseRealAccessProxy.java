package ar.edu.unlp.info.oo2.accesobd;
import java.util.*;
public class DataBaseRealAccessProxy implements DatabaseAccess {
	
	private String password;
	private DatabaseRealAccess db;
	private boolean log;
	
	public DataBaseRealAccessProxy(String password, DatabaseRealAccess database) {
		this.password=password;
		this.db=database; 
		// TODO Auto-generated constructor stub
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
			return this.db.insertNewRow(rowData);
			
		 }
		 else {
			 System.out.println("Error: contraseña incorrecta");
			 return -1;
		 }
		 }
		 return this.db.insertNewRow(rowData);
	 }
	 public Collection<String> getSearchResults(String queryString){
		 if(!this.isLog()) {
		 if (this.verificarAcceso()) {
			 this.log=true;
			 return this.db.getSearchResults(queryString);
		 }
		 else {
			 System.out.println("Error:contraseña incorrecta");
			 return null;
		 }
		 }
		 return this.db.getSearchResults(queryString);
	 }
	 
}

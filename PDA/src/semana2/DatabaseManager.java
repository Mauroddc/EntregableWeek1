package semana2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

	private static Connection databaseConnection;
	
	private static String CONECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private static String USUARIO = "SYSTEM";                                            
	private static String CLAVE = "mdiaZ1991*";                                             
	
	static {
		databaseConnection = null;
	
	try { 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		System.out.println("Se encontró el Driver para Oracle DB - La librería necesaria está referenciada");
	
		try { 
			databaseConnection = DriverManager.getConnection(CONECTION_STRING,USUARIO,CLAVE);
			System.out.println("Conexión creada con éxito, es posible acceder a la base de datos");
		
		} catch(SQLException e) {
			System.out.println("No logramos instanciar una conexión");
			e.printStackTrace();
		} 
	
	}catch (ClassNotFoundException e) {
		System.out.println("No tienes el driver en tu build-path?");
		e.printStackTrace();
	} 
}

public static Connection getConnection() {
	return databaseConnection;
	}
}
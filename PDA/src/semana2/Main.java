package semana2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		try {
			Connection connection = DatabaseManager.getConnection();
			//----------------------------------------------
			try {
				String consulta = "SELECT * FROM PERSONAV2";
				
				//Forma de parsear un string ingresado por el usuario a INT
				 String idPersonaST = JOptionPane.showInputDialog("Id: ");
			     Integer idPersona;
			     idPersona = Integer.parseInt(idPersonaST);
			     //Solicito el resto de los datos
			     String documento = JOptionPane.showInputDialog("Documento: ");
			     String apellido1 = JOptionPane.showInputDialog("Apellido1: ");
			     String apellido2 = JOptionPane.showInputDialog("Apellido2: ");
			     String nombre1 = JOptionPane.showInputDialog("Nombre1: ");
			     String nombre2 = JOptionPane.showInputDialog("Nombre2: ");
				//Creo la consulta para insertar los datos en la BD, y se los asigno a un string
			     String INSERT_PERSONA = "INSERT INTO PERSONAV2 (ID_PERSONA, DOCUMENTO, APELLIDO1, APELLIDO2, NOMBRE1, NOMBRE2) values (?,?,?,?,?,?)";
			     //Ingreso los datos a la BD
			     PreparedStatement statement = connection.prepareStatement(INSERT_PERSONA);
			     statement.setInt(1, idPersona);
			     statement.setString(2, documento);
			     statement.setString(3, apellido1);
			     statement.setString(4, apellido2);
			     statement.setString(5, nombre1);
			     statement.setString(6, nombre2);
			     
			     int filasIngresadas = statement.executeUpdate();
			     //Imprimo el total de registros de la tabla PERSONAV2 junto al ultimo registro ingresado
			     Statement sentencia = connection.createStatement();
				 ResultSet personasRS = sentencia.executeQuery(consulta);
			     
			     while (personasRS.next()){
							System.out.println(personasRS.getString("DOCUMENTO")+ "-" + personasRS.getString("NOMBRE1") + "-" + personasRS.getString("APELLIDO1"));
					}   
				
			} catch (SQLException e) {
				System.out.println("Error al ejecutar la consulta");
				e.printStackTrace();
				return;
			}
			//----------------------------------------------
			connection.close();
			System.out.println("Conexión cerrada satisfacoriamente");
			
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexion");
			e.printStackTrace();
			return;	
		}
	}
}
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizaTabla {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/pruebas";
		String usuario = "root";
		String password = "tu_contraseña";

		try {

			// Crear conexion
			Connection miConnection = DriverManager.getConnection(url, usuario, password);

			// Crear statement
			Statement miStatement = miConnection.createStatement();

			// Ejecutar instruccion SQL
			ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM productos");

			

			// Cerrar conexiones al final
			miResultSet.close();
			miConnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Statement;

public class dbInicioSesion {
    private Connection connection;

    public dbInicioSesion () {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/dbInicioSesion";
            String username = "postgres";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Boolean validarDatos(Integer usuario, String contrasena) {
        try {
            String query = "SELECT * FROM \"Credenciales\" WHERE \"PK_CREDEENCIALES\" = ? AND \"PASSWORD\" = ?;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, usuario);
            statement.setString(2, contrasena);
            ResultSet result = statement.executeQuery();
            return result.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        dbInicioSesion dbInicioSesion = new dbInicioSesion();
        System.out.println(dbInicioSesion.validarDatos(72685420, "hola1234"));
    }
}

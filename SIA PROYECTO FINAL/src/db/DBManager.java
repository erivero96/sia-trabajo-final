package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager{
    private Connection connection;

    public DBManager () {
        try {
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/dbCoteind";
            String username = "postgres";
            String password = "root";
            connection = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String[] opcionesComboEstatus() {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            String query = "SELECT * FROM \"MAE_ESTATUS\";";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                lista.add(result.getString("DESCRIPCION"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista.toArray(new String[lista.size()]);
    }

    public String[] opcionesComboCuenta() {
        ArrayList<String> lista = new ArrayList<String>();
        try {
            String query = "SELECT * FROM \"MAE_CUENTA\";";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
            lista.add(result.getString("PK_MAE_CUENTA"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista.toArray(new String[lista.size()]);
    }

    public String[] opcionesComboTipoOperacion() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            String query = "SELECT * FROM \"MAE_TIPO_DOCUMENTO\";";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                lista.add(result.getString("DESCRIPCION"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista.toArray(new String[lista.size()]);
    }

    public void insertarCheque(Cheque cheque) {
        try {
            String query = "INSERT INTO \"TRS_CHEQUE\" (\"FECHA\", \"FK_TRS_CHEQUE_MAE_CUENTA\", \"NUMERO\", \"CONCEPTO\", \"FK_TRS_CHEQUE_MAE_PROVEEDOR\", \"IMPORTE\", \"FK_TRS_CHEQUE_TRS_REGISTRO_TRANSACCION\", \"FK_TRS_CHEQUE_MAE_ESTATUS\") VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setDate(1, cheque.getFecha());
            statement.setLong(2, cheque.getMaeCuenta());
            statement.setInt(3, cheque.getNumero());
            statement.setString(4, cheque.getConcepto());
            statement.setLong(5, cheque.getMaeProveedor());
            statement.setBigDecimal(6, cheque.getImporte());
            statement.setLong(7, cheque.getTrsRegistroTransaccion());
            statement.setLong(8, cheque.getMaeEstatus());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Boolean validarProveedorExiste(Integer idProveedor) {
        try {
            String query = "SELECT * FROM \"MAE_PROVEEDOR\" WHERE \"PK_MAE_PROVEEDOR\" = ?;";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, idProveedor);
            ResultSet result = statement.executeQuery();
            return result.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}

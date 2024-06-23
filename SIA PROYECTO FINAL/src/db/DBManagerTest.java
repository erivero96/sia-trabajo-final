package db;

import java.sql.Date;
import java.math.BigDecimal;


public class DBManagerTest {
    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        String[] opcionesComboEstatus = dbManager.opcionesComboEstatus();
        for (String opcion : opcionesComboEstatus) {
            System.out.println(opcion);
        }
        String[] opcionesComboCuenta = dbManager.opcionesComboCuenta();
        for (String opcion : opcionesComboCuenta) {
            System.out.println(opcion);
        }
        String[] opcionesComboTipoOperacion = dbManager.opcionesComboTipoOperacion();
        for (String opcion : opcionesComboTipoOperacion) {
            System.out.println(opcion);
        }

        Date fecha = Date.valueOf("2022-01-02");
        dbManager.insertarCheque(new Cheque(fecha, 215202022, 4, "concepto", 4001001, new BigDecimal("100"), 1, 1));
        System.out.println(dbManager.validarProveedorExiste(4001001));
    }

}

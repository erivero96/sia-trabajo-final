package db;

import java.math.BigDecimal;
import java.sql.Date;

public class Cheque {
    private Date fecha;
    private long maeCuenta;
    private int numero;
    private String concepto;
    private long maeProveedor;
    private BigDecimal importe;
    private long trsRegistroTransaccion;
    private long maeEstatus;

    // Constructor
    public Cheque(Date fecha, long maeCuenta, int numero, String concepto, long maeProveedor, BigDecimal importe, long trsRegistroTransaccion, long maeEstatus) {
        this.fecha = fecha;
        this.maeCuenta = maeCuenta;
        this.numero = numero;
        this.concepto = concepto;
        this.maeProveedor = maeProveedor;
        this.importe = importe;
        this.trsRegistroTransaccion = trsRegistroTransaccion;
        this.maeEstatus = maeEstatus;
    }

    public Cheque() {
    }

    // Getters and Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getMaeCuenta() {
        return maeCuenta;
    }

    public void setMaeCuenta(long maeCuenta) {
        this.maeCuenta = maeCuenta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public long getMaeProveedor() {
        return maeProveedor;
    }

    public void setMaeProveedor(long maeProveedor) {
        this.maeProveedor = maeProveedor;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public long getTrsRegistroTransaccion() {
        return trsRegistroTransaccion;
    }

    public void setTrsRegistroTransaccion(long trsRegistroTransaccion) {
        this.trsRegistroTransaccion = trsRegistroTransaccion;
    }

    public long getMaeEstatus() {
        return maeEstatus;
    }

    public void setMaeEstatus(long maeEstatus) {
        this.maeEstatus = maeEstatus;
    }

    public Boolean validarNoNulls() {
        return fecha != null && concepto != null && importe != null;
    }
    
}

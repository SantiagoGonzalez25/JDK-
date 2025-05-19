// Ventas.java
package rutas_Ventas;

import usuarios.Usuario;
import java.sql.Date;

public class Ventas {
    private long idVenta;
    private String cliente;
    private Usuario vendedor;
    private Date fechaDeVenta;
    private double monto;

    public Ventas(long idVenta, String cliente, Usuario vendedor, Date fechaDeVenta, double monto) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fechaDeVenta = fechaDeVenta;
        this.monto = monto;
    }

    public long getIdVenta() {
        return idVenta;
    }

    public String obtenerDetalleVenta() {
        return "Venta ID: " + idVenta + " - Monto: $" + monto;
    }

    public String getCliente() {
        return cliente;
    }

    public Date getFechaDeVenta() {
        return fechaDeVenta;
    }

    public String getVendedor() {
        return vendedor.getNombre();
    }

    public double getMonto() {
        return monto;
    }
}


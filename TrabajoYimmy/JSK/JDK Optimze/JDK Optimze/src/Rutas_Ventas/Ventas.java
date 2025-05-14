package rutas_Ventas;
import usuarios.Usuario;
import java.sql.Date;

public class Ventas {
    @SuppressWarnings("unused")
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
        return "Venta ID: " + idVenta + " - Monto: $" + monto + "Vendedor: " + vendedor + "Fecha de la venta" + fechaDeVenta; // Se hace el cambio de saber que vendedor realizo la venta, su registro y la fecha 
    }
    
    public String AsignarCliente(){
        return cliente;
    }
    public Date AsignarFecha(){
        return fechaDeVenta;
    }

    public String getVendedor(){
        return vendedor.getNombre(); 
    }

    public double getMonto(){
        return monto;
    }
}



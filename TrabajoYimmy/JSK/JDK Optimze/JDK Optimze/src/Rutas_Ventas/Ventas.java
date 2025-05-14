package Rutas_Ventas;

import java.sql.Date;

public class Ventas {
    private long IdVenta;
    private String Cliente;
    private String Vendedor;
    private Date FechaDeVenta; //Tanto el impulsador como cliente tienen que ver cuando se efectuo la compra almenos a mi parecer 
    
    public Ventas(long idVenta, String cliente, String vendedor, Date fechaDeVenta) {
        this.IdVenta = idVenta;
        this.Cliente = cliente;
        this.Vendedor = vendedor;
        this.FechaDeVenta = fechaDeVenta;
    }
    public String AsignarCliente(){
        return Cliente;
    }
    public Date AsignarFecha(){
        return FechaDeVenta;
    }
    public String AsignarVendedor(){
        return Vendedor;
    }
}

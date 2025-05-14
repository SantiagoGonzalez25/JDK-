package Rutas_Ventas;

import java.util.List;

public class ModeloRuta {
    private long id;
    @SuppressWarnings({ "unused", "rawtypes" })
    private List PuntosVenta;
    @SuppressWarnings("unused")
    private boolean RutaTomada;
    
    public ModeloRuta(long id, @SuppressWarnings("rawtypes") List puntosVenta, boolean rutaTomada) {
        this.id = id;
        this.PuntosVenta = puntosVenta;
        this.RutaTomada = rutaTomada;
    }
    
public long GenerarRuta(){
    return id;
}
}

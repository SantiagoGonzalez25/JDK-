package Rutas_Ventas;

import java.util.List;

public class ModeloRuta {
    private long id;
    private List PuntosVenta;
    private boolean RutaTomada;
    
    public ModeloRuta(long id, List puntosVenta, boolean rutaTomada) {
        this.id = id;
        this.PuntosVenta = puntosVenta;
        this.RutaTomada = rutaTomada;
    }
    
public long GenerarRuta(){
    return id;
}
}

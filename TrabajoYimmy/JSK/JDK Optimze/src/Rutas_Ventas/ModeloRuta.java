package Rutas_Ventas;

import java.util.List;

public class ModeloRuta {
    private long id;
    private List<String> PuntosVenta;
    private boolean RutaTomada;
    
    public ModeloRuta(long id, List<String> puntosVenta, boolean rutaTomada) {
        this.id = id;
        this.PuntosVenta = puntosVenta;
        this.RutaTomada = rutaTomada;
    }

    public String obtenerDetalles() {
        return "Modelo Ruta ID: " + id + " - Puntos: " + PuntosVenta.size();
    }


    public long getId() {
        return id;
    }

    public List<String> getPuntosVenta() {
        return PuntosVenta;
    }

    public boolean isRutaTomada() {
        return RutaTomada;
    }

    
}


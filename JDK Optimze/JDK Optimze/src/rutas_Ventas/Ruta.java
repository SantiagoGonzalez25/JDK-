// Ruta.java
package rutas_Ventas;

import java.sql.Date;
import usuarios.Usuario;

public class Ruta {
    private long idRuta;
    private Date fechaAsignacion;
    private Usuario usuario;    // usuario que creó la ruta (coordinador)
    private boolean rutaTomada;
    private String direccionRuta;

    public Ruta(long idRuta, Date fechaAsignacion,Usuario usuario,boolean rutaTomada,  String direccionRuta) {
        this.idRuta = idRuta;
        this.fechaAsignacion = fechaAsignacion;
        this.usuario = usuario;
        this.rutaTomada = rutaTomada;
        this.direccionRuta = direccionRuta;
    }

    public Usuario elegirRuta() {
        return usuario;
    }


    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public String obtenerDetallesRuta() {
        return "Ruta ID: " + idRuta + " - Dirección: " + direccionRuta + " - Ruta tomada: " + rutaTomada;
    }

    // Getters y setters básicos mínimos
    public long getIdRuta() {
        return idRuta;
    }

    public boolean isRutaTomada() {
        return rutaTomada;
    }

    public void setRutaTomada(boolean rutaTomada) {
        this.rutaTomada = rutaTomada;
    }

    public void setDireccionRuta(String direccionRuta) {
        this.direccionRuta = direccionRuta;
    }
}


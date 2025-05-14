package Rutas_Ventas;
import java.sql.Date;

import Usuarios.Usuario;

public class Ruta {
    private long IdRuta;// cambiar esto
    private Date FechaAsignacion;
    private Usuario usuario;
    private boolean RutaTomada;

    public Ruta(long id, Date fechaAsignacion, Usuario usuario, ModeloRuta modeloRuta) {
        this.IdRuta  = id;
        this.FechaAsignacion = fechaAsignacion;
        this.usuario = usuario;
        this.RutaTomada = RutaTomada;
    }

    public long getId() {
        return IdRuta;
    }
    
    public Usuario AsignarRuta(){
        return usuario;
    }

    public Date Fecha(){
        return FechaAsignacion;
    }
    
    public boolean RutaTomada() {
        RutaTomada = true;
        return RutaTomada;
    }

    public String obtenerDetallesRuta() {
        return "Ruta ID: " + modeloRuta.getId() + " - Asignada a: " + usuario.getNombre();
    }
}

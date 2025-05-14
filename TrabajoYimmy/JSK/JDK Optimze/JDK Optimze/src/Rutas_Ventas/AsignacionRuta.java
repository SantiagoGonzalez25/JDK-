package Rutas_Ventas;
import java.sql.Date;

import Usuarios.*;
public class AsignacionRuta {
    private long id;
    private Date FechaAsignacion;
    private Usuario usuario;
    private ModeloRuta modeloRuta;
    public AsignacionRuta(long id, Date fechaAsignacion, Usuario usuario, ModeloRuta modeloRuta) {
        this.id = id;
        this.FechaAsignacion = fechaAsignacion;
        this.usuario = usuario;
        this.modeloRuta = modeloRuta;
    }
    
    public Usuario AsignarRuta(){
        return usuario;
    }
    public Date Fecha(){
        return FechaAsignacion;
    }
}

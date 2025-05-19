package rutas_Ventas;

import usuarios.Usuario;
import java.sql.Date;

public class ProgramacionRuta {
    private long idProgramacionRuta;
    private Date fechaAsignacion;
    private String estado;
    private String comentarios;
    private Ruta ruta;
    private Usuario vendedor;
    private Usuario coordinador;

    public ProgramacionRuta(long idProgramacionRuta,Date fechaAsignacion,Usuario coordinador,Usuario vendedor, Ruta ruta) {
        this.idProgramacionRuta = idProgramacionRuta;
        this.fechaAsignacion    = fechaAsignacion;
        this.coordinador        = coordinador;
        this.vendedor           = vendedor;
        this.ruta               = ruta;
        this.estado             = "Pendiente";
        this.comentarios        = "";
    }

    public void confirmarRuta() {
        this.estado = "Confirmada";
    }

    public void completarRuta() {
        this.estado = "Completada";
    }

    public void asignarComentario(String comentario) {
        this.comentarios = comentario;
    }

    // Getters esenciales
    public long getIdProgramacionRuta() {
        return idProgramacionRuta;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public String getEstado() {
        return estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public Usuario getCoordinador() {
        return coordinador;
    }

    // Setters reducidos
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}

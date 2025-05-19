package info;

import usuarios.Usuario;
import java.sql.Date;

public class Notificaciones {
    private String mensaje;
    private Usuario destinatario;
    private Date fechaEnvio;
    private boolean leido = false;

    public Notificaciones(String mensaje, Usuario destinatario, Date fechaEnvio) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.fechaEnvio = fechaEnvio;
    }

    public void enviar() {
        System.out.println("Notificación enviada a " + destinatario.getNombre());
    }

    public boolean abrir() {
        leido = true;
        return leido;
    }


    public String getMensaje() {
        return mensaje;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    } 

    public Usuario getDestinatario() {
        return destinatario;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
}

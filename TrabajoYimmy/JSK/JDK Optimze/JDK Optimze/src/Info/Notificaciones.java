package Info;
import Usuarios.Usuario;
import java.sql.Date;
public class Notificaciones {
    private String Mensaje;
    private Usuario Destinatario;
    private Date FechaEnvio;
    private boolean Leido = false;
    public Notificaciones(String mensaje, Usuario destinatario, Date fechaEnvio) {
        this.Mensaje = mensaje;
        this.Destinatario = destinatario;
        this.FechaEnvio = fechaEnvio;
    }
    
    public Date AsignarFechaEnvio(){
        return FechaEnvio;
    }
    public Usuario AsignarDestinatarios(){
        return Destinatario;
    }
    
    public String DefinirMsg(){
        return Mensaje;
    }
    
    public void Enviar(){}

    public boolean Abrir(){ 
        Leido = true; 
        return Leido;
    } 

}
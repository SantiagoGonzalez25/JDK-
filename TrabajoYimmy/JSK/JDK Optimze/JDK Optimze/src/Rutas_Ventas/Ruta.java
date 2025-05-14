package rutas_Ventas;
import java.sql.Date;
import usuarios.Usuario;

public class Ruta { // Se cambia el nombre de asignacion de ruta a ruta 
    private long IdRuta; // Se empiezan a especificar todos los id's 
    private Date FechaAsignacion;
    private Usuario usuario;
    private boolean RutaTomada; // Si la ruta esta tomada o no
    private String DireccionRuta;  // Cual es la ubicacion de la ruta

    public Ruta(long id, Date fechaAsignacion, Usuario usuario, boolean RutaTomada, String DireccionRuta) { // Nuevas variables al metodo constructor
        this.IdRuta  = id;
        this.FechaAsignacion = fechaAsignacion;
        this.usuario = usuario;
        this.RutaTomada = RutaTomada; 
        this.DireccionRuta = DireccionRuta; 
    }

    public long getId() {
        return IdRuta;
    }

    public void UbicacionDeRuta(){
        System.out.println("La ubicacion de la ruta es: " + DireccionRuta);
    } // Estamos hablando de que la ruta ya esta creada aca, Se tiene que mostrar cual es la ruta
    
    public Usuario ElegirRuta(){   // Se cambia el nombre de AsignarRuta a elegir ruta, el vendedor es quien la elige
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
        return "Ruta ID: " + IdRuta +  " - Asignada a: " + usuario.getNombre();
    }
}

package usuarios; 
import enums.*;


public class Administrador extends Usuario{
    private long Adminid; 
    private Roles rol; // Variable para el asignamiento de roles
    private Usuario usuario; // Variable para acceder a los usuarios

    public Administrador(long id, String nombre, String contrasena, String email, long adminid, Roles rol) {
        super(id, nombre, contrasena, email);
        this.rol = rol;
        this.Adminid = adminid;
    }
    
    public long getAdminid() {
        return Adminid;
    }

    public Usuario AsignarRol() { //el administrador no tiene el metodo de crear usuario, el asigna el rol y configura el usuario accediendo a la clase usuario
       switch (rol) {
        case COORDINADOR:
            return usuario;
        case IMPULSADOR:
            return usuario;
        case VENDEDOR:     
            return usuario;
        default:
            System.out.println("No se ha asignado ningun rol");
            return usuario;
       }
    }
}
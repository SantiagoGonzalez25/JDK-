package Usuarios;

public class Administrador extends Usuario {

    private Usuario usuario;
    public Administrador(long id, String nombre, String contraseña, String Email) {
        super(id, nombre, contraseña, Email);
    }
    
    public Usuario CrearUsuario(){
        return usuario;
    }
    
    public Usuario AsignarRol(){
        return usuario;
    }
    
    public Usuario EliminarUsuario(){
        return usuario;
    }
    
}

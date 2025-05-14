package Usuarios;

public abstract class Usuario {
    private long id;
    private String nombre;
    private String Contrasena;
    private String email; 
    
    public Usuario(long id, String nombre, String contrasena, String email) {
        this.id = id;
        this.nombre = nombre;
        this.Contrasena = contrasena;
        this.email = email;
    }


    public long crearUsuario(){
        return id;
    }
   
    public boolean autenticar(){
        return true; 
    }

    public long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getContrasena(){
        return Contrasena;
    }

    public String getEmail(){
        return email;
    }
}

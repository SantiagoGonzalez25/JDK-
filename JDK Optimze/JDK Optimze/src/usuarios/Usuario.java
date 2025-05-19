// Usuario.java
package usuarios;

public abstract class Usuario {
    private long idUsuario;
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(long idUsuario, String nombre, String contrasena, String email) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
    }

    public long crearUsuario() {
        return idUsuario;
    }

    public boolean autenticar() {
        return true;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }
}
package Usuarios;

import java.sql.Date;
import Enums.Estados;


public class Administrador{

    private long Adminid; 
    private String nombre;
    private String contrasena;
    private String email;
    
    public Administrador(long adminid, String nombre, String contrasena, String email) {
        this.Adminid = adminid;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
    }

    public long getAdminid() {
        return Adminid;
    }
    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getEmail() {
        return email;
    }

    public Usuario crearUsuario(long id, String nombre, String contrasena, String email, String rol) {
        switch (rol.toUpperCase()) {

            case "VENDEDOR": return new Vendedor(id, nombre, contrasena, email, /*rutaAsignada*/"", /*horario*/null, /*comision*/0, Estados.ACTIVO);

            case "IMPULSADOR": return new Impulsador(id, nombre, contrasena, email, new Date(System.currentTimeMillis()), /*rutaAsignada*/"", null);
            default:
                throw new IllegalArgumentException("Rol desconocido: " + rol);
        }
    }
}
    


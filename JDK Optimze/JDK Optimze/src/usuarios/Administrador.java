// Usuarios/Administrador.java
package usuarios;

import enums.Roles;

public class Administrador extends Usuario {
    private long adminId;

    public Administrador(long idUsuario, String nombre, String contrasena, String email, Roles rol) {
        super(idUsuario, nombre, contrasena, email);
        this.adminId = idUsuario;
        // Si quieres guardar el rol asignado:
        // this.rolAsignado = rol;
    }

    public Usuario asignarRoles(Roles rol, Usuario usuario) {
        switch (rol) {
            case COORDINADOR:
                return usuario;
            case IMPULSADOR:
                return usuario;
            case VENDEDOR:
                return usuario;
            case ADMINISTRADOR:
                return usuario;
            case NA:
                System.out.println("Rol no asignado.");
                return usuario;
            default:
                System.out.println("Rol desconocido.");
                return usuario;
        }
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }
}


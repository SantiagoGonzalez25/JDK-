package Usuarios;

public abstract class Usuario {
    @SuppressWarnings("unused")
    private long Id;
    @SuppressWarnings("unused")
    private String Nombre;
    @SuppressWarnings("unused")
    private String Contraseña;
    @SuppressWarnings("unused")
    private String Email; 
    
    public Usuario(long id, String nombre, String contraseña, String Email) {
        this.Id = id;
        this.Nombre = nombre;
        this.Contraseña = contraseña;
        this.Email = Email;
    }
   
    public boolean autenticar(){
        return true; 
    }
}

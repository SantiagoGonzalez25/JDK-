package Usuarios;

public abstract class Usuario {
    private long Id;
    private String Nombre;
    private String Contraseña;
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

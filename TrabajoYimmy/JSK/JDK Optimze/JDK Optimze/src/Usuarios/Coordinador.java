package Usuarios;

public class Coordinador extends Usuario {
    private String RutasEstablecidas; 
    private String AreaEstablecida; //area en la que el coordinador opera
    
    public Coordinador(long id, String nombre, String contraseña, String Email, String rutasEstablecidas, String AreaEstablecida) {
        super(id, nombre, contraseña, Email);
        this.RutasEstablecidas = rutasEstablecidas;
        this.AreaEstablecida = AreaEstablecida;
    }

    public String EstablecerRutas(){
        return RutasEstablecidas;
    }
}

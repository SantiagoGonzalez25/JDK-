package Usuarios;

public class Coordinador extends Usuario {
    private String rutasEstablecidas; 
    private String areaEstablecida; // Area en la que el coordinador opera
    
    public Coordinador(long id, String nombre, String contrasena, String email, String rutasEstablecidas, String areaEstablecida) {
        super(id, nombre, contrasena, email);
        this.rutasEstablecidas = rutasEstablecidas;
        this.areaEstablecida = areaEstablecida;
    }

    public String EstablecerRutas(){
        return rutasEstablecidas;
    }

    public String getAreaEstablecida(){
        return areaEstablecida;
    }
}

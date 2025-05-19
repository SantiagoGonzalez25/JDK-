    package usuarios;

    public class Coordinador extends Usuario {
        private String rutasEstablecidas; 
        @SuppressWarnings("unused") 
        private String areaEstablecida; 
        
       public Coordinador(long idUsuario, String nombre, String contrasena, String email,
                       String rutasEstablecidas, String areaEstablecida) {
        super(idUsuario, nombre, contrasena, email);
        this.rutasEstablecidas = rutasEstablecidas;
        this.areaEstablecida = areaEstablecida;
    }

        public String crearRutas() {
        return rutasEstablecidas;
    }

    public String getAreaEstablecida() {
        return areaEstablecida;
    }

    public void setRutasEstablecidas(String rutasEstablecidas) {
        this.rutasEstablecidas = rutasEstablecidas;
    }
    
    }

























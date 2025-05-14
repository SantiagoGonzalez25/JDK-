package Usuarios;

import java.sql.Date;

public class Impulsador extends Usuario {
    private Date horario;
    private String puntoDeVenta;
    private String VerVentas;
    
    public Impulsador(long id, String nombre, String contrasena, String email, Date horario, String puntoDeVenta,
            String verVentas) {
        super(id, nombre, contrasena, email);
        this.horario = horario;
        this.puntoDeVenta = puntoDeVenta;
        this.VerVentas = verVentas;
    }

    public String VerVentas(){ 
        return VerVentas;
    }
   
    public Date VerHorario(){
        return horario;
    }

    public String getPuntoDeVenta(){
        return puntoDeVenta;
    }
    
}
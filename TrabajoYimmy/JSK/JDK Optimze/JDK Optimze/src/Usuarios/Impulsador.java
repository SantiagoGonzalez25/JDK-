package Usuarios;

import java.sql.Date;

public class Impulsador extends Usuario {
    private Date Horario;
    private String PuntoDeVenta;
    private String VerVentas;
    
    public Impulsador(long id, String nombre, String contraseña, String Email, Date horario, String puntoDeVenta,
            String verVentas) {
        super(id, nombre, contraseña, Email);
        this.Horario = horario;
        this.PuntoDeVenta = puntoDeVenta;
        this.VerVentas = verVentas;
    }

    public String VerVentas(){ 
        return VerVentas;
    }
   
    public Date VerHorario(){
        return Horario;
    }
    
}
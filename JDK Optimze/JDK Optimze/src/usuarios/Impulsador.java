// Impulsador.java
package usuarios;

import java.sql.Date;

public class Impulsador extends Usuario {
    private Date horario;
    @SuppressWarnings("unused")
    private String puntoDeVenta;
    private String verVentas;

    public Impulsador(long idUsuario, String nombre, String contrasena, String email,
                      Date horario, String puntoDeVenta, String verVentas) {
        super(idUsuario, nombre, contrasena, email);
        this.horario = horario;
        this.puntoDeVenta = puntoDeVenta;
        this.verVentas = verVentas;
    }

    public String verVentas() {
        return verVentas;
    }

    public Date verHorario() {
        return horario;
    }

    public String getPuntoDeVenta() {
        return puntoDeVenta;
    }

    public void setPuntoDeVenta(String puntoDeVenta) {
        this.puntoDeVenta = puntoDeVenta;
    }
}

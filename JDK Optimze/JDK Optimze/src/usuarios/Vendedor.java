// Vendedor.java
package usuarios;

import java.sql.Date;
import enums.Estados;
import rutas_Ventas.Ruta;

public class Vendedor extends Usuario {
    private Ruta rutaAsignada;
    @SuppressWarnings("unused")
    private Date horario;
    @SuppressWarnings("unused")
    private double comision;
    private Estados estado;

    public Vendedor(long idUsuario, String nombre, String contrasena, String email,
                    Ruta rutaAsignada, Date horario, double comision, Estados estado) {
        super(idUsuario, nombre, contrasena, email);
        this.rutaAsignada = rutaAsignada;
        this.horario = horario;
        this.comision = comision;
        this.estado = estado;
    }

    public String registrarVenta(double monto) {
        return "VENTA-" + System.currentTimeMillis() + " $" + monto;
    }

    public Estados getEstado() {
        return estado;
    }

    public double getComision() {
        return comision;
    }

    public Ruta elegirRuta() {
        return rutaAsignada;
    }

    public Date getHorario() {
        return horario;
    }

    public void setRutaAsignada(Ruta rutaAsignada) {
        this.rutaAsignada = rutaAsignada;
    }
}

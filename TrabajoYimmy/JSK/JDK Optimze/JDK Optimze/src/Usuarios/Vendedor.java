package Usuarios;

import java.sql.Date;
import Enums.*;

public class Vendedor extends Usuario {
    private String rutaAsignada;
    private Date horario;
    private double comision;
    private Estados estado;
    private String venta;

    public Vendedor(long id, String nombre, String contraseña, String Email, String rutaAsignada, Date horario,
            double comision, Estados estado, String venta) {
        super(id, nombre, contraseña, Email);
        this.rutaAsignada = rutaAsignada;
        this.horario = horario;
        this.comision = comision;
        this.estado = estado;
        this.venta = venta;
    }
    
    public String elegirRuta() {
        return rutaAsignada;
    }

    public String registrarVenta() {
        return venta;
    }

    public Estados actualizarEstado() {
        return estado;
    }
}

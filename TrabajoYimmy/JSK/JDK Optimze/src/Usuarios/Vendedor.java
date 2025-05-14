package Usuarios;

import java.sql.Date;
import Enums.Estados;

public class Vendedor extends Usuario {
    private String rutaAsignada;
    private Date horario;
    private double comision;
    private Estados estado;
    private String venta;

    public Vendedor(long id, String nombre, String contrasena, String email, String rutaAsignada, Date horario,
            double comision, Estados estado) {
        super(id, nombre, contrasena, email);
        this.rutaAsignada = rutaAsignada;
        this.horario = horario;
        this.comision = comision;
        this.estado = estado;
    
    }

    public String registrarVenta(double monto){
        return "VENTA-"+ System.currentTimeMillis() + " " + monto;
    }

    public Estados getEstado() {
        return estado;
    }

    public double getComision() {
        return comision;
    }
}

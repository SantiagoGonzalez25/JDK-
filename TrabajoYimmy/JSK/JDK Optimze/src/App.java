import Usuarios.*;
import Rutas_Ventas.*;
import Enums.*;
import Info.*;
import Controlador.*;
import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
       
        Administrador admin = new Administrador(1, "Andrés Trabas", "admin123", "admin@jsk.com");
    


        Coordinador coordinador = new Coordinador(2, "Carlos Ruiz", "coordinador123", "c.coordinador@jsk.com", "Ruta Norte, Ruta Sur", "Zona Centro");
        Impulsador impulsador = new Impulsador(3, "Luisa Pérez", "impulsador123", "l.impulsador@jsk.com", new Date(System.currentTimeMillis()), "Centro Comercial Plaza", "Ventas Q1");
        Vendedor vendedor = new Vendedor(4, "Pedro Gómez", "vendedor123", "p.vendedor@jsk.com", "Ruta A", new Date(System.currentTimeMillis()), 5.0, Estados.ACTIVO);
        
        new Rol(Roles.ADMINISTRADOR);
        new Rol(Roles.COORDINADOR);
        new Rol(Roles.IMPULSADOR);
        new Rol(Roles.VENDEDOR);
    
           
        List<String> puntosRutaImpulsador = new ArrayList<>();
        puntosRutaImpulsador.add("Centro Comercial Plaza");
        ModeloRuta modeloRutaImpulsador = new ModeloRuta(1, puntosRutaImpulsador, false);
        
        List<String> puntosRutaVendedor = new ArrayList<>();
        puntosRutaVendedor.add("Tienda Calle 80");
        ModeloRuta modeloRutaVendedor = new ModeloRuta(2, puntosRutaVendedor, true);
        

        AsignacionRuta asignacionImpulsador = new AsignacionRuta(1, new Date(System.currentTimeMillis()), impulsador, modeloRutaImpulsador);
        AsignacionRuta asignacionVendedor = new AsignacionRuta(2, new Date(System.currentTimeMillis()), vendedor, modeloRutaVendedor);
        
    
        Ventas ventaImpulsador = new Ventas(1, "Cliente Ejemplo S.A.", impulsador, new Date(System.currentTimeMillis()), 2500.00);
        Ventas ventaVendedor = new Ventas(2, "Tienda Don Pedro", vendedor, new Date(System.currentTimeMillis()), 1500.00);
        
     
        Informe informeVentas = new Informe(1, new Date(System.currentTimeMillis()), new File("informe_ventas.pdf"), false);
        informeVentas.generarReporte();
        
    
        Notificaciones notificacionCoordinador = new Notificaciones("Nueva asignación de ruta", coordinador, new Date(System.currentTimeMillis()));
        Notificaciones notificacionVendedor = new Notificaciones("Meta cumplida: $1500", vendedor, new Date(System.currentTimeMillis()));

        
       
        System.out.println("Sistema JSK Optimize");
        System.out.println("- Administrador: " + admin.getNombre());
        System.out.println("- Coordinador: " + coordinador.getNombre() + " | Área: " + coordinador.getAreaEstablecida());
        System.out.println("- Ruta Asignada (Impulsador): " + asignacionImpulsador.obtenerDetallesRuta());
        System.out.println("- Ruta Asignada (Vendedor): " + asignacionVendedor.obtenerDetallesRuta());
        System.out.println("- Venta Registrada (Impulsador): " + ventaImpulsador.obtenerDetalleVenta());
        System.out.println("- Venta Registrada (Vendedor): " + ventaVendedor.obtenerDetalleVenta());
        System.out.println("- Informe Generado: " + informeVentas.isGenerado());
        notificacionCoordinador.Enviar();
        notificacionVendedor.Enviar();
    }
}



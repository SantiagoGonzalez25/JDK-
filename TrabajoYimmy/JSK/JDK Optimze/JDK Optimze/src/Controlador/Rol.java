package Controlador;
import java.util.InputMismatchException;

import Enums.Roles;
public class Rol {
    private Roles rol;
    {
        switch (rol) {
            case ADMINISTRADOR: 
                System.out.println("Tu funcion es asignar roles y hacer configuraciones en desde el sistema.");
            case COORDINADOR:
                System.out.println("Tu funcion principal es la gestion de impulsadores y vendedores.");
                break;
            case IMPULSADOR:
                System.out.println("Tu funcion principal es impulsar la marca/producto en un punto de venta fijo previamente establecido por el coordinador.");
                break;
            case VENDEDOR:
                System.out.println("Tu funcion principal es gestionar ventas y relaciones con clientes visitando tiendas asignadas.");
                break;
            } 
        }
    

    public Rol(Roles rol) {
        this.rol = rol;
    }
}

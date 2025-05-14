// Controlador/Rol.java
package Controlador;
import Enums.Roles;

public class Rol {
    private Roles rol;

    public Rol(Roles rol) {
        this.rol = rol;
        asignarRol();
    }

    private void asignarRol() {
        switch (this.rol) {
            case ADMINISTRADOR:
                System.out.println("Administrador, Tu función es asignar roles y configurar el sistema.");
                break;
            case COORDINADOR:
                System.out.println("Coordinador, Tu función principal es gestionar impulsores y vendedores.");
                break;
            case IMPULSADOR:
                System.out.println("impulsador, Tu función es impulsar productos en puntos de venta establecidos.");
                break;
            case VENDEDOR:
                System.out.println("Vendedor, Tu función es gestionar ventas y relaciones con clientes.");
                break;
        }
    }
}
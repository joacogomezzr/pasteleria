import Models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Inventario inventario = new Inventario(1);
        ArrayList<Insumo> listaInsumos = (ArrayList<Insumo>) inventario.getListaInsumos();

        boolean bandera = true;

        do {
            System.out.println(".....................................");
            System.out.println("Elija una opción:");
            System.out.println(".....................................");
            System.out.println("1. Iniciar Sesión");
            System.out.println("3. Alta de Insumos");
            System.out.println("4. Actualizar Stock de Insumos Adquiridos");
            System.out.println("5. Realizar Registro de Pedidos");
            System.out.println("6. Registrar Uso de Insumos en la Preparación de Pasteles");
            System.out.println("7. Estado actual del inventario:");
            System.out.println("X. Presione cualquier tecla para salir ");
            System.out.println(".....................................");
            System.out.println("Elija una opción:");
            System.out.println(".....................................");
            String opcion = teclado.next();
            int idInsumo, cantidad;

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el Usuario:");
                    String usuario = teclado.next();
                    System.out.println("Ingrese una contraseña:");
                    String contraseña = teclado.next();
                    Administrador nuevoAdministrador = new Administrador(usuario, contraseña);
                    System.out.println("Inicio de sesión exitoso.");
                    break;

                case "3":
                    ArrayList<Insumo> insumos = new ArrayList<>();

                    do {
                        System.out.println("Ingrese el Nombre del Insumo:");
                        String nombre = teclado.next();
                        System.out.println("Ingrese la Unidad De Medida:");
                        String unidadDeMedida = teclado.next();
                        System.out.println("Ingrese la Cantidad En Stock:");
                        cantidad = teclado.nextInt();
                        Insumo nuevoInsumo = new Insumo(nombre, cantidad, unidadDeMedida);
                        inventario.agregarInsumo(nuevoInsumo);
                        insumos.add(nuevoInsumo);

                        System.out.println("¿Desea continuar? S/N");
                        String opcion2 = teclado.next();
                        if (opcion2.equalsIgnoreCase("n")) {
                            break;
                        }
                    } while (true);

                    if (!insumos.isEmpty()) {
                        listaInsumos.addAll(insumos);
                        System.out.println("Insumos agregados al inventario.");
                    } else {
                        System.out.println("No se han ingresado insumos.");
                    }
                    break;

                case "4":
                    System.out.println("Insumos guardados:");
                    for (Insumo insumo : inventario.getListaInsumos()) {
                        System.out.println(insumo.obtenerDatos());
                    }
                    break;



                case "5":
                    System.out.println("Ingrese el ID del Insumo a utilizar:");
                    idInsumo = teclado.nextInt();
                    System.out.println("Ingrese la Cantidad Utilizada:");
                    cantidad = teclado.nextInt();

                    Insumo insumoSeleccionado = null;
                    for (Insumo insumo : inventario.getListaInsumos()) {
                        if (insumo.getIdInsumo() == idInsumo) {
                            insumoSeleccionado = insumo;
                            break;
                        }
                    }

                    if (insumoSeleccionado != null) {
                        System.out.println("Ingrese el nombre del pastelero:");
                        String nombrePastelero = teclado.next();
                        System.out.println("Ingrese la edad del pastelero:");
                        int edadPastelero = teclado.nextInt();
                        System.out.println("Ingrese la especialidad del pastelero:");
                        String especialidadPastelero = teclado.next();
                        System.out.println("Ingrese la experiencia del pastelero en años:");
                        int experienciaPastelero = teclado.nextInt();

                        Pastelero pastelero = new Pastelero(nombrePastelero, edadPastelero, especialidadPastelero, experienciaPastelero);
                        pastelero.prepararPasteles(insumoSeleccionado, cantidad);
                    } else {
                        System.out.println("Insumo no encontrado en el inventario.");
                    }
                    break;

                case "6":
                    System.out.println("Ingrese el ID del Insumo a actualizar:");
                    idInsumo = teclado.nextInt();
                    System.out.println("Ingrese la Cantidad Utilizada:");
                    cantidad = teclado.nextInt();

                    inventario.registrarUsoDeInsumos(idInsumo, cantidad);
                    System.out.println("Uso de insumos registrado correctamente.");
                    break;

                case "7":
                    inventario.imprimirEstadoInventario();
                    break;

                default:
                    System.out.println("Programa cerrado");
                    bandera = false;
                    break;
            }
        } while (bandera);
    }
}











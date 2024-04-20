package Models;

import java.util.ArrayList;

public class Insumo {
    private static int contadorID = 1;
    private int idInsumo;
    private String nombre;
    private int cantidadEnStock;
    private String unidadDeMedida;
    private ArrayList<Pastelero> pasteleros;

    public Insumo(String nombre, int cantidad, String unidadDeMedida) {
        this.idInsumo = contadorID++;
        this.nombre = nombre;
        this.cantidadEnStock = cantidad;
        this.unidadDeMedida = unidadDeMedida;
        this.pasteleros = new ArrayList<>();
    }

    public void agregarInsumo(int cantidad) {
        cantidadEnStock += cantidad;
        System.out.println("Insumo agregado al stock.");
    }

    public void actualizarStock(int cantidad) {
        cantidadEnStock += cantidad;
        System.out.println("Stock de insumos actualizado.");
    }

    public String obtenerDatos() {
        String insumoInfo = "[contadorID = " + contadorID + ", idInsumo = " + idInsumo + ", nombre = " + nombre +
                ", cantidadEnStock = " + cantidadEnStock + ", unidadDeMedida = " + unidadDeMedida + "]";

        for (Pastelero pastelero : pasteleros) {
            insumoInfo = insumoInfo + pastelero.getInfoPastelero() + ", ";
        }

        return insumoInfo;
    }

    public void usoDeInsumo(int cantidadUtilizada) {
        if (cantidadUtilizada <= cantidadEnStock) {
            cantidadEnStock -= cantidadUtilizada;
            System.out.println("Uso de insumos registrado en el inventario.");
        } else {
            System.out.println("No hay suficientes insumos en el inventario.");
        }
    }

    public void registrarUsoInsumos(Pastelero pastelero, int cantidadUtilizada) {
        System.out.println("El pastelero " + pastelero.getNombre() + " ha utilizado " + cantidadUtilizada + " de " +
                nombre + " en la preparación de pasteles.");
        pastelero.registrarUsoDeInsumo(this, cantidadUtilizada);
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void registrarUsoDeInsumo(int cantidadUtilizada) {
    }

    public void setID(int i) {
    }

    public ArrayList<Pastelero> getPasteleros() {
        return pasteleros;
    }
}

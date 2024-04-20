package Models;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int idInventario;
    private List<Insumo> listaInsumos;

    public Inventario(int idInventario) {
        this.idInventario = idInventario;
        this.listaInsumos = new ArrayList<>();
    }

    public void imprimirEstadoInventario() {
        System.out.println("Estado actual del inventario:");
        for (Insumo insumo : listaInsumos) {
            System.out.println(insumo.obtenerDatos());
        }
        System.out.println("------------------------------");
    }

    public void agregarInsumo(Insumo insumo) {
        listaInsumos.add(insumo);
        System.out.println("Insumo '" + insumo.getNombre() + "' agregado al inventario.");
    }

    public void actualizarStock(int idInsumo, int cantidad) {
        for (Insumo insumo : listaInsumos) {
            if (insumo.getIdInsumo() == idInsumo) {
                insumo.actualizarStock(cantidad);
                System.out.println("Stock de insumo '" + insumo.getNombre() + "' actualizado en el inventario.");
                break;
            }
        }
    }

    public void registrarUsoDeInsumos(int idInsumo, int cantidadUtilizada) {
        for (Insumo insumo : listaInsumos) {
            if (insumo.getIdInsumo() == idInsumo) {
                insumo.registrarUsoDeInsumo(cantidadUtilizada);
                System.out.println("Uso de insumo '" + insumo.getNombre() + "' registrado por el pastelero.");
                break;
            }
        }
    }

    public List<Insumo> getListaInsumos() {
        return listaInsumos;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setListaInsumos(List<Insumo> listaInsumos) {
        this.listaInsumos = listaInsumos;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }
}

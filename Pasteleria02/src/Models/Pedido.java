package Models;

import java.util.Date;

public class Pedido {
    private static int contadorID = 1;
    private int idPedido;
    private int noInsumo;
    private Date fechaPedido;

    public Pedido() {
        this.idPedido = contadorID++;
        this.fechaPedido = new Date();
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setNoInsumo(int noInsumo) {
        this.noInsumo = noInsumo;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void registrarPedido() {
        System.out.println("Pedido registrado con ID: " + idPedido);
    }
}

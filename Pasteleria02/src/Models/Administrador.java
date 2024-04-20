package Models;

import java.util.Date;

public class Administrador {
    private String usuario;
    private String contraseña;

    public void altaNuevoInsumo(String nombre, int cantidad, String UnidadeMedida) {
    }
    public void actualizarStockInsumos(int idInsumo, int cantidad) {
    }

    public void realizarRegistroPedido(int idPedido, Date fechaPedido) {
    }
    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
}


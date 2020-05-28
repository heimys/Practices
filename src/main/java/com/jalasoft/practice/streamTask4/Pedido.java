package com.jalasoft.practice.streamTask4;

import java.util.List;

public class Pedido {
    private String CodPedido;
    private String tipoPedido;
    private String cliente;
    private String fecha;

    public Pedido(String codPedido, String tipoPedido, String cliente, String fecha) {
        CodPedido = codPedido;
        this.tipoPedido = tipoPedido;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public String getCodPedido() {
        return CodPedido;
    }

    public void setCodPedido(String codPedido) {
        CodPedido = codPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

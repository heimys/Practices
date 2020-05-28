package com.jalasoft.practice;

import com.jalasoft.practice.streamTask4.Detalle;
import com.jalasoft.practice.streamTask4.Pedido;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Detalle detalle1 = new Detalle("cod1","cocina",2,1000,10,"ped1");
        Detalle detalle2 = new Detalle("cod2","lavadora",1,2500,0,"ped1");
        Detalle detalle3 = new Detalle("cod3","plancha",5,300,50,"ped1");
        Detalle detalle4 = new Detalle("cod4","mesa",2,700,30,"ped2");
        Detalle detalle5 = new Detalle("cod5","muebles",1,3500,0,"ped2");
        Detalle detalle6 = new Detalle("cod6","comoda",3,800,100,"ped2");
        Detalle detalle7 = new Detalle("cod7","camisa",10,100,100,"ped3");
        Detalle detalle8 = new Detalle("cod8","polera",20,80,0,"ped3");
        Detalle detalle9 = new Detalle("cod9","zapatos",8,400,200,"ped3");

        List<Detalle> detalleList = new ArrayList<>();
        detalleList.add(detalle1);
        detalleList.add(detalle2);
        detalleList.add(detalle3);
        detalleList.add(detalle4);
        detalleList.add(detalle5);
        detalleList.add(detalle6);
        detalleList.add(detalle7);
        detalleList.add(detalle8);
        detalleList.add(detalle9);

        Pedido pedido1 = new Pedido("ped1","normal", "Juan Perez", "2020-05-05");
        Pedido pedido2 = new Pedido("ped2","programado", "Maria Guaman", "2020-05-03");
        Pedido pedido3 = new Pedido("ped3","normal", "Juan Perez", "2020-05-10");

        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(pedido1);
        pedidoList.add(pedido2);
        pedidoList.add(pedido3);

        System.out.println("1. Select client from Pedido ---------------------------------------------");
        pedidoList.stream()
                .map(pedido -> pedido.getCliente())
                .forEach(value -> System.out.println("    " + value));

        System.out.println("2. Select cliente from Pedido where tipoPedido = 'normal' -----------------");
        pedidoList.stream()
                .filter(pedido -> pedido.getTipoPedido().equals("normal") )
                .map(pedido -> pedido.getCliente())
                .forEach(value -> System.out.println("    " + value));

        System.out.println("3. Select codPedido from Pedido where fecha = '2020-05-05' -----------------");
        pedidoList.stream()
                .filter(pedido -> pedido.getFecha().equals("2020-05-05"))
                .map(pedido -> pedido.getCodPedido())
                .forEach(value -> System.out.println("    " + value));

        System.out.println("4. Select producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and Pedido.codPedido = 'ped1'");
        pedidoList
                .stream()
                .filter(pedido -> pedido.getCodPedido().equals("ped1"))
                .map(pedido -> detalleList
                        .stream()
                        .filter(detalle -> detalle.getCodPedido().equals(pedido.getCodPedido())))
                .flatMap(detalles -> detalles.map(detalle -> detalle.getProducto()))
                .forEach(value -> System.out.println("    " + value));

        System.out.println("5. Select Detalle.producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and Detalle.cantidad > 8");
        detalleList
                .stream()
                .filter(detalle -> detalle.getCantidad() > 8)
                .map(detalle -> detalle.getProducto())
                .forEach(value -> System.out.println("    " + value));

    }
}

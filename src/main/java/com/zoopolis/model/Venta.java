package com.zoopolis.model;


public class Venta {

    private String cliente;
    private int cantidad;
    private double total;
    private double valorVenta;
    private double descuentoPorcentaje;
    private double descontado;      // 0% predeterminado
    private Ticket producto;

    public Venta(String cliente, int cantidad, Ticket producto) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.producto = producto;
    }
        
    private void calcularValorVenta(){
        valorVenta = producto.getPrecio() * cantidad;
    }

    public void descontar(double porcentaje) {          // CON PARAMETRO O CONSTRUCTOR?? VER IMPLEMENTACION¿¿
        calcularValorVenta();
        descuentoPorcentaje = porcentaje;
        descontado =  valorVenta * porcentaje / 100;
        total = valorVenta - descontado;
    }

    public Ticket getProducto(){
        return producto;
    }
    

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
       
    @Override
    public String toString(){
        return (producto.getDescripcion() + " PRECIO: " + producto.getPrecio() 
                + " CANTIDAD: " + cantidad 
                + " VALOR VENTA: " + valorVenta 
                + " DESCONTADO: " + descontado 
                + " TOTAL: " + total);
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public double getDescuentoPorcentaje() {
        return descuentoPorcentaje;
    }

    public double getDescontado() {
        return descontado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

}

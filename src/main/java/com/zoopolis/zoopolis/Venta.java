package com.zoopolis.zoopolis;


public class Venta {

    private String idVenta;
    private int cantidad;
    private double total;
    private double valorVenta;
    private double descuentoPorcentaje;
    private double descontado;      // 0% predeterminado
    private Ticket producto;

    public Venta(String idVenta, int cantidad, Ticket producto) {
        this.idVenta = idVenta;
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
    
    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
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

}

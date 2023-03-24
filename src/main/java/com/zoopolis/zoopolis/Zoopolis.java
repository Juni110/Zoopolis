package com.zoopolis.zoopolis;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoopolis {
    
    public static Scanner lector = new Scanner(System.in);
    
    private static ArrayList <Usuario> usuarios = new ArrayList<>();    
    private static Usuario usuarioActual = null;   
    private static boolean adminValido = false;
    
    public static boolean getAdminValido(){
        return adminValido;
    }
    
    public static void setAdminValido(boolean aV){
        adminValido = aV;
    }
    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    public static void deshabiliarUsuario() {
        usuarioActual = null;   // CUIDADO QUE NO SE ELIMINE LA INFO. DE LA INSTANCIA, HACER PRUEBAS
    }
    
    public static void habiliarUsuario(String idUsuario) {
        usuarioActual = buscarUsuario(idUsuario);
    }
    
    public static Usuario buscarUsuario(String idUsuario) {
        boolean encontrado = false;
        int i = 0;
        Usuario u = usuarios.get(i);
        while (!encontrado && i < usuarios.size()) {
            u = usuarios.get(i);
            if (idUsuario.equals(u.getId())) {
                encontrado = true;
            }
            i++;
        }
        return (encontrado) ? u : null;
    }
    
    public static Usuario getUsuarioActual() {
        return usuarioActual;
    }
    
    public static ArrayList<ArrayList> calcularVentas() {        //REVISAR PUBLIC

        ArrayList<ArrayList> arrayFilas = new ArrayList<>();
        
        int[] contadores = new int[6];
        double[] acumuladores = new double[18];
        
        for (Usuario u : usuarios) {
            for (Venta v : u.getVentas()) {
                switch (v.getProducto().getTitulo()) {
                    case "TICKET ESTÁNDAR":
                        contadores[0] += v.getCantidad();
                        acumuladores[0] += v.getValorVenta();
                        acumuladores[1] += v.getDescontado();
                        acumuladores[2] += v.getTotal();
                        break;
                    case "AVENTURA FELINA":
                        contadores[1] += v.getCantidad();
                        acumuladores[3] += v.getValorVenta();
                        acumuladores[4] += v.getDescontado();
                        acumuladores[5] += v.getTotal();
                        break;
                    case "AVENTURA REPTILIANA":
                        contadores[2] += v.getCantidad();
                        acumuladores[6] += v.getValorVenta();
                        acumuladores[7] += v.getDescontado();
                        acumuladores[8] += v.getTotal();
                        break;
                    case "AVENTURA ACUATICA":
                        contadores[3] += v.getCantidad();
                        acumuladores[9] += v.getValorVenta();
                        acumuladores[10] += v.getDescontado();
                        acumuladores[11] += v.getTotal();
                        break;
                    case "AVENTURA TROPICAL":
                        contadores[4] += v.getCantidad();
                        acumuladores[12] += v.getValorVenta();
                        acumuladores[13] += v.getDescontado();
                        acumuladores[14] += v.getTotal();
                        break;
                    case "AVENTURA ANIMAL TOTAL":
                        contadores[5] = contadores[5] + v.getCantidad();
                        acumuladores[15] += v.getValorVenta();
                        acumuladores[16] += v.getDescontado();
                        acumuladores[17] += v.getTotal();
                        break;
                    default:
                        break;
                }
            }
        }
        return crearFilas(contadores, acumuladores);
    }
    
    public static ArrayList crearFilas(int[] contadores, double[] acumuladores) {
        ArrayList<ArrayList> a = new ArrayList<>();
        a.add(crearFila("TICKET ESTÁNDAR", contadores[0], acumuladores[0], acumuladores[1], acumuladores[2]));      //PRECIOS DE LOS LABEL 
        a.add(crearFila("AVENTURA FELINA", contadores[1], acumuladores[3], acumuladores[4], acumuladores[5]));      // O ESTÁTICOS? IGUAL EL LABEL TAMBIEN ESTA EN CODIGO ESTÁ EN CODIGO
        a.add(crearFila("AVENTURA REPTILIANA", contadores[2], acumuladores[6], acumuladores[7], acumuladores[8]));      // DEL LABEL NO ES MALA PRACTICA? O SEA, 
        a.add(crearFila("AVENTURA ACUATICA", contadores[3], acumuladores[9], acumuladores[10], acumuladores[11]));      // NO SE PUEDE DEL LABEL, PRIMERO, YA SE GUARDARON,
        a.add(crearFila("AVENTURA TROPICAL", contadores[4], acumuladores[12], acumuladores[13], acumuladores[14]));     // SEGUNDO, SE ESTÁ EN OTRA VENTANA QUE NADA QUE VER 
        a.add(crearFila("AVENTURA ANIMAL TOTAL", contadores[5], acumuladores[15], acumuladores[16], acumuladores[17])); // CON LOS PLANES
        return a;
    }
    
    public static ArrayList crearFila(String titulo, int cantidad,
            double valorVenta, double descontado, double totales) {               // String precio unidad porque se saca de un label, hablar eso
        ArrayList<String> fila = new ArrayList<>();
        fila.add(titulo);
        fila.add("$" + valorVenta / cantidad);
        fila.add("" + cantidad);
        fila.add("$" + valorVenta);
        fila.add(porcentajeDelTotal(valorVenta, descontado) + "%");
        fila.add("$" + descontado);
        fila.add("$" + totales);
        return fila;
    }
    
    public static double porcentajeDelTotal(double valorVenta, double descontado) {              // DEBE SER UN VERBO????
        return (valorVenta == 0) ? 0 : (descontado * 100) / valorVenta;
    }
    
    public static void imprimeVentas() {
        System.out.println("Imprimiendo ventas");
        System.out.println(calcularVentas());
        // otra forma:
        for (ArrayList a : calcularVentas()) {
            System.out.println(a);
        }
        System.out.println("Ventas impresas");
    }
    
    public static void main(String[] args) {     // Pruebas de impresion por consola.
        Usuario u = new Usuario("1234", "Carlos", "emmamail");
        Venta v = new Venta("VENTA1", 5, new Ticket(5, "desct", "TICKET ESTÁNDAR"));
        v.descontar(10);
        u.addVenta(v);
        addUsuario(u);
        
        v = new Venta("VENTA1", 5, new Ticket(5, "desct", "TICKET ESTÁNDAR"));
        v.descontar(5);
        u.addVenta(v);
        
        u = new Usuario("1222", "eee", "eeee");
        v = new Venta("VENTA2", 3, new Ticket(7, "desct", "AVENTURA FELINA"));
        v.descontar(10);
        u.addVenta(v);
        addUsuario(u);
        
        u = new Usuario("1234", "Carlos", "emmamail");
        v = new Venta("VENTA1", 5, new Ticket(5, "desct", "AVENTURA REPTILIANA"));
        v.descontar(11);
        u.addVenta(v);
        addUsuario(u);
        
        imprimeVentas();
    }
    
}

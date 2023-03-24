package com.zoopolis.zoopolis;

public class Plan extends Ticket{

    public Plan(double precio, String descripcion, String titulo) {
        super(precio, descripcion, titulo);
    }

    public void setPlan(int plan) {     // PRECIOS CORREGIR Y NOMBRES     // INUTILIZADO
        //int plan = menuPlan(parametroPlan);        
        switch (plan) {
            case 1:
                setPrecio(100000);
                    setDescripcion("AVENTURA EN LA SABANA");        // servicios
                    setTitulo("AVENTURA EN LA SABANA");
                    break;
                case 2:
                    setPrecio(175000);
                    setDescripcion("AVENTURA REPTILIANA");
                break;
                case 3:
                    setPrecio(215000);
                    setDescripcion("AVENTURA BAJO LA TIERRA");
                break;
                case 4:
                    setPrecio(250000);
                    setDescripcion("AVENTURA ACUATICA");
                break;
                case 5:
                    setPrecio(320000);
                    setDescripcion("AVENTURA EXTREMA");
                break;
                default:
                    break;
        }
    }
        
    public int menuPlan(){      //INUTILIZADO
        int opcion;
        do{
            System.out.println("MENU DE PLANES");
            System.out.println("1. AVENTURA EN LA SABANA $100000"
                    + "\n2. AVENTURA REPTILIANA $175000"
                    + "\n3. AVENTURA BAJO LA TIERRA $215000"
                    + "\n4. AVENTURA ACUÁTICA $250000"
                    + "\n5. AVENTURA EXTREMA 320000\n");
            opcion = Zoopolis.lector.nextInt();
        }while (opcion < 1 || opcion > 5);
        return opcion;
    }
    
}

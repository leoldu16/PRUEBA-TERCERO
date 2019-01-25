
package pry_prueba_tercer_parcial;

import java.util.Scanner;


public class Pry_Prueba_Tercer_Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        BaseProducto obj1;
        obj1=new BaseProducto();
        TipoProducto d1=new TipoProducto("Fruta");
        Producto e1=new Producto("001","SANDIA", d1 , 20);
        TipoProducto d2=new TipoProducto("FRUTA");
        Producto e2=new Producto("002","MELON", d2 , 50);
        obj1.insertarProducto(e1);
        obj1.insertarProducto(e2);
        obj1.imprimirProducto();
        obj1.elminarProducto(e1);
        System.out.println("Eliminacion de Producto");
        obj1.imprimirProducto();
        System.out.println("Bucar Producto");
        obj1.buscarProducto("002");
        System.out.println("Seleccione lo que desea modificar:");
        int op=teclado.nextInt();
        switch(op){
            case 1:
                 System.out.println("Ingrese el nombre:");
                 String nombre=teclado.next();
                 obj1.modificarProducto(001,"NARANJA",nombre);
                 obj1.imprimirProducto();
                 break;

    }
    
}

    }

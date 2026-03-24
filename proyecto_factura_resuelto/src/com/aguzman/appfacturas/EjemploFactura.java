package com.aguzman.appfacturas;

import com.aguzman.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNif("1234.5");
        cliente1.setNombre("Andres");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente1);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura);
    }
}

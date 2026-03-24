package com.aguzman.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private Date fecha;
    private String descripcion;
    private ItemFactura[] items;
    private int indiceItems;
    private Cliente cliente;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(folio).append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\nNIF: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append("Fecha Emision: ").append(df.format(this.fecha)).append("\n").append("\n#\tNombre\t$\tCant.\tTotal\n");

        for(ItemFactura item: this.items) {
            if(item == null){
                continue;
            }
            sb.append(item)
                    .append("\n");
        }

        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return generarDetalle();
    }
}

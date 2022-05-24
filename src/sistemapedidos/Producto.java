/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapedidos;

/**
 *
 * @author eduar
 */
public class Producto {

    private String codProducto;
    private String nombre;
    private Integer cantidad;
    private String color;
    private String talla;
    private Double precio;

    public Producto(String codProducto, String nombre, Integer cantidad, String color, String talla) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.color = color;
        this.talla = talla;
        this.precio = 0.0;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}

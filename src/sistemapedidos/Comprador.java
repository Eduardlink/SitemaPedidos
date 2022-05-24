/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapedidos;

import java.util.LinkedList;

/**
 *
 * @author eduar
 */
public class Comprador {

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private Integer cantProductos;
    private LinkedList<Producto> productos;

    public Comprador(String cedula, String nombre, String apellido, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantProductos = 0;
        this.productos = new LinkedList<Producto>();
    }

    public boolean comprarProducto(String codProducto, String nombre, Integer cantidad, String color, char talla) {
        if (buscarProducto(codProducto) == null) {
            this.productos.add(new Producto(codProducto, nombre, cantidad, color, talla));
            return true;
        }
        return false;
    }

    public Integer buscarProducto(String codProducto) {
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCodProducto().equals(codProducto)) {
                return i;
            }
        }
        return -1;
    }

    public boolean cantidadMaxima(Integer cantidadProducto) {
        if(cantidadProducto>this.cantProductos){
            return true;
        }else{
            return false;
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCantProductos() {
        return cantProductos;
    }

    public void setCantProductos(Integer cantProductos) {
        this.cantProductos = cantProductos;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

}

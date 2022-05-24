/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapedidos;

import java.util.LinkedList;
import javax.swing.JOptionPane;

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

    public boolean comprarProducto(String codProducto, String nombre, Integer cantidad, String color, String talla) {
<<<<<<< HEAD
        if (buscarProducto(codProducto, color, talla) == -1) {
=======
        if (buscarProducto(codProducto) == null) {
>>>>>>> c2bff21800a062a9355a8edac6cb180c04d165a5
            this.productos.add(new Producto(codProducto, nombre, cantidad, color, talla));
            return true;
        }
        return false;
    }

    public Integer buscarProducto(String codProducto, String colorProducto, String tallaProducto) {
        for (int i = 0; i < this.productos.size(); i++) {
            if (this.productos.get(i).getCodProducto().equals(codProducto)) {
                if (this.productos.get(i).getColor().equals(colorProducto)) {
                    return i;
                }
            }
        }
        return -1;
    }
    

    public Integer buscarProducto(String[] datos) {
        for (int i = 0; i < this.productos.size(); i++) {
            if ((this.productos.get(i).getCodProducto().equals(datos[0]))
                    || (this.productos.get(i).getColor().equals(datos[3]))
                    || (this.productos.get(i).getTalla().equals(4))) {
                return i;
            }
        }
        return -1;
    }
    public boolean cantidadMaxima(Integer cantidadProducto) {
<<<<<<< HEAD
        if (cantidadProducto == 0) {
            return true;
        }

        if (cantidadProducto > this.cantProductos) {
            return true;
=======
        if (cantidadProducto > this.cantProductos) {
            return true;
>>>>>>> c2bff21800a062a9355a8edac6cb180c04d165a5
        } else {
            return false;
        }
    }

    public void fusionarRepetidos() {
        for (int i = 0; i < this.productos.size(); i++) {
            for (int j = 0; j < this.productos.size(); j++) {
                if ((this.productos.get(i).getCodProducto().equals(this.productos.get(j).getCodProducto()))
                        && (this.productos.get(i).getNombre().equals(this.productos.get(j).getNombre()))
                        && (this.productos.get(i).getColor().equals(this.productos.get(j).getColor()))
                        && (this.productos.get(i).getTalla().equals(this.productos.get(j).getTalla()))) {
                    this.productos.get(i).setCantidad(this.productos.get(i).getCantidad() + this.productos.get(j).getCantidad());
                    this.productos.remove(j);
                }
            }
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

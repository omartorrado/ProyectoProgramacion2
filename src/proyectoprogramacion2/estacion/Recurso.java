/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2.estacion;

/**
 *
 * @author otorradomiguez
 */
public class Recurso {
    
    private String nombre;
    private long cantidad;
    private int produccion=50;

    public Recurso(String nombre, long cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
   
    
}

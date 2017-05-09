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
public class  Almacen {
    
    Recurso aire=new Recurso("Aire",1000);
    Recurso agua= new Recurso("Agua",500);
    Recurso comida = new Recurso("Comida",1000);
    
    
    public Recurso getAire() {
        return aire;
    }

    public void setAire(Recurso aire) {
        this.aire = aire;
    }

    public Recurso getAgua() {
        return agua;
    }

    public void setAgua(Recurso agua) {
        this.agua.setCantidad(agua.getCantidad());
    }

    public Recurso getComida() {
        return comida;
    }

    public void setComida(Recurso comida) {
        this.comida = comida;
    }
    
    
}

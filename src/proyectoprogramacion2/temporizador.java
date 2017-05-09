/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2;

import java.util.Timer;
import proyectoprogramacion2.estacion.Almacen;

/**
 *
 * @author otorradomiguez
 */
public class temporizador extends Thread {
    
    Almacen a1=new Almacen();
    
    @Override
    public void run() {
        try {
            while (this.isAlive()) {
                Timer t = new Timer();
                sleep(2000);
                a1.getAgua().setCantidad(a1.getAgua().getCantidad()+a1.getAgua().getProduccion());
                a1.getAire().setCantidad(a1.getAire().getCantidad()+a1.getAire().getProduccion());
                a1.getComida().setCantidad(a1.getComida().getCantidad()+a1.getComida().getProduccion());
                System.out.println("Agua:"+a1.getAgua().getCantidad()+" Aire:"+a1.getAire().getCantidad()+" Comida:"+a1.getComida().getCantidad());
            }
        } catch (InterruptedException ex) {

        }
    }

}

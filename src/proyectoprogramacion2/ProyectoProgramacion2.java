/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion2;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author otorradomiguez
 */
public class ProyectoProgramacion2 {

    /**
     * @param args the command line arguments
     */
    JFrame marco=new JFrame();
    JPanel panel = new JPanel();
    JLabel recursos = new JLabel();
    JButton pausa = new JButton("Pause/Stop");
    
    static temporizador t=new temporizador();
    
    public void initInterfaz(){
        pausa.addActionListener((ActionEvent e)->{
            
        });
    }
    
    public static void main(String[] args) {
        
        t.start();
    }
    
}

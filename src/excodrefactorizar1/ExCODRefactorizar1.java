/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excodrefactorizar1;

/**
 *
 * @author erodriguez-lepinamartinez
 */

import javax.swing.JOptionPane;

public class ExCODRefactorizar1 {

    /**
     * @param args the command line arguments
     */
    

    public static String IntroducirNombre(String nom){
        String n;
        n = nom;
        return n;
    }
    
    public static String IntroducirEdad(String eda){
        String e;
        e = eda;
        return e;
    }
    
    public static void MostrarDatos(String nombre, String edad){
    int m;
    int d;
    int h;
    int a;
    
        a = Integer.parseInt (edad);
        
        m = (a*12);
        d = (a*365);
        h = (d*24);
        
        JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +nombre,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+nombre,JOptionPane.INFORMATION_MESSAGE);
        
        System.exit (0);

    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Nombre = IntroducirNombre("Enrique");
        String Edad = IntroducirEdad("24");
        MostrarDatos(Nombre, Edad);
        
   
    }
    
}

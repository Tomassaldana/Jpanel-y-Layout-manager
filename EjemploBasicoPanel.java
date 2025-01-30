/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.awt.*;  
import javax.swing.*;  

public class EjemploBasicoPanel {  
    EjemploBasicoPanel() {  
        // Crear el marco principal
        JFrame frame = new JFrame("Ejemplo de JPanel");    

        // Crear el panel
        JPanel panel = new JPanel();  
        panel.setBounds(40, 80, 200, 200);
      //JPanel panel = new JPanel(new GridLayout(2, 2));  
        panel.setBackground(Color.CYAN);   

        // Crear y añadir botones al panel
        JButton boton1 = new JButton("Botón 1");     
        boton1.setBackground(Color.YELLOW);   

        JButton boton2 = new JButton("Botón 2");   
        boton2.setBackground(Color.GREEN); 
        
        JButton boton3 = new JButton("Botón 3");   
        boton3.setBackground(Color.RED); 
        
        JButton boton4 = new JButton("Botón 4");   
        boton4.setBackground(Color.MAGENTA);
        
        JButton boton5 = new JButton("Botón 5");     
        boton5.setBackground(Color.YELLOW);   

        JButton boton6 = new JButton("Botón 6");   
        boton6.setBackground(Color.GREEN); 
        
        JButton boton7 = new JButton("Botón 7");   
        boton7.setBackground(Color.RED); 
        
        JButton boton8 = new JButton("Botón 8");   
        boton8.setBackground(Color.MAGENTA);

        panel.add(boton1);  
        panel.add(boton2);
        panel.add(boton3);  
        panel.add(boton4);
        panel.add(boton5);  
        panel.add(boton6);
        panel.add(boton7);  
        panel.add(boton8);

        // Añadir el panel al marco
        frame.add(panel);  

        // Configurar el marco
        frame.setSize(400, 400);
        //frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);    
    }  

    public static void main(String args[]) {  
        new EjemploBasicoPanel();  
    }  
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perttemuan1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("jFrame pertama saya");
        
        JLabel username = new JLabel();
        username.setText("username :");
        username.setBounds(100, 150, 100, 30);
        j.add(username);
        
        JTextField usertxt = new JTextField();
        usertxt.setBounds(170, 100 ,200, 30);
        j.add(usertxt);
        
        JTextField passtxt = new JTextField();
        passtxt.setBounds(170, 150 ,200, 30);
        j.add(passtxt);
        
        JLabel password = new JLabel();
        password.setText("password :");
        password.setBounds(100, 100, 100, 30);
        j.add(password);
        
        JButton loginButton = new JButton();
        loginButton.setText("LogiN");
        loginButton.setBounds(550, 290, 80, 30);
        j.add(loginButton);
              
        
        j.setSize(700, 400);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}

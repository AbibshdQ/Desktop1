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
public class FormRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame j = new JFrame("jFrame pertama saya");
        
        JLabel name = new JLabel();
        name.setText("nama :");
        name.setBounds(100, 150, 100, 30);
        j.add(name);
        
        JTextField nametxt = new JTextField();
        nametxt.setBounds(170, 100 ,200, 30);
        j.add(nametxt);
               
        JLabel username = new JLabel();
        username.setText("username :");
        username.setBounds(100, 100, 200, 30);
        j.add(username);
        
        JTextField usernametxt = new JTextField();
        usernametxt.setBounds(170, 150 ,200, 30);
        j.add(usernametxt);
        
         JLabel password = new JLabel();
        password.setText("password :");
        password.setBounds(100, 200, 200, 30);
        j.add(password);
        
        JTextField passwordtxt = new JTextField();
        passwordtxt.setBounds(170, 200 ,200, 30);
        j.add(passwordtxt);
                       
        JLabel phone = new JLabel();
        phone.setText("phone :");
        phone.setBounds(100, 400, 200, 30);
        j.add(phone);
        
        JTextField phonetxt = new JTextField();
        phonetxt.setBounds(170, 400 ,200, 30);
        j.add(phonetxt);
                       

        
        JButton loginButton = new JButton();
        loginButton.setText("LogiN");
        loginButton.setBounds(550, 490, 80, 30);
        j.add(loginButton);
              
        
        j.setSize(900, 700);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}

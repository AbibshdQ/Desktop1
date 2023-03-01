/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Perttemuan1;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author User
 */
public class FormLatihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("jFrame pertama saya");
        
        
        final JLabel label = new JLabel();            
        label.setHorizontalAlignment(JLabel.CENTER);    
        label.setSize(250,100);    
        SpinnerModel value =  new SpinnerNumberModel(5, //initial value  
                0, //minimum value  
                10, //maximum value  
                1); //step  
        JSpinner spinner = new JSpinner(value);   
        spinner.setBounds(200, 150, 200, 30);    
        j.add(spinner); 
        j.add(label); 
         
        JLabel name = new JLabel();
        name.setText("Jumlah:");
        name.setBounds(100, 150, 100, 30);
        j.add(name);
        
        JTextField nametxt = new JTextField();
        nametxt.setBounds(200, 100 ,200, 30);
        j.add(nametxt);
               
        JLabel username = new JLabel();
        username.setText("Nama Menu:");
        username.setBounds(100, 100, 200, 30);
        j.add(username);
        
     
        
         JLabel password = new JLabel();
        password.setText("voucher:");
        password.setBounds(100, 200, 200, 30);
        j.add(password);
        
        JTextField passwordtxt = new JTextField();
        passwordtxt.setBounds(200, 200 ,200, 30);
        j.add(passwordtxt);
                       
    
        JLabel check = new JLabel();
        check.setText("pembayaran:");
        check.setBounds(100, 270, 200, 30);
        j.add(check);
                       
        JCheckBox checkBox1 = new JCheckBox("Cod");  
        checkBox1.setBounds(200,250, 50,70);  
        JCheckBox checkBox2 = new JCheckBox("Kartu kredit", true);  
        checkBox2.setBounds(250,250, 180,70);  
        j.add(checkBox1);  
        j.add(checkBox2); 
        
      
        
        
        
        JTextArea area=new JTextArea("Silahkan masukkan alamat anda");  
        area.setBounds(200,330, 200,200);  
        j.add(area); 
       
        JLabel areat = new JLabel();
        areat.setText("Alamat:");
        areat.setBounds(100, 330, 200, 30);
        j.add(areat);
        
        
        
        
        
        JButton loginButton = new JButton();
        loginButton.setText("Kirim");
        loginButton.setBounds(550, 490, 80, 30);
        j.add(loginButton);
              
        
        j.setSize(900, 700);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}

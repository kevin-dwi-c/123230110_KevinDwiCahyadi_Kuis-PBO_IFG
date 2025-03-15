
package pkg123230110_kuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame{
    private JLabel lblUsername, lblPass;
    private JTextField txtUsername;
    private JPasswordField txtPass;
    private JButton btnLogin;
    public void LoginPage(){
        setTitle("Login");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    
        //Username 
        lblUsername = new JLabel("Username:");
        lblUsername.setBounds(20, 20, 80, 25);
        add(lblUsername);
        txtUsername = new JTextField();
        txtUsername.setBounds(100, 20, 150, 25);
        add(txtUsername);
        
        //Password
        lblPass = new JLabel("Password:");
        lblPass.setBounds(20, 60, 80, 25);
        add(lblPass);
        txtPass = new JPasswordField();
        txtPass.setBounds(100, 60, 150, 25);
        add(txtPass);
        
        //Button
        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 100, 80, 25);
        add(btnLogin);
        
    btnLogin.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               String Username = txtUsername.getText();
               String Password = new String(txtPass.getPassword());
               
               if(Username.equals("123230110") && Password.equals("ifkelasg")){
                   JOptionPane.showMessageDialog(LoginPage.this, "Login Berhasil");
                   dispose();
                   new inputReservasi().setVisible(true);
               }else{
                   JOptionPane.showMessageDialog(LoginPage.this, "Username/Password Salah");
               }  
           }   
    });
        setVisible(true);
  }   
}

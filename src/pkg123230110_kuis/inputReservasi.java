
package pkg123230110_kuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inputReservasi extends JFrame{
    private JLabel lblNama, lblIdentitas, lblMalam, lblKamar,lblFasilitas;
    private JTextField txtNama, txtIdentitas, txtMalam;
    private JComboBox<String> cbKamar;
    private JCheckBox cbSarapan,cbKolamRenang,cbSpa;
    private JButton btnSubmit,btnLogout;
    
    public inputReservasi(){
        setTitle("Reservasi Hotel");
        setSize(450,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
    
        //nama
        lblNama = new JLabel("Nama:");
        lblNama.setBounds(30, 30, 100, 25);
        add(lblNama);
        txtNama = new JTextField();
        txtNama.setBounds(150, 30, 200, 25);
        add(txtNama);
    
        //identitas
        lblIdentitas = new JLabel("Identitas:");
        lblIdentitas.setBounds(30, 70, 100, 25);
        add(lblIdentitas);
        txtIdentitas = new JTextField();
        txtIdentitas.setBounds(150, 70, 200, 25);
        add(txtIdentitas);
        
        //JumlahMalam
        lblMalam = new JLabel("Malam:");
        lblMalam.setBounds(30, 110, 100, 25);
        add(lblMalam);
        txtMalam = new JTextField();
        txtMalam.setBounds(150, 110, 200, 25);
        add(txtMalam);
    
        //Kamar
        lblKamar = new JLabel("Kamar:");
        lblKamar.setBounds(30, 150, 100, 25);
        add(lblKamar);
        String[] kamar = {"Standard","Deluxe","Suite"};
        cbKamar = new JComboBox<>(kamar);
        cbKamar.setBounds(150, 150, 100, 25);
        add(cbKamar);
        
        lblFasilitas = new JLabel("Fasilitas:");
        lblFasilitas.setBounds(30, 190, 100, 25);
        add(lblFasilitas);
        cbSarapan = new JCheckBox("Sarapan");
        cbSarapan.setBounds(110, 190, 80, 25);
        add(cbSarapan);
        cbKolamRenang = new JCheckBox("Kolam Renang");
        cbKolamRenang.setBounds(200, 190, 120, 25);
        add(cbKolamRenang);
        cbSpa = new JCheckBox("Spa");
        cbSpa.setBounds(320, 190, 100, 25);
        add(cbSpa);
        
        //button
        btnLogout = new JButton("Logout");
        btnLogout.setBounds(150, 230, 100, 30);
        add(btnLogout);
        btnLogout.addActionListener(e -> handleLogout());
        
        btnSubmit = new JButton("Pesan");
        btnSubmit.setBounds(260, 230, 100, 30);
        add(btnSubmit);
        btnSubmit.addActionListener(e -> handleSubmit());
        
        
    }
    
    private void handleSubmit(){
        try{
            ReservasiHotel reservasi = new ReservasiHotel(
               txtNama.getText(),
               txtIdentitas.getText(),
               Double.parseDouble(txtMalam.getText()),
               (String) cbKamar.getSelectedItem(),
               cbKolamRenang.isSelected() ? "Kolam Renang" : cbSarapan.isSelected() ? "Sarapan" : "Spa"
            );
            new ResultPage().showResult(reservasi);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(inputReservasi.this, "Harap masukkan angka pada field Malam", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void handleLogout(){
        int confirm = JOptionPane.showConfirmDialog(inputReservasi.this, "Yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            dispose();
        }else{
            dispose();
            new LoginPage().setVisible(true);
        }
    }

}

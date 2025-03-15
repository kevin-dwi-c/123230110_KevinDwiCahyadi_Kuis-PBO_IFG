package pkg123230110_kuis;

import javax.swing.JOptionPane;


public class ResultPage {
    public void showResult(ReservasiHotel reservasi){
    JOptionPane.showMessageDialog(null, reservasi.getInfo(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}

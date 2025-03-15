
package pkg123230110_kuis;

public class ReservasiHotel {
    private String nama;
    private String identitas;
    private double jumlahMalam;
    private String kamar;
    private String fasilitas;
    
    public ReservasiHotel(String nama, String identitas, double jumlahMalam, String kamar, String fasilitas){
        this.nama = nama;
        this.identitas = identitas;
        this.jumlahMalam = jumlahMalam;
        this.kamar = kamar;
        this.fasilitas = fasilitas;
    }
    
    double getTotalNginep(){
        if(kamar.equals("Standard")){
            return (300000 * jumlahMalam);
        }else if(kamar.equals("Deluxe")){
            return (500000 *  jumlahMalam);
        }else{
            return (1500000 * jumlahMalam);
        }
    }
    
    double getFasilitas(){
        if(fasilitas.equals("Sarapan")){
            return 50000;
        }else if(fasilitas.equals("Kolam Renang")){
            return 100000;
        }else{
            return 200000;
        }
    }
    double getTotalFasilitas(){
        if(fasilitas.equals("Sarapan") && fasilitas.equals("Kolam Renang")){
            return 150000;
        }else if(fasilitas.equals("Kolam Renang") && fasilitas.equals("Spa") ){
            return 300000;
        }else if(fasilitas.equals("Sarapan") && fasilitas.equals("Spa")){
            return 250000;
        }else{
            return 350000;
        }
    }
    double getHasil(){
        return getTotalNginep() + getFasilitas();
    }
    
    public String getInfo(){
        if(kamar.equals("Standard")){
            return  "Reservasi Berhasil !" + "\n\n" +
                    "Nama:" + nama + "\n" +
                    "Identitas:" + identitas + "\n" +
                    "Lama Menginap:" + jumlahMalam + "\n" +
                    "Jenis Kamar:" + kamar + "\n\n" +
                    "Harga Kamar: Rp 300.000 x " + jumlahMalam + "=" + getTotalNginep() + "\n" +
                    "Fasilitas Tambahan: Rp " + getFasilitas() + "\n\n" +
                    "Total Harga:" + getHasil();
        }else if(kamar.equals("Deluxe")){
            return  "Reservasi Berhasil !" + "\n\n" +
                    "Nama:" + nama + "\n" +
                    "Identitas:" + identitas + "\n" +
                    "Lama Menginap:" + jumlahMalam + "\n" +
                    "Jenis Kamar:" + kamar + "\n\n" +
                    "Harga Kamar: Rp 500.000 x " + jumlahMalam + "=" + getTotalNginep() + "\n" +
                    "Fasilitas Tambahan: Rp " + getFasilitas() + "\n\n" +
                    "Total Harga:" + getHasil();
        }else{
            return  "Reservasi Berhasil !" + "\n\n" +
                    "Nama:" + nama + "\n" +
                    "Identitas:" + identitas + "\n" +
                    "Lama Menginap:" + jumlahMalam + "\n" +
                    "Jenis Kamar:" + kamar + "\n\n" +
                    "Harga Kamar: Rp 1.500.000 x " + jumlahMalam + "=" + getTotalNginep() + "\n" +
                    "Fasilitas Tambahan: Rp " + getTotalFasilitas()+ "\n\n" +
                    "Total Harga:" + getHasil();
        }        
                
    }
        
        
}

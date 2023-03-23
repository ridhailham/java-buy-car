class Kendaraan {
    private String namaKendaraan;
    private int hargaMobil;
    private int jumlahKendaraan;

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    } 

    public String getNamaKendaraan() {
        return this.namaKendaraan;
    }

    public void setHargaKendaraan(int hargaMobil) {
        this.hargaMobil = hargaMobil;
    }

    public int getHargaKendaraan() {
        return this.hargaMobil;
    }

    public void setJumlahKendaraan(int jumlahKendaraan){
        this.jumlahKendaraan = jumlahKendaraan;
    }

    public int getJumlahKendaraan() {
        return this.jumlahKendaraan;
    }
} 

class Mobil extends Kendaraan{
    
    public void setNamaMobil(String namaMobil) {
        super.setNamaKendaraan(namaMobil);
    }

    public String getNamaMobil() {
        return super.getNamaKendaraan();
    }

    public void setHargaMobil(int hargaMobil) {
        super.setHargaKendaraan(hargaMobil);
    }

    public int getHargaMobil() {
        return super.getHargaKendaraan();
    }

    public void setJumlahMobil(int jumlahMobil) {
        super.setJumlahKendaraan(jumlahMobil);
    }

    public int getJumlahMobil() {
        return super.getJumlahKendaraan();
    }
}

public class lagi {
    public static void main(String[] args) {
        Kendaraan m = new Mobil();

        m.setNamaKendaraan("Buggatti");
        m.setJumlahKendaraan(100);
        m.setHargaKendaraan(10000000);

        System.out.println("Nama Kendaraan " + m.getNamaKendaraan());
        System.out.println("Jumlah Kendaraan " + m.getJumlahKendaraan());
        System.out.println("Harga Mobil " + m.getHargaKendaraan());

        long totalHarga = m.getJumlahKendaraan() * m.getHargaKendaraan();
        System.out.println("Total Biaya Pembelian Mobil");
        System.out.println(totalHarga);

        
    }
}

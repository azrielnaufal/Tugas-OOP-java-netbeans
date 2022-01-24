package tubes;

public class apetizer implements takeAway{
    String nama;
    int harga;
    
    public apetizer(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    @Override
    public void bungkus() {
        //
    }
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    
}

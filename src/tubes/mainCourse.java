    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author ASUS
 */
public class mainCourse implements takeAway{
    String nama;
    int harga;
    public mainCourse(String nama, int harga) {
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

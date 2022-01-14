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
public class cook implements employee {
    String nama;
    String ID_Employee;
    int gaji;
    final int upahPerHari = 150000;

    public cook(String nama, String ID_Employee) {
        this.nama = nama;
        this.ID_Employee = ID_Employee;
    }
    @Override
    public void infoJobDesk() {
        System.out.println("blabla");
    }
//    @Override
//    public void setGaji(int day) {
//        gaji = upahPerHari * day;
//    }
    public void addMealsMenu(){
        //not yet
    }
}

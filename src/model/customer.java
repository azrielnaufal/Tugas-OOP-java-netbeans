/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class customer extends menu {
    String nama;
    String ID;
    order order;// apakah nanti order harus dalam bentuk array?

    public customer(String nama, String ID) {
        this.nama = nama;
        this.ID = ID;
    }
    public String getNama() {
        return nama;
    }
    public String getID() {
        return ID;
    }

    public void order() {
        System.out.println("=========== isi data customer ===========");
        // data order
        Scanner sc = new Scanner(System.in);
        System.out.println("nomor order (nanti bisa digenerate otomatis)-");
        int no_order = sc.nextInt();
        System.out.println("nomor table-");
        int no_table = sc.nextInt();
        // make order
        order = new order(no_order, no_table);
        System.out.println("nomor menu minuman-");
        int drinks_menu = sc.nextInt();
        System.out.println("nomor menu main course-");
        int mainCourse_menu = sc.nextInt();
        System.out.println("nomor menu desert-");
        int desert_menu = sc.nextInt();
        System.out.println("nomor menu apetizer-");
        int apetizer_menu = sc.nextInt();

        // belum input quantity, sama masih 1 order/1 jenis
        order.tambahDrinks(super.minuman[drinks_menu]);
        // System.out.println(super.minuman[drinks_menu].getNama());
        order.tambahMainCourse(super.mainCourse[mainCourse_menu]);
        // System.out.println(super.mainCourse[mainCourse_menu].getNama());
        order.tambahDesert(super.desert[desert_menu]);
        // System.out.println(super.desert[desert_menu].getNama());
        order.tambahApetizer(super.apetizer[apetizer_menu]);
        // System.out.println(super.apetizer[apetizer_menu].getNama());
        // confirmed order
        order.check_order();
    }

}

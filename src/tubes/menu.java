package tubes;

import java.util.*;

public class menu {
    drinks[] minuman;
    desert[] desert;
    mainCourse[] mainCourse;
    apetizer[] apetizer;
    int jumDrinks, jumDesert, jumMainCourse, jumApetizer = 0;
    final int variasi = 2;

    public menu() {
        this.minuman = new drinks[variasi];
        this.desert = new desert[variasi];
        this.mainCourse = new mainCourse[variasi];
        this.apetizer = new apetizer[variasi];
    }

    public void initialize_menu() {
        // create
        drinks esTeh = new drinks("esTeh", 10000);
        drinks kopi = new drinks("kopi", 8000);
        desert lavaCake = new desert("lavaCake", 15000);
        desert cheeseCake = new desert("cheeseCake", 20000);
        mainCourse steak = new mainCourse("steak", 50000);
        mainCourse ribsEye = new mainCourse("ribsEye", 75000);
        apetizer roti = new apetizer("roti", 12000);
        apetizer sop = new apetizer("sop", 25000);
        // add ke manu
        this.tambahApetizer(roti);
        this.tambahApetizer(sop);
        this.tambahDesert(cheeseCake);
        this.tambahDesert(lavaCake);
        this.tambahDrinks(esTeh);
        this.tambahDrinks(kopi);
        this.tambahMainCourse(ribsEye);
        this.tambahMainCourse(steak);
    }

    public void tambahDrinks(drinks minuman) {
        this.minuman[this.jumDrinks] = minuman;
        this.jumDrinks++;
    }

    public void tambahDesert(desert desert) {
        this.desert[this.jumDesert] = desert;
        this.jumDesert++;
    }

    public void tambahMainCourse(mainCourse mainCourse) {
        this.mainCourse[this.jumMainCourse] = mainCourse;
        this.jumMainCourse++;
    }

    public void tambahApetizer(apetizer apetizer) {
        this.apetizer[this.jumApetizer] = apetizer;
        this.jumApetizer++;
    }

    public void infoMenu() {
        Scanner sc = new Scanner(System.in);
        boolean eof = false;
        while (!eof) {
            System.out.print("input 1 untuk tetap lihat menu / input 2 untuk order : ");
            int pil = sc.nextInt();
            if (pil == 1) {
                System.out.println("Minuman ada : ");
                for (int i = 0; i < minuman.length; i++) {
                    System.out.println(i + "| " + minuman[i].getNama() + " ,harganya : " + minuman[i].getHarga());
                }
                System.out.println("main course ada : ");
                for (int i = 0; i < mainCourse.length; i++) {
                    System.out.println(i + "| " + mainCourse[i].getNama() + " ,harganya : " + mainCourse[i].getHarga());
                }
                System.out.println("desert ada : ");
                for (int i = 0; i < desert.length; i++) {
                    System.out.println(i + "| " + desert[i].getNama() + " ,harganya : " + desert[i].getHarga());
                }
                System.out.println("apetizer ada : ");
                for (int i = 0; i < apetizer.length; i++) {
                    System.out.println(i + "| " + apetizer[i].getNama() + " ,harganya : " + apetizer[i].getHarga());
                }
            } else if (pil == 2) {
                eof = true;
            }
        }
    }
}
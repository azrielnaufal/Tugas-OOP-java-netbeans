
package tubes;

import java.util.*;

public class order {
    int No_Order;
    int table;
    // waiter waiter;
    // customer pelanggan;
    boolean alreadyPaid;
    drinks[] minuman;
    desert[] desert;
    mainCourse[] mainCourse;
    apetizer[] apetizer;
    final int x = 2;// searusnya order ga ada maksnya, nanti di edit
    int jumDrinks, jumDesert, jumMainCourse, jumApetizer = 0;

    public order(int No_Order, int table) {
        this.No_Order = No_Order;
        this.table = table;
        // this.waiter = waiter;
        // this.pelanggan = pelanggan;
        this.minuman = new drinks[x];
        this.desert = new desert[x];
        this.mainCourse = new mainCourse[x];
        this.apetizer = new apetizer[x];
    }

    public void pay() {
        alreadyPaid = true;
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

    public void check_order() {
        System.out.println("=========== confirmed order : ===========");
        for (int i = 0; i < jumDrinks; i++) {
            System.out.println("pesanan minuman " + i + " :" + minuman[i].getNama());
        }
        for (int i = 0; i < jumMainCourse; i++) {
            System.out.println("pesanan main course " + i + " :" + mainCourse[i].getNama());
        }
        for (int i = 0; i < jumDesert; i++) {
            System.out.println("pesanan desert " + i + " :" + desert[i].getNama());
        }
        for (int i = 0; i < jumApetizer; i++) {
            System.out.println("pesanan apetizer " + i + " :" + apetizer[i].getNama());
        }
        // System.out.println("pesanan minuman " + " :" + minuman[0].getNama());
        // System.out.println("pesanan main course " + " :" + mainCourse[0].getNama());
        // System.out.println("pesanan desert " + " :" + desert[0].getNama());
        // System.out.println("pesanan apetizer " + " :" + apetizer[0].getNama());
    }
}

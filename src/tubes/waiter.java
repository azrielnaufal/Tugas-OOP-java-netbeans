
package tubes;

public class waiter implements employee  {
    String nama;
    String ID_Employee;
    int gaji;
    final int upahPerHari = 100000;

    public waiter(String nama, String ID_Employee) {
        this.nama = nama;
        this.ID_Employee = ID_Employee;
    }
    @Override
    public void infoJobDesk() {
        System.out.println("blabla..");
    }
//    @Override
//    public void setGaji(int day) {
//        gaji = upahPerHari * day;
//    }
}

package BT1_Bien;

public class SinhVien {

    String address = "HCM";
    static int old = 20;
    public static void main(String[] args) {
        String name = "Lyly";
        SinhVien sv = new SinhVien();
        System.out.println("Ten" + name);
        System.out.println("Dia chi" + sv.address);
        System.out.println("Tuoi" + old);
        System.out.println("Phone" + ThongTin.phone);
    }
}

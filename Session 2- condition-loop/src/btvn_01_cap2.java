import java.util.Scanner;
public class btvn_01_cap2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập thu nhập hàng năm của bạn: ");
        double thuNhap = scan.nextDouble();
        double thue = 0;
     if (thuNhap < 0) {
         System.out.println("Vui lòng nhập đúng thu nhập của bạn");
         return;
     }else if (thuNhap <= 5000000) {
         thue = thuNhap * 0.05;
     } else if (thuNhap <= 10000000) {
         thue = thuNhap * 0.10;
     } else if (thuNhap <= 18000000) {
         thue = thuNhap * 0.15;
     } else if (thuNhap <= 32000000) {
         thue = thuNhap * 0.20;
     } else if (thuNhap <= 52000000) {
         thue = thuNhap * 0.25;
     } else if (thuNhap <= 80000000) {
         thue = thuNhap * 0.30;
     } else
         thue = thuNhap * 0.35;
     System.out.println("Số thuế bạn cần phải đóng là: " + thue + "VND");
    }
}

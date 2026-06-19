import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LẬP TRÌNH CƠ BẢN:
//        1. Khai báo biến
//        2. toán tử: +. - *, / . %
//        3. phep toan so sánh: > >=, <, <=
//        4. Phep toan noi cac dieu kien &&, ||
//        5. condition, loop
//        6. function
//        7. Lập trình hướng đối tượng (OOP)
//        + ke thua
//        + dong goi
//        + truu tuong
//        Những web tham khảo, học java, kết hợp các app AI
//        1. Xuất giá trị ra ngoài terminal
        System.out.println("Hello testing 16");
//        2, Khai báo biến (Variable)
//        số nguyên: int, long
//        gán số 10 này vào biến number1
        int number1 = 10;
        String str1 = "Testing 16";
        System.out.println(number1);
        System.out.println(str1);

//        truong hop trong println có cả chu va so java se convert du lieu so => chu VD 10 => "10"
        System.out.println("Hello" + number1);
//3. cac phep toan
//        + - * / Chia lay nguyen % (chia lay du)

        int num1 = 10;
        int num2 = 20;
//        Ket qua tong cua num1 va num2 se gan vao bien sum
        int sum = num1 + num2;
        System.out.println("Ket qua cua num1 va num2 la:" + sum);
//        Quy tắc đặt tên biến, tên hàm
//        1.đặt tên biến theo quyy tắc camel case
//        vd: tongHaiSo, dangNhapThanhCong, taoTaiKhoan
//        2.đặt tên biến đúng ngữ cảnh
//        3.các tiếng của tên biến không được có khoản trắng, space
//        Không được có kí tự đặc biệt %, # $
//        4.ký tự đầu tiên phải là chữ
//        ví dụ đúng: sum1. sum2. VD sai: 1sum, 2sum
//        5. không được đặt tên biến trùng với các keyword trong java: VD int, float, long, def, class
//
//        Phép trừ:
        int num3 = 20;
        int num4 = 30;
        int minus = num3 - num4;
        System.out.println("Hieu num3 va num4 la:" + minus);
//num3++, ++num3 => num3 = num3 + 1
//num3--, --num3 => num3 = num3 - 1
//        Thuong se gap trong vong lap
//        PHEP NHAN
        int num5 = 39;
        int num6 = 79;
        int multiply = num5 * num6;
        System.out.println("Tich cua num5 va num6 la:" + multiply);
//        PHEP CHIA
//        Chia lay nguyen
        int num7 = 10;
        int num8 = 4;
        int chiaLayNguyen = num7 / num8;
        System.out.println("chia lay nguyen cua 10 va 4 là:" + chiaLayNguyen);
        int chiaLayDu = num7 % num8;
        System.out.println("chia lay du cua 10 va 4 la:" + chiaLayDu);
//        Các phép toán so sánh: > >= < <= == (kiem tra bang) != (kiem tra khac nhau) ! (phủ định)
//        Kết quả trả về boolean - hoac là true hoac là false
        boolean kiemTra1 = num7 > num8;
        boolean kiemTra2 = num7 < num8;
        System.out.println("Ket qua cua num7 va num8 la:" + kiemTra1);
        System.out.println("Ket qua cua num7 va num8 la:" + kiemTra2);
//        các phép toán này sẽ đi chung với cú pháp điều kiện (condition) và vòng lặp
//        Phep toán nối các điều kiện: &&, ||
//        boolean kiemTra3 = (num1 > num2) && (num2 > num3) && (num3 >num4);
//        true && true => true
//        tất cả trường hopwj còn lại là false
//        boolean kiemTra4 = (num1 > num2) || (num2 > num3) || (num3 > num4);
//        Chỉ cần một trong các điều kiện là true => true

//        Tư duy lập trình (tu duy dev)
//        mo hinh 3 khoi: input + process + output
//        B1: hay viẻt testcase ve tinh nang quen mat khau
//        input: nhap email hoac SDT
//        output:
//        test case 1: change pass thanh cong + login thanh cong voi mat khau moi
//        test case 2: change pass thanh cong + longin voi pass cu. expect: fail
//
//        Bai 1: Tinh tong 3 so nguyen nhap tu ban phim
//        input:
//        Scanner: doi tuong ho tro nhap gia tri tu ban phim
//        B1: tao doi tuong scanner
        Scanner scan = new Scanner(System.in);
//        System.out.println("Moi ban nhap so1: ");
//        int so1 = scan.nextInt();
//
//        System.out.println("Moi ban nhap so2: ");
//        int so2 = scan.nextInt();
//        System.out.println("Moi ban nhap so3: ");
//        int so3 = scan.nextInt();
//        output:
//        int tong = 0;
//
//       process
//        tong = so1 + so2 + so3;
//        System.out.println("tong cua so1, so2 va so3 la" + tong);
//        B2: nhap ten cua ban. Hay xuat ra noi dung la
//        Xin chao <tên>
//        input: biến String lưu tên nhập từ bàn phim
        System.out.println("Moi ban nhap ten: ");
        String name = scan.nextLine();
        System.out.println("Xin chao " + name);
// Tổng kết lại:
//        Khai bao bien
//        nhap, xuat
//        phep toan
//        phep so sanh
//        phep noi nhieu dieu kien
//        mo hinh 3 khoi: input + process + output

    }
}



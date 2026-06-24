//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Bài tập xếp loại theo điểm dùng điều kiện if và else if
//    9-10 -> xuất sắc, 8<9 giỏi, 6.5-8 khá, 5-<6.5 trung bình, dưới 5 yếu
//    Scanner scan = new Scanner(System.in);
//    System.out.println("Mời bạn nhập điểm: ");
//    float diem = scan.nextFloat();
//    if ((diem < 0) || (diem > 10)) {
//        System.out.println("Điểm bị sai, vui lòng nhập lại");
//    }
//    if ((9 <= diem) && (diem <= 10)) {
//        System.out.println("Xuất sắc");
//    } else if ((8 <= diem) && (diem < 9)) {
//        System.out.println("Giỏi");
//    } else if ((6.5 <= diem) && (diem < 8)) {
//        System.out.println("Khá");
//    } else if ((5 <= diem) && (diem < 6.5)) {
//        System.out.println("Trung bình");
//    } else {
//        System.out.println("Yếu");
     String username = "admin";
     String password = "123456";
     boolean isActive = true;
//     Check trường hợp bỏ trống tài khoản, mật khẩu, tài khoản hoặc mật khẩu không đúng, tài khoản deactivate
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Tài khoản hoặc mật khẩu không được bỏ trống");
        } else if (!isActive) {
            System.out.println("Tài khoản đã bị khóa");
        } else if (username.equals("admin") == false || password.equals("123456") == false) {
            System.out.println("Tài khoản hoặc mật khẩu không đúng");
        } else {
            System.out.println("đăng nhập thành công");
    Scanner scan = new Scanner(System.in);
    System.out.println("Mời bạn nhập tuổi");
    int tuoi = scan.nextInt();
    scan.nextLine();
    System.out.println("Nhập loại vé (VIP hoặc Thường): ");
    String loaiVe = scan.nextLine();
    int giaVe = 0;
    if (tuoi < 12) {
        giaVe = 0;
        System.out.println("Trẻ em dưới 12 tuổi miễn phí vé");
    } else if (tuoi >= 60) {
        giaVe = 50000;
        System.out.println("Giá vé của bạn là 50000 VND");
    } else {
        if (loaiVe.equalsIgnoreCase("VIP")) {
            giaVe = 200000;
                    System.out.println("Giá  vé của bạn là 200000 VND");
        } else {
            giaVe = 150000;
            System.out.println("Giá vé của bạn là 150000 VND");

        }
    }
    }
}

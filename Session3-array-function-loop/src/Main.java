//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
// mảng
//    mảng số nguyên
//    cách 1: tạo mảng số nguyền và gán giá trị sẵn
    int [] arrNum = {1, 2, 3, 4, 5, 6, 7};
//
    System.out.println(arrNum[0]);
//    in các phần tử của mảng => loop
//    Khi duyệt mảng, giá trị khởi đầu: phần tử đầu tiên của mảng
//    Điều kiện kết thúc: duyệt tới chỉ số cuối cùng của mảng
//    bước nhảy: tùy vào đề bài
//    for (int i = 0; i < arrNum.length; i++) {
//        System.out.println(arrNum[i]);
//        2. Nhập từng phần tử của mảng
//        phần 1: khai báo số lượng phần tử của mảng
//        Phaanf 2: nhập từng phần tử của mảng
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("mời bạn nhập số lượng phần tử cua mảng");
        n = scan.nextInt();
//        cập nhâtj vùng nhớ gồm n ô nhớ liền kề nhau
        int[] arrNum1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ" + (i + 1));
            arrNum1[i] = scan.nextInt();

        }
//        System.out.println("các giá trị trong arrNum1 là: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(arrNum1[i]);
//        }
//        Bài 1: tính tổng của các phần tử trong mảng
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//    Bai3:  Nhap so can tim. in ra vi tri cua so can tim, neu k tim thay in ra -1
//    VD [1, 2, 3, 4, 5]. target = 3
//    output: 2
//    VD [1, 2, 3, 4, 5] target = 6
//    output: -1
    int [] arrNum3 = {1, 2, 3, 4, 5};
        System.out.println("Nhap so can tim");


    }
}

public class btvn_02_cap2 {
    public static void main(String[] args) {
        String str = "madam";
        boolean doiXung = true;
        for (int i = 0; i < str.length() /2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                doiXung = false;
            } else
                doiXung = true;

        }
        if (doiXung == true) {
            System.out.println("Đối xứng");
        } else
            System.out.println("Không Đối xứng");
//        Ý 2:
        String str2 = "hello";
        boolean doiXung2 = true;
        for (int i = 0; i < str2.length() /2; i++) {
            if (str2.charAt(i) != str2.charAt(str2.length() - 1 - i)) {
                doiXung2 = false;
            } else
                doiXung2 = true;

        }
        if (doiXung2 == true) {
            System.out.println("Đối xứng");
        } else
            System.out.println("Không Đối xứng");
    }
}

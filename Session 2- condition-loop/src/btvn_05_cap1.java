public class btvn_05_cap1 {
    public static void main(String[] args) {
        String str1 = "Xin chào các bạn";
        String[] word1 = str1.split(" ");
        for (int i = 0; i < word1.length; i++ ) {
            Character.toUpperCase(word1[i].charAt(0));
            System.out.println(Character.toUpperCase(word1[i].charAt(0)));
        }
        String str2 = "Hello World";
        String[] word2 = str2.split(" ");
        for (int i = 0; i < word2.length; i++ ) {
            System.out.println(word2[i].charAt(0));
        }
    }
}

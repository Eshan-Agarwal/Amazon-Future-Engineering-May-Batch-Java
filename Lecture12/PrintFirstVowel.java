public class PrintFirstVowel {

    public static void main(String[] args) {
        char[] chArr = new char[]{'b', 'c', 'd', 'a', 'e'};

        for (int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

}
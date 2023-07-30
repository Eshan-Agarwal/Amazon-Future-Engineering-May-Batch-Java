import java.util.Arrays;

public class IsogramStr {

    public static void main(String[] args) {
        String str = "machine";

        if (str == null) {
            System.out.println("String is null");
            return;
        }
        System.out.println(isogramStrByFreqMap(str));

    }

    // Time = O(N)
    // Space = O(26) --> O(1) contant
    public static boolean isogramStrByFreqMap(String str) {
        int n = str.length();
        if(n == 1) return true;

        int[] freqMap = new int[26]; // contant size array, it is not depends on value n
        for (int i = 0; i < n; i++) {

            char chi = str.charAt(i);
            int idx = (int)(chi - 'a');
            freqMap[idx]++;

            if (freqMap[idx] > 1) {
                return false;
            }
        }
//
//        for (int i = 0; i < 26; i++) {
//            if (arr[i] > 1) {
//                return false;
//            }
//        }

        return true;
    }

    public static boolean isogramStrBySorting(String str) {

        int n = str.length();

        // Edge Case
        if (n == 1) return true; // one char

        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);

        int i = 0; int j = 1;
        while(i < n && j < n) {

            char chi = str.charAt(i);
            char chj = str.charAt(j);
            if (chi == chj) {
                return false;
            } else {
                i++; j++;
            }
        }
        return true;
    }

    // Time Comp == O(N^2)
    public static boolean isogramStrBruteForce(String str) {

        int n = str.length();

        for (int i = 0; i < n; i++) {
            char chi = str.charAt(i);
            for (int j = i + 1; j < n; j++) {
                if (i != j) {
                    char chj = str.charAt(j);
                    if (chi == chj) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
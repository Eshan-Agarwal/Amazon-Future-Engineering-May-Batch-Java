public class IsPangram {

    public static void main(String[] args) {
        String str = "abcd";

        if (isPangram(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPangram(String str) {
        if (str == null) return false;

        int[] freqMap = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            int idx = (int)(ch - 'a');
            freqMap[idx]++;
        }

        for (int val: freqMap) {
            if (val == 0) {
                return false;
            }
        }
        return true;
    }
}
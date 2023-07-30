public class IsAnagrams {

    public static void main(String[] args) {
        String str1 = "peek";
        String str2 = "keep"; // str2 = null --> Edge Case

        if (str1 == null || str2 == null) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] freqMap1 = getFreqMap(str1);

        System.out.println(checkAnagram(freqMap1, str2));
    }

    public static boolean checkAnagram(int[] freqMap, String str2) {

        for (int i = 0; i < str2.length(); i++) {
            char chi = str2.charAt(i);
            int idx = (int)(chi - 'a');
            freqMap[idx]--;
        }

        for (int val: freqMap) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] getFreqMap(String str) {
        int n = str.length();
        int[] freqMap = new int[26]; // contant size array, it is not depends on value n
        for (int i = 0; i < n; i++) {
            char chi = str.charAt(i);
            int idx = (int)(chi - 'a');
            freqMap[idx]++;
        }
        return freqMap;
    }
}
public class LongestRepeatingChar {

    public int getMaxLenSubStr(String str) {

        if (str == null || str.length() == 0) return 0;

        int si = 0; int ei = 0; int maxFreqOfChar = 0; int maxLen = 0;

        int[] freqMap = new int[26];
        while(ei < str.length()) {
            char chei = str.charAt(ei);
            freqMap[chei - 'A']++;
            maxFreqOfChar = Math.max(maxFreqOfChar, freqMap[chei - 'A']);

            int requiredK = (ei - si + 1) - maxFreqOfChar;

            // release
            if (requiredK > k) {
                char chsi = str.charAt(si);
                freqMap[chsi - 'A']--;
                si++;
            }
            maxLen = Math.max(maxLen, (ei - si + 1));
            ei++;
        }

        return maxLen;

    }

}
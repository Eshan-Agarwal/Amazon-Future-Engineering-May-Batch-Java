public class KFreqChar {

    public static void main(String[] args) {

        String str = "heloo worldl";
        int k = 2;

        solution(str, k);

    }

    public static int[] getFreqMap(String str) {
        int[] freqMap = new int[26];

        for (char ch: str.toCharArray()) {
            if (ch == ' ') {
                continue;
            }
            int idx = getIdxFromChar(ch);
            freqMap[idx]++;

        }
        return freqMap;
    }

    public static int getMaxFreq(int[] freqMap) {
        int maxFreq = freqMap[0];
        for (int i = 1; i < freqMap.length; i++) {
            if (freqMap[i] > maxFreq) {
                maxFreq = freqMap[i];
            }
        }
        return maxFreq;
    }

    public static char getCharFromIdx(int idx) {

        return (char)(idx + (int)('a'));

    }

    public static int getIdxFromChar(char ch) {
        return (int)ch - (int)('a');
    }

   // Time = O(N) + O(26) + O(maxFreq * 26) --> O(N)
    public static void solution(String str, int k) {

        int[] freqMap = getFreqMap(str); // contant 26 size array // len(str) --> n

        int maxFreq = getMaxFreq(freqMap); // time = 26

        while (k > 0) { // time = O(maxFreq)

            boolean isFreqFound = false;
            for (int i = 0; i < freqMap.length; i++) { // Constant --> O(26)

                if (freqMap[i] == maxFreq) {
                    char ch = getCharFromIdx(i);
                    System.out.print(ch + " ");
                    isFreqFound = true;
                }
            }
            maxFreq--;
            if (isFreqFound) {
                k--;
            }
        }
    }
}
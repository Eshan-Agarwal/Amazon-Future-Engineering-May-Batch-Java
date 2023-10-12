public class SubstrWithSize3DistinctChar {

    public int getAllSubstrWithSize3AndDistinctChar(String str) {
        if (str == null || str.length() == 0) return 0;

        int si = 0; int ei = 0; int ans = 0; int countUniqueEleInCurrWindow = 0;

        Map<Character, Integer> freqMap = new HashMap<>(); // map char with its freq

        // main loop
        while(ei < str.length()) {

            // update our map
            char chei = str.charAt(ei);
            if (freqMap.containsKey(chei)) {
                int oldFreq = freqMap.get(chei);
                freqMap.put(chei, oldFreq + 1);

            } else { // chei coming first time
                countUniqueEleInCurrWindow++;
                freqMap.put(chei, 1);
            }

            // aquire Code
            if (ei - si + 1 < 3) {
                ei++;

            } else { // Release Code --> window size is 3 here

                if (countUniqueEleInCurrWindow == 3) {
                    ans++;
                }

                // release
                char chsi = str.charAt(si);
                if (freqMap.containsKey(chsi)) {
                    int oldFreChsi = freqMap.get(chsi);
                    freqMap.put(chsi, oldFreChsi - 1);

                    if (freqMap.get(chsi) == 0) {
                        freqMap.remove(chsi);
                        countUniqueEleInCurrWindow--;
                    }
                }

                si++; ei++;
            }
        }

        return ans;
    }

    public int bestGetAllSubstrWithSize3AndDistinctChar (String str) {
        if (str == null || str.length() == 0) return 0;

        int si = 0; int ei = -1; int ans = 0; int countUniqueEleInCurrWindow = 0;

        Map<Character, Integer> freqMap = new HashMap<>(); // map char with its freq

        while(ei < str.length() - 1) {

            // aquire
            while (ei < str.length() - 1 && ei - si + 1 < 3) {
                ei++;
                // update our map
                char chei = str.charAt(ei);
                if (freqMap.containsKey(chei)) {
                    int oldFreq = freqMap.get(chei);
                    freqMap.put(chei, oldFreq + 1);

                } else { // chei coming first time
                    countUniqueEleInCurrWindow++;
                    freqMap.put(chei, 1);
                }

            }

            // record ans
            if (ei - si + 1 == 3 && countUniqueEleInCurrWindow == 3) {
                ans++;
            }

            // release
            while (si < str.length() && ei - si + 1 >= 3) {
                char chsi = str.charAt(si);
                if (freqMap.containsKey(chsi)) {
                    int oldFreChsi = freqMap.get(chsi);
                    freqMap.put(chsi, oldFreChsi - 1);

                    if (freqMap.get(chsi) == 0) {
                        freqMap.remove(chsi);
                        countUniqueEleInCurrWindow--;
                    }
                }
                si++;
            }
        }
        return ans;
    }

}
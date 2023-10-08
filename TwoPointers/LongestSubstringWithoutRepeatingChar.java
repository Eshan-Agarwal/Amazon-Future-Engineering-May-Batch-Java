import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;

        // map ==> char <--> index of last occur ie, befor ei
        Map<Character, Integer> map = new HashMap<>();
        int maxUniqueLen = 0;

        int si = 0; int ei = 0;
        while (ei < s.length()) {
            char ch = s.charAt(ei);

            if (map.containsKey(ch)) {
                si = Math.max(si, (map.get(ch) + 1));
            }

            int lenOfUnqiqueRegion = (ei - si + 1);
            maxUniqueLen = Math.max(maxUniqueLen, lenOfUnqiqueRegion);
            map.put(ch, ei);
            ei++;
        }
        return maxUniqueLen;
    }

}
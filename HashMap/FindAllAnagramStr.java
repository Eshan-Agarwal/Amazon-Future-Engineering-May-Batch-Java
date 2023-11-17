import java.util.HshMap;
import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramStr {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        int lenS = s.length();
        int lenP = p.length();

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> pmap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        int matchCount = 0;
        int si = -1; int ei = 0;

        // make pmap

        for (char ch: p.toCharArray()) {
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        while (ei < lenS) {

            if (pmap.containsKey(s.charAt(ei))) {

                // aquire
                while (ei < lenS && (ei - si) <= lenP) {

                    char ch = s.charAt(ei);
                    smap.put(ch, smap.getOrDefault(ch, 0) + 1);

                    if (pmap.containsKey(ch) && smap.get(ch) <= pmap.get(ch)) {
                        matchCount++;
                    }
                    ei++;
                }


                // record ans
                if (matchCount == lenP) {
                    ans.add(si + 1);
                }

                // release

                while (ei < lenS && (ei - si) > lenP) {
                    char ch = s.charAt(++si);
                    smap.put(ch, smap.get(ch) - 1);

                    if (pmap.containsKey(ch) && smap.get(ch) < pmap.get(ch)) {
                        matchCount--;
                    }
                }

            } else {

                matchCount = 0;
                smap = new HashMap<>();
                si = ei;
                ei++;

            }

        }

        System.out.println(ans);
    }

}
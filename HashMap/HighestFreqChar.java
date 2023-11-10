import java.util.HashMap;
public class HighestFreqChar {

    public static void main(String[] args) {
        System.out.println(highestFreq("codebyte"));
    }

    public static char highestFreq(String str) {

        HashMap<Character, Integer> fmap = new HashMap<>();

        int maxFreq = 0;
        char maxFreqChar = '\n';
        for (char ch: str.toCharArray()) {
            if (fmap.containsKey(ch)) {
                int oldFreq = fmap.get(ch) + 1;
                fmap.put(ch, oldFreq);
            } else {
                fmap.put(ch, 1);
            }

            if (maxFreq < fmap.get(ch)) {
                maxFreq = fmap.get(ch);
                maxFreqChar = ch;
            }
        }
        return maxFreqChar;
    }

}
public class GroupAnagrams {

    public static void main(String[] args) {
     String[] arr = new String[] {ate, bat, eat, nat, tan, tea};

    }

    public int getIdxFromChar(char ch) {
        return ch - 'a';
    }

    public int[] getFreqArr(String str) {
        int[] countArr = new int[26];

        for (char ch: str.toCharArray()) {
            int idx = getIdxFromChar(ch);
            countArr[idx]++;
        }

        return countArr;
    }

    public String getHashedString(String str) {

        int[] countArr = getFreqArr(str);

        StringBuilder sb = new StringBuilder();
        for (int freq: countArr) {
            sb.append(freq);
            sb.append("#");
        }
        return sb.toString();
    }

    public List<List> groupAnagrams(String[] strArr) {

        int n = strArr.length;

        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];

            String hashedString = getHashedString(str);

            if (map.containsKey(hashedString)) {
                List<String> list = map.get(hashedString);
                list.add(str);
                map.put(hashedString, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(hashedString, list);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for (List<String> list: map.values()) {
            ans.add(list);
        }

        return ans;

    }




}
import java.util.*;

public class GroupShiftedString {

    public static void main(String[] args) {
        String[] strArr = new String[] {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

        List<List<String>> ans = groupShiftedString(strArr);
        for (List<String> temp : ans) {
            for (String val: temp) {
                System.out.print(val + "   ");
            }
            System.out.println();
        }
    }

    public static String getHashedString(String str) {

        String hashedString = "";
        for (int i = 1; i < str.length(); i++) {
            int diff = str.charAt(i) - str.charAt(i - 1);
            if (diff < 0) {
                diff += 26;
            }

            hashedString += diff + "#";
        }
        return hashedString;
    }

    public static List<List<String>> groupShiftedString(String[] strArr) {

        Map<String, List<String>> map = new HashMap<>();

        for (String str: strArr) {

            String hashedString = getHashedString(str);

//            map.put(hashedString, map.getOrDefault(hashedString, new ArrayList<>()).add(str))

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
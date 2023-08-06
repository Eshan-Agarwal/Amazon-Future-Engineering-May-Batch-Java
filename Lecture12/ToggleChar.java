public class ToggleChar {

    public static void main(String[] args) {
        String str = "NaVgUrUkUl";

        System.out.println(solution(str));
    }

    public static String solution(String str) {

        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch: str.toCharArray()) {

            if (Character.isUpperCase(ch)) {

                char temp = (char)((int)(ch) + 32);
                sb.append(temp);

            } else if (Character.isLowerCase(ch)){
                char temp = (char)((int)(ch) - 32);
                sb.append(temp);
            }
        }

        return sb.toString();
    }

}
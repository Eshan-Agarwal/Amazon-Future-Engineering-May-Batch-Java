public class LongestCommonSubsequence {

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequenceRecur("mhunuzqrkzsnidwbun", "szulspmhwpazoxijwbq", 0, 0));
    }

    public int longestCommonSubseqTabulation(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i < dp.length; i++) {

            for (int j = 1; j < dp[i].length; j++) {

                char chi = str1.charAt(i - 1);
                char chj = str2.charAt(j - 1);

                if (chi == chj) {

                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }
        return dp[str1.length()][str2.length()];
    }

    // TODO: memoize it --> HW
    public static int longestCommonSubsequenceRecur (String str1, String str2, int i, int j) {

        if (i == str1.length() || j == str2.length()) {
            return 0;
        }

        int chi = str1.charAt(i);
        int chj = str2.charAt(j);

        if (chi == chj) {
            return 1 + longestCommonSubsequenceRecur(str1, str2, i + 1, j + 1);

        } else {
            return Math.max(longestCommonSubsequenceRecur(str1, str2, i + 1, j),
                    longestCommonSubsequenceRecur(str1, str2, i, j + 1)
            );
        }


    }

}
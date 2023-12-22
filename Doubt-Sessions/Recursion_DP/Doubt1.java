public class Doubt1 {

    public static void main(String[] args) {

        String[] strArr = new String[] {"rboe,ubgp,fgub,mnry", "bog,bop,gup,fur,ruk"};

        String str1 = strArr[0];
        String str2 = strArr[1];

        String[] str1Arr = str1.split(","); // ["rbfg","ukop","fgub","mnry"]
        String[] str2Arr = str2.split(","); // ["bog","bop","gup","fur","ruk"]

        // make 4 X 4 size arr from input strArr first element
        char[][] charArr = buildCharArrFromInput(str1Arr);

        for (int k = 0 ; k < str2Arr.length; k++) {
            String temp = str2Arr[k]; // FUR

            char ch = temp.charAt(0);

//            System.out.println(temp);

            // only apply recusion for cell mathching first char in temp
            for (int i = 0 ; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (ch == charArr[i][j]) {
                        if (isWordPresentInCharArr(temp, charArr, 0, "X", i, j)) {
                            System.out.println(temp);;
                        }
                    }
                }
            }
        }

    }

    public static char[][] buildCharArrFromInput(String[] str1Arr) {
        char[][] charArr =  new char[4][4];

        for (int i = 0; i < 4; i++) {
            String temp = str1Arr[i];
            for (int j = 0; j < 4; j++) {
                charArr[i][j] = temp.charAt(j);
            }
        }
        return charArr;
    }

    // Time: Exponenetial
    // Space: Recursive Stack and input Arr

    public static boolean isWordPresentInCharArr(String find, char[][] charArr, int idx, String direction, int i, int j) {

        if (i < 0 || j < 0 || i >= 4 || j >= 4 || idx >= find.length() || find.charAt(idx) != charArr[i][j]) {
            return false;
        }

        if (idx == find.length() - 1) {
            return true;
        }

        if (direction.equals("X")) {

            boolean left =  isWordPresentInCharArr(find, charArr, idx + 1, "L", i, j - 1);
            boolean up =  isWordPresentInCharArr(find, charArr, idx + 1, "U", i - 1, j);
            boolean down =  isWordPresentInCharArr(find, charArr, idx + 1, "D", i + 1, j);
            boolean right =  isWordPresentInCharArr(find, charArr, idx + 1, "R", i, j + 1);

            return (left || up || down || right);

        } else if (direction.equals("U")) {
            return isWordPresentInCharArr(find, charArr, idx + 1, "U", i - 1, j);

        } else if (direction.equals("D")) {
            return isWordPresentInCharArr(find, charArr, idx + 1, "D", i + 1, j);

        } else if (direction.equals("R")) {
            return isWordPresentInCharArr(find, charArr, idx + 1, "R", i, j + 1);

        } else if (direction.equals("L")) {
            return isWordPresentInCharArr(find, charArr, idx + 1, "L", i, j - 1);

        }

        return false;

    }

}


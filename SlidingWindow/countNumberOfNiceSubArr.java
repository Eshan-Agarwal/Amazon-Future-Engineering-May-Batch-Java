public class countNumberOfNiceSubArr {


    public int countSubArrWithLessEqualKOdd(int[] arr, int k) {
        if (k < 0) return 0;

        int n = arr.length;
        if (n == 0) return 0;

        int si = 0; int ei = 0; int ans = 0; int countOddEleInCurrWindow = 0;

        while (ei < n) {
            if (arr[ei] % 2 == 1) {
                countOddEleInCurrWindow++;
            }

            while (si < n && countOddEleInCurrWindow > k) {
                if ((arr[si] % 2) == 1) {
                    countOddEleInCurrWindow--;
                }
                si++;
            }

            ans += (ei - si + 1);
            ei++;
        }
        return ans;
    }

    public int countAllSubArrWithKOddInt(int[] arr, int k) {
        return countSubArrWithLessEqualKOdd(arr, k) - countSubArrWithLessEqualKOdd(arr, k - 1);
    }


//    public int countNiceSUbArr(int[] arr, int k) {
//
//        int si = 0; int ei = 0; int count = 0; int ans = 0; int countOddEle = 0;
//
//        while(ei < arr.length) {
//            if (arr[ei] % 2 == 1) {
//                countOddEle++;
//                if (countOddEle >= k) {
//                    count = 1;
//                    while (arr[si] % 2 != 1) {
//                        count++;
//                    }
//                    total += count;
//                }
//            } else if (countOddEle == k) {
//                total += count;
//            }
//
//            ei++;
//        }
//        return ans;
//    }

}
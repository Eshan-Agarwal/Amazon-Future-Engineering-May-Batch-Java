public class BinarySubArrSum {

    public int countSubArrWithSumLessEqualGoal(int[] arr, int tar) {

        int n = arr.length;
        if (n == 0) return 0;

        if (tar < 0) return 0;

       int currWindowSum = 0; int si = 0; int ei = 0; int ans = 0;

       while(ei < n) {
//           System.out.println(currWindowSum + " " + ei + " " + si);
           currWindowSum += arr[ei];

           while (si < n && currWindowSum > tar) {
               currWindowSum -= arr[si];
               si++;
           }

           ans += (ei - si + 1);
           ei++;
       }

       return ans;
    }

    public int countSubArrWithSumGoal(int[] arr, int goal) {
        return countSubArrWithSumLessEqualGoal(arr, goal) - countSubArrWithSumLessEqualGoal(arr, goal - 1);
    }
}
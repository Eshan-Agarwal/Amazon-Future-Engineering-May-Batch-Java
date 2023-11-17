public class CheckIfArrDivisibleByK {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,10,6,7,8,9};
        int k = 5;
        
        int[] remFreqMap = new int[k];

        for (int val: arr) {
            int rem = val % k;
            if (rem < 0) { // Very very imp
                rem += k;
            }
            remFreqMap[rem]++;
        }

        if(remFreqMap[0] % 2 == 1) {
            System.out.println(false);
        } else {
            for (int i = 1; i <= k / 2; i++) {
                if (remFreqMap[i] != remFreqMap[k - i]) {
                    System.out.println(false);
                }
            }
        }
        System.out.println(true);

    }



}
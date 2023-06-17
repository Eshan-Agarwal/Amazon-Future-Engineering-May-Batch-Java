public class PracticeQues{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
//        bulbSwitcher(n);
//        prePostInc();
        int freq = digitFrequency(n, d);
        System.out.println(freq);

    }

    public static int digitFrequency(int n, int d) {

        int count = 0;
        while (n != 0) {

            int rem = n % 10;
            n = n / 10;
            if (rem == d) {
                count++;
            }
        }
        return count;
    }

    public static void prePostInc() {

        int a = 5;

        int postInc = 10 + a++;

        a = 5; // reset my a to orignal value

        int preInc = 10 + ++a;

        System.out.println("PostInc: " + postInc);
        System.out.println("preInc: " + preInc);

    }
    public static void bulbSwitcher(int n) {
        // Perfect sq have odd factors
        for (int i = 1; i*i <= n; i++) {
            System.out.println(i*i);
        }
    }
}
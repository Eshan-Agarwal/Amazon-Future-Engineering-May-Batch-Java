public class RemovePrime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);

        removePrimes(list);
    }

    public static void removePrimes(ArrayList<Integer> list) {

        if (list == null) return; // Edge case

        for (int val: list) {
            if (isPrime(val)) {
                list.remove(new Integer(val));
            }
        }
        System.out.println(val);

    }

    public static boolean isPrime(int val) {

        if (val == 2 || val == 3) return true;
        for (int i = 2; i*i <= val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}
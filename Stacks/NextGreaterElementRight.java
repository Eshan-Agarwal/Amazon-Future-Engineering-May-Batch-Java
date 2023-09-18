public class NextGreaterElementRight {

    public static void main(String[] args) {

    }

    public static void nextGreaterElementOnRight(int[] arr) {

        // to store idx
        Stack<Integer> st = new Stack<>();
        int[] nger = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int val = arr[i];
            while (! st.isEmpty() && arr[st.peek()] < val) {
                int idx = st.pop();
                nger[idx] = val;
            }
            st.push(i);
        }

        while(! st.isEmpty()) {
            nger[st.pop()] = -1;
        }

        for (int val: nger) {
            System.out.print(val + " ");
        }
        System.out.println();


    }

}
public class NextGreaterElementLeft {

    public static void main(String[] args) {

    }

    public static void nextGreaterElementOnLeft(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int[] ngel = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int val = arr[i];
            while(! st.isEmpty() && val > st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                ngel[i] = -1;
            } else {
                ngel[i] = st.peek();
            }
            st.push(val);
        }

        for (int val: ngel) {
            System.out.print(val + " ");
        }

    }

}
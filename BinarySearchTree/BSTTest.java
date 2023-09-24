import java.io.*;
import java.util.*;

public class BSTTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scn = new Scanner(System.in);
        Integer[] arr = new Integer[scn.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            String in = scn.next();
            if (in.equals("n")){
                arr[i] = null;
            } else {
                arr[i] = Integer.parseInt(in);
            }
        }

        BinaryTreeNode root = construct(arr);
//
//        SizeSumMaxMinFind s = new SizeSumMaxMinFind();
//
//        System.out.println("Sum: " + s.sum(root));
//
//        System.out.println("size: " + s.size(root));
//
//        System.out.println("max: " + s.max(root));
//
//        System.out.println("min: " + s.min(root));
//
//        System.out.println("Find: " + s.findNode(root, new BinaryTreeNode(70)));

//        RangeSumBST r = new RangeSumBST();
//
//        System.out.println(r.rangeSum(root, 7, 10));



    }

    public static class Edge {
        BinaryTreeNode node;
        int state;

        Edge() {

        }
        Edge(BinaryTreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static BinaryTreeNode construct(Integer[] arr) {
        Stack<Edge> st = new Stack<>();

        // root node
        BinaryTreeNode root = new BinaryTreeNode(arr[0]);

        Edge rootEdge = new Edge(root, 1);
        st.push(rootEdge);
        int idx = 1;

        while (!st.isEmpty()) {
            Edge nodeEdge = st.peek();

            if (nodeEdge.state == 1) { // left child
                nodeEdge.state++;
                if (arr[idx] != null) {
                    BinaryTreeNode leftChild = new BinaryTreeNode(arr[idx]);
                    nodeEdge.node.left = leftChild;

                    Edge leftNodeEdge = new Edge(leftChild, 1);
                    st.push(leftNodeEdge);
                }
                idx++;

            } else if (nodeEdge.state == 2) { // right child
                nodeEdge.state++;
                if (arr[idx] != null) {
                    BinaryTreeNode rightChild = new BinaryTreeNode(arr[idx]);
                    nodeEdge.node.right = rightChild;

                    Edge rightNodeEdge = new Edge(rightChild, 1);
                    st.push(rightNodeEdge);
                }
                idx++;
            } else if (nodeEdge.state == 3) {
                st.pop();
            }
        }

        return root;
    }



}
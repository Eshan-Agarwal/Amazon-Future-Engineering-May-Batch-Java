import java.io.*;
import java.util.*;

public class Solution {

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

        System.out.println(root.val + " " + root.left.val);

    }


    public static class BinaryTreeNode {

        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        // default Constructor
        BinaryTreeNode() {

        }

        BinaryTreeNode(int val) {
            this.val = val;
        }

        // Param Consctructor
        BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

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
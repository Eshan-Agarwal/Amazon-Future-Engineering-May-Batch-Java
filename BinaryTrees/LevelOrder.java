import java.util.*;
public class LevelOrder {

    // not recursive code --> iterative Code --> BFS (breadth first searhc)
    public static void solution(BinaryTreeNode root) {

        Queue<BinaryTreeNode> que = new ArrayDeque<>();
        que.add(root);

        while(que.size() > 0) {

            int numOfNodeInLevel = que.size();

            for (int i = 0; i < numOfNodeInLevel; i++) {
                BinaryTreeNode node = que.remove();
                System.out.print(node.val + " ");

                if (node.left != null) {
                    que.add(node.left);
                }
                if (node.right != null) {
                    que.add(node.right);
                }
            }
            System.out.println();
        }

    }

}
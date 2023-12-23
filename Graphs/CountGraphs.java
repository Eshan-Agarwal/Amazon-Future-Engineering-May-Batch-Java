public class CountGraphs {

    public static void main(String[] args) {

        int n = 4;

        int maxNumOfEdgesInNVerticeGraph = getMaxNumOfEdges(n);

        int totalNumberOfUndirectedGraph = getTotalUndirectedGraph(maxNumOfEdgesInNVerticeGraph);

        System.out.println(totalNumberOfUndirectedGraph);

    }

    // HW: output: x ^ y
    public static int power(int x, int y) {

    }

    public static int getTotalUndirectedGraph(int maxNumOfEdgesInNVerticeGraph) {
        return Math.pow(2, maxNumOfEdgesInNVerticeGraph);
    }

    public static int getMaxNumOfEdges(int n) {

        return n*(n - 1) / 2;

    }

}
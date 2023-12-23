public class AdjacencyMatrix {

    public static void main(String[] agrs) {

        int v = scn.nextInt();
        int e = scn.nextInt();


        int[][] adjcencyMat = new int[v][v];
        for (int i = 0; i < e; i++) {
            int src = scn.nextInt();
            int dest = scn.nextInt();

            adjcencyMat[src][dest] = 1;
            adjcencyMat[dest][src] = 1;
        }



    }

}
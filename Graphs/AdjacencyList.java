import java.util.Scanner;

public class AdjacencyList {

    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }


    public static void main(String[] agrs) {

        Scanner scn = new Scanner(System.in);

        String[] init = scn.nextLine().split(" ");

        int v = Integer.parseInt(init[0]);
        int e = Integer.parseInt(init[1]);

        // Graph

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {

            String[] parts = scn.nextLine().split(" ");

            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));

        }

        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " ");

            for (Edge edge: graph[i]) {
                System.out.print(edge.nbr + " ");
            }

            System.out.println();
        }

    }
}
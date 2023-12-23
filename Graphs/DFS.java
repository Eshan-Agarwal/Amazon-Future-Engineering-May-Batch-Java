import java.util.*;
public class DFS {

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


        }

        int srcVertex = 0;

        boolean[] visited = new boolean[v];
        List<Integer> ans = new ArrayList<>();
        dfs(srcVertex, graph, visited, ans);

        for (int val: ans) {
            System.out.print(val + " ");
        }
    }

    public static void dfs(int srcVertex, ArrayList<Edge>[] graph, boolean[] visited, List<Integer> ans) {

        ans.add(srcVertex);
        visited[srcVertex] = true;
        for (Edge e: graph[srcVertex]) {

            if (!visited[e.nbr]) {

                dfs(e.nbr, graph, visited, ans);
            }
        }

//         visited[srcVertex] = false;
    }

}
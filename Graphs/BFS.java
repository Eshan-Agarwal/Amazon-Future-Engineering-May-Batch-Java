import java.util.*;
public class BFS {

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

        List<Integer> ans = bfs(graph, 0);
        for (int val: ans) {
            System.out.print(val + " ");
        }

    }

    public static List<Integer> bfs(ArrayList<Edge>[] graph, int srcVertex) {

        Queue<Integer> q = new ArrayDeque();
        q.add(srcVertex);

        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];

        while(q.size() > 0) {

            int vertex = q.remove();
            visited[vertex] = true;
            ans.add(vertex);
            for (Edge e: graph[vertex]) {
                if (! visited[e.nbr]) {
                    q.add(e.nbr);
                }
            }
        }

        return ans;

    }
}
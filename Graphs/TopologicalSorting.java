public class TopologicalSorting {


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
            // graph[v2].add(new Edge(v2, v1));

        }

        int[] ans = kahnsAlgo(graph, v);
        
        if (ans[0] != -1) {
            for (int i = 0; i < v; i++) {
                System.out.print(ans[i] + " ");
            }
        }

    }

    public static int[] getIndegree(ArrayList<Edge>[] graph, int v) {
        int[] inDegree = new int[v];

        for (int i = 0; i < v; i++) {
            for (Edge e: graph[i]) {
                inDegree[e.nbr]++;
            }
        }

        return inDegree;
    }


    public static int[] kahnsAlgo(ArrayList<Edge>[] graph, int v) {

        // indegree arr

        int[] inDegree = getIndegree(graph, v);

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < v; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        int[] ans = new int[v];
        int idx = 0;

        while(! q.isEmpty()) {

            int rem = q.remove();
            ans[idx++] = rem;

            for (Edge e: graph[rem]) {
                inDegree[e.nbr]--;
                if (inDegree[e.nbr] == 0) {
                    q.add(e.nbr);
                }
            }
        }

        if (idx != v) {
            return new int[]{-1};
        }
        return ans;
    }


    public static void dfs(ArrayList<Edge>[] graph, int v) {

        boolean[] visited = new boolean[v];
        Stack<Integer> topologicalOrder = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (! visited[i]) {
                dfsUtil(i, graph, visited, topologicalOrder);
            }
        }

        while(! topologicalOrder.isEmpty()) {
            System.out.print(topologicalOrder.pop() + " ");
        }

    }

    public static void dfsUtil(int src, ArrayList<Edge>[] graph, boolean[] visited, Stack<Integer> topologicalOrder) {

        visited[src] = true;

        for (Edge e: graph[src]) {
            if (!visited[e.nbr]) {
                dfsUtil(e.nbr, graph, visited, topologicalOrder);
            }
        }

        topologicalOrder.add(src);
    }

}
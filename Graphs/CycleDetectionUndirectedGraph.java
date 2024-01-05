public class CycleDetectionUndirectedGraph {

    public static void main(String[] args) {

        boolean[] visited = new boolean[v];
        
        boolean isCycle = false;
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCycleDFS(graph, visited, i, -1)) {
                    isCycle = true;
                    break;
                }
            }
        }
        
        if (isCycle) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }


    public static boolean isCycleDFS(ArrayList<Edge>[] graph, boolean[] visited, int currVertex, int parent) {

        visited[currVertex] = true;

        for (Edge e: graph[currVertex]) {
            if (! visited[e.nbr]) {
                if (isCycleDFS(graph, visited, e.nbr, currVertex)) {
                    return true;
                }
            } else {
                if (e.nbr != parent) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean isCycleBFS(ArrayList<Edge>[] graph, boolean[] visited, int vertex) {

        Queue<Integer> q = new ArrayDeque<>();

        q.add(vertex);

        while (q.size() > 0) {
            vertex = q.remove();
            if (visited[vertex]) {
                return true;
            }
            visited[vertex] = true;
            for (Edge e: graph[vertex]) {
                if (!visited[e.nbr]) {
                    q.add(e.nbr);
                }
            }
        }

        return false;

    }


}
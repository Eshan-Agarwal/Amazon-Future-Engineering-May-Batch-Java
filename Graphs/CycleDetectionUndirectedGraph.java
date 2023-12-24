public class CycleDetectionUndirectedGraph {

    public static void main(String[] args) {

        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCycle(graph, visited, i)) {
                    System.out.println(true);
                    break;
                }
            }
        }

        System.out.println(false);

    }

    public static boolean isCycle(ArrayList<Edge>[] graph, boolean[] visited, int vertex) {

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
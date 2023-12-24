public class NumberOfProvince {

    public static void main(String[] args) {
        int[][] graph = new int[][];


        int numOfProvince = getNumberOfProvince(int[][] graph);
        System.out.println(numOfProvince);

    }

    public static int getNumberOfProvince(int[][] graph) {

        int v = graph.length;
        boolean[] visited = new boolean[v];

        int numberOfComponents = 0;

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                numberOfComponents++;
                visited[i] = true;
//                dfs(i, graph, visited); // mark all cities which is directly or indirectly connected to i
                bfs(i, graph, visited); // mark all cities which is directly or indirectly connected to i
            }
        }

        return numberOfComponents;

    }

    public static void bfs(int vertex, int[][] graph, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(vertex);

        while (q.size() > 0) {
            vertex = q.remove();
            visited[vertex] = true;
            for (int i = 0; i < graph.length; i++) {
                if (graph[vertex][i] == 1 && ! visited[i]) {
                    q.add(i);
                }
            }
        }
    }


    public static void dfs(int vertex, int[][] graph, boolean[] visited) {

        visited[vertex] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[vertex][i] == 1 && !visited[i]) {
                dfs(i, graph, visited);
            }
        }

    }


}
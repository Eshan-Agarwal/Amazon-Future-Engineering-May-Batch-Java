public class isCycleDirected {


    public static void main(String[] args) {


        

    }

    public static boolean sol(ArrayList<Edge>[] graph) {
        boolean visited[] = new boolean[v];
        boolean inStack[] = new boolean[v];

        // componenets

    
        for (int i = 0; i < v; i++) {
            if (isCycle(i, visited, inStack, graph)) {
                return true;
            }
        }

        return false;
    }


    public static boolean isCycle(int vtx, boolean[] visited, boolean[] inStack, ArrayList<Edge>[] graph) {
        
        // base cases
        if (inStack[vtx]) {
            return true;
        }
        if (visited[vtx]) {
            return false;
        }
        visited[vtx] = true;
        inStack[vtx] = true;
        for (Edge e: graph[vtx]) {
            if (isCycle(e.nbr, visited, inStack, graph)) {
                return true;
            }
        }
        inStack[vtx] = false;
        return false;
    }



}
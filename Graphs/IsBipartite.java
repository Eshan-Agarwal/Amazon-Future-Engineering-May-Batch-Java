public class IsBipartite {

    static class Pair {
        int vtx;
        int level;

        Pair(int vtx, int level) {
            this.vtx = vtx;
            this.level = level;
        }
    }

    public static boolean isBipartite (ArrayList<Edge>[] graph) {

        Map<Integer, Integer> visited = new HashMap<>();
        Queue<Pair>  q = new ArrayDeque<>();

        q.add(new Pair(0, 0));

        while(q.size() > 0) {

            Pair parent  = q.remove();

            if (visited.containsKey(parent.vtx)) { // cycle is present
                if (visited.get(parent.vtx) % 2 != parent.level % 2) {
                    return false;
                }

            } else {

                visited.put(parent.vtx, parent.level);
            }


            for (Edge e: graph[parent.vtx]) {
                if (!visited.containsKey(e.nbr)) {
                    q.add(new Pair(e.nbr, parent.level + 1));
                }
            }

        }

        return true;

    }

}
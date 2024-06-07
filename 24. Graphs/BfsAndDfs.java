import java.util.*;

public class BfsAndDfs {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge (int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph (ArrayList <Edge> graph []){
        for (int i = 0; i < graph.length; i++){
            graph [i] = new ArrayList<>();
        }

        graph [0].add(new Edge(0, 1, 1));
        graph [0].add(new Edge(0, 2, 1));


        graph [1].add(new Edge(1, 0, 1));
        graph [1].add(new Edge(1, 3, 1));
        
        graph [2].add(new Edge(2, 0, 1));
        graph [2].add(new Edge(2, 4, 1));

        graph [3].add(new Edge(3, 1, 1));
        graph [3].add(new Edge(3, 4, 1));
        graph [3].add(new Edge(3, 5, 1));

        graph [4].add(new Edge(4, 2, 1));
        graph [4].add(new Edge(4, 3, 1));
        graph [4].add(new Edge(4, 5, 1));

        graph [5].add(new Edge(5, 3, 1));
        graph [5].add(new Edge(5, 4, 1));
        graph [5].add(new Edge(5, 6, 1));

        graph [5].add(new Edge(6, 5, 1));
    }

    // bfs
    public static void bfs (ArrayList <Edge> [] graph){
        Queue <Integer> q = new LinkedList<>();
        boolean vis [] = new boolean[graph.length];
        q.add(0);

        while (! q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis [curr] = true;
                for (int i = 0; i < graph [curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }            
        }
    }

    //dfs
    public static void dfs (ArrayList <Edge> [] graph, int curr, boolean vist []){
        System.out.print(curr + " ");
        vist [curr] = true;

        for (int i = 0; i < graph [curr].size(); i++){
            Edge e = graph [curr].get(i);
            if (!vist [e.dest]) {
                dfs(graph, e.dest, vist);
            }
        }
    }
    
    // has Path ?
    public static boolean hasPath (ArrayList <Edge> [] graph, int src, int dest, boolean visit []){
        if (src == dest) {
            return true;
        }
        visit [src] = true;

        for (int i = 0; i < graph [src].size(); i++){
            Edge e = graph [src].get(i);
            if (! visit [e.dest] && hasPath(graph, e.dest, dest, visit)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList <Edge> graph [] = new ArrayList[v];

        createGraph(graph);

        bfs(graph); //0 1 2 3 4 5 6
        System.out.println();
        dfs(graph, 0, new boolean[v]); //0 1 3 4 2 5 6
        System.out.println();

        System.out.println(hasPath(graph, 0, 7, new boolean[v])); //true


        
    }
}

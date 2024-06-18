import java.util.*;
public class KruskalsAlgorithm {
    static class Edge implements Comparable <Edge> {
        int src;
        int dest;
        int wt;

        public Edge (int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        @Override
        public int compareTo (Edge e2){
            return this.wt - e2.wt;
        }
    }

    static void createGraph (ArrayList <Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4; //vertices
    static int par [] = new int[n];
    static int rank [] = new int[n];

    public static void init (){
        for (int i = 0; i < n; i++){
            par [i] = i;
        }
    }
    public static int Find (int x){
        if (par [x] == x) {
            return x;
        }
        return par [x] = Find(par [x]);
    }

    public static void Union (int a, int b){
        int parA = Find(a);
        int parB = Find(b);

        if (rank [parA] == rank [parB]) {
            par [parB] = parA;
            rank [parA]++;
        }else if (rank [parA] < rank [parB]) {
            par [parA] = parB;
        }else {
            par [parB] = parA;
        }
    }

    public static void kruskalsMST (ArrayList <Edge> edges , int v){
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < v-1; i++){
            Edge e = edges.get(i);
            //src,dest,wt

            int parA = Find(e.src);
            int parB = Find(e.dest);
            if (parA != parB) {
                Union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList <Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalsMST(edges, v);
        
    }
}

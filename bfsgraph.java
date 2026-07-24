import java.util.*;

class Main {
    List<Integer> adj[];
    int v;

    public Main(int v) {
        this.v = v;
        adj = (LinkedList<Integer>[]) new LinkedList[v];   // Changed only this line

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true; // marking as visited
        queue.add(s);      // till the end except visited nodes

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();

                if (!visited[n]) {
                    visited[n] = true; // visited
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Main g = new Main(n);

        int a, b;

        while (n > 0) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == -1 || b == -1)
                break;

            g.addEdge(a, b);
            n--;
        }

        if (n == 0) {
            System.out.println("Graph doesn't exist");
        } else {
            System.out.print("BFS : ");
            g.BFS(0);
        }

        sc.close();
    }
}
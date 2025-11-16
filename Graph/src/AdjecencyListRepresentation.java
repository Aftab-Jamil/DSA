import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AdjecencyListRepresentation {
    LinkedList<Integer>[] lists;
    int vertices,edges;

    public AdjecencyListRepresentation(int nodes){
        lists=new LinkedList[nodes];
        vertices=nodes;
        edges=0;
        for(int i=0;i<nodes;i++){
            lists[i]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        lists[u].add(v);
        lists[v].add(u);
        edges++;
    }
    public void bfs(int v){
        boolean [] visited=new boolean[vertices];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(v);
        visited[v]=true;
        while(!queue.isEmpty()){
            int ele=queue.poll();
            System.out.print(ele+"\t");
            for(int i:lists[ele]){
                if(!visited[i]) {
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
    }
//    public void dfs(int v){
//        boolean [] visited=new boolean[vertices];
//        Stack<Integer> stack=new Stack<>();
//        stack.add(v);
//        visited[v]=true;
//        while(!stack.isEmpty()){
//            int ele=stack.pop();
//            System.out.print(ele+"\t");
//            for(int a:lists[ele]){
//                if(!visited[a]){
//                    visited[a]=true;
//                    stack.add(a);
//                }
//            }
//        }
//    }
    public void dfs(){
        boolean [] visited=new boolean[vertices];
        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                dfs(i,visited);
            }
        }

    }
    private void dfs(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v+"\t");
        for(int w:lists[v]){
            if(!visited[w]){
                dfs(w,visited);
            }
        }
    }
    // Number of Connected component in a undirected graph and to know which pair is connected or not
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Vertices: "+vertices+"\tEdges: "+edges+"\n");
        for(int i=0;i<vertices;i++){
            sb.append(i+": ");
            for(int x:lists[i]){
                sb.append(x+" ");
            }
           sb.append("\n");
        }
    return sb.toString();
    }
    public static void main(String[] args) {
        AdjecencyListRepresentation graph=new AdjecencyListRepresentation(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        System.out.println(graph);
        graph.bfs(1);
        System.out.println();
//        graph.dfs(0);
    }
}

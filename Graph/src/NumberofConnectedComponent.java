import java.awt.*;
import java.util.LinkedList;
/*
Problem Statement: You have given Undirected Graph and you have to find the number of Connected Component
and write a function to know either a pair of node is connected or not
for eg : 0------1       3------4        5------6
                |                              |
                |                              |
                2                       8------7
  so as per the given example there is 3 connected Component and 0,1 pair which connected together while
  2,3 are not and so on
 */

public class NumberofConnectedComponent {
    // These Below Code is to create graph make connection between nodes
    LinkedList<Integer>[] lists;
    int vertices,edges;
    int componentId [];// part of solution

    public NumberofConnectedComponent(int nodes){
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
    // solution of given problem: for that we will take a support of dfs using recurrsion
    public int getConnectedComponent(){
         boolean [] visited=new boolean[vertices];
         componentId=new int[vertices];
         int count=0;
         for(int i=0;i<vertices;i++){
             if(!visited[i]){
                 getConnectedComponent(i,visited,count);
                 count++;
             }
         }
         return count;
    }
    public void getConnectedComponent(int v,boolean []visited,int count){
        visited[v]=true;
        componentId[v]=count;
        for(int w:lists[v]){
            if(!visited[w]){
                getConnectedComponent(w,visited,count);
            }
        }

    }
    public boolean isConnected(int u,int v){
        getConnectedComponent();
        return componentId[u]==componentId[v];
    }

    public static void main(String[] args) {
        NumberofConnectedComponent graph=new NumberofConnectedComponent(9);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(3,4);
        graph.addEdge(5,6);
        graph.addEdge(6,7);
        graph.addEdge(7,8);
        System.out.println(graph.getConnectedComponent());
        System.out.println(graph.isConnected(5,1));

    }
}

public class AdjecencyMatrixRepresentation {
    int [][] mat;
    int vertices,edges;
    public AdjecencyMatrixRepresentation(int nodes){
        mat=new int[nodes][nodes];
        vertices=nodes;
        edges=0;
    }
    public void addEdge(int v,int u){
        mat[v][u]=1;
        mat[u][v]=1;
        edges++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Vertices: "+vertices+"\tEdges: "+edges+"\n");
        for(int i=0;i<mat.length;i++){
            sb.append(i+": ");
            for(int w:mat[i]){
                sb.append(w+"\t");
            }
            sb.append("\n");

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        AdjecencyMatrixRepresentation graph=new AdjecencyMatrixRepresentation(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(3,2);
        graph.addEdge(3,1);
        System.out.println(graph);
    }
}

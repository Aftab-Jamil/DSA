public class NumbersOfIslands {
    public static int nosOfIsland(int [][] mat){
        int row=mat.length;
        int col=mat[0].length;
        boolean [][] visited=new boolean[row][col];
        int count=0;
        int [][] direction={{-1,0}, {0, -1},{1,0},{0,1}};
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1&&!visited[i][j]) {
                    count++;
                    exploreConectedNode(i, j, mat, visited, direction);
                }else{
                    visited[i][j]=true;
                }
            }
        }
        return count;
    }
    public static void exploreConectedNode(int pr,int pc,int[][] mat,boolean[][] visited,int[][] direction){//pr=present row,pc=present Column
        visited[pr][pc]=true;
        for(int i=0;i<direction.length;i++){
            int nighbourRow=pr+direction[i][0];
            int nighbourCol=pc+direction[i][1];
            if(nighbourRow<mat.length && nighbourRow>=0
                    && nighbourCol<mat[0].length && nighbourCol>=0
                    && mat[nighbourRow][nighbourCol]==1 && !visited[nighbourRow][nighbourCol]){
                exploreConectedNode(nighbourRow,nighbourCol,mat,visited,direction);
            }
        }
    }
    public static void main(String[] args) {
        int [][] mat={
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}
        };
        System.out.println(nosOfIsland(mat));
    }
}

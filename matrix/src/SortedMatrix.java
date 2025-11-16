public class SortedMatrix {
    public static void search(int [][] mat, int value){
        int i=0,j=mat.length-1;
        while (i < mat.length && j >= 0) {
            if(mat[i][j]==value){
                System.out.println("Found  at index "+i+","+j);
                return;
            }
            if(mat[i][j]>value){
                j--;
            }else {
                i++;
            }
        }
        System.out.println("not found");
    }
    public static void printSpiralOrder(int [][] mat){
        int row=mat.length;
        int col=mat[0].length;
        int i,j=0,k=0;
        while (j < row && k < col) {
            for(i=k;i<col;i++){
                System.out.println(mat[j][i]);
            }
            j++;
            for(i=j;i<row;i++){
                System.out.println(mat[i][col-1]);
            }
            col--;
            if(j<row) {
                for (i = col - 1; i >= k; i--) {
                    System.out.println(mat[row - 1][i]);
                }
                row--;
            }
            if(k<col) {
                for (i = row - 1; i >= j; i--) {
                    System.out.println(mat[i][k]);
                }
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int [][] mat={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };
        printSpiralOrder(mat);
    }
}

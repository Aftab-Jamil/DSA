//Dutch National Flag Problem:we have given an array of having only 3 distinct element 0,1,2 and we have to sort it in Log(N) time complexity
public class DutchNationalFlag {
    public static void sortDNF(int [] arr){
        int i=0,j=0,k=arr.length-1,temp;
        while(i<=k){
            if(arr[i]==0){
                arr[i]=arr[j];
                arr[j]=0;
                j++;
                i++;
            } else if (arr[i]==1) {
                i++;
            }else{
                arr[i]=arr[k];
                arr[k]=2;
                k--;
            }
        }
    }
    public static void print(int [] arr){
        for (int i: arr){
            System.out.print(i+"---->>>>");
        }
    }
    public static void main(String[] args) {
        int [] arr={2,0,2,2,0,1,1,0,2,1,0};
        sortDNF(arr);
        print(arr);


    }
}

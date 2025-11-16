import java.lang.reflect.Array;
import java.util.ArrayList;

class Solution {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int [][] res=new int[1][2];
            res[0]=newInterval;
            return res;
        }
        ArrayList<int []> lists=new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][0]<=newInterval[0]){
            lists.add(intervals[i]);
            i++;
        }
        lists.add(newInterval);
        while(i<intervals.length){
            lists.add(intervals[i]);
            i++;
        }
        int j=0,k=1;
        ArrayList<int []> res=new ArrayList<>();
        int[] mergedInterval=lists.get(0);
        while(k<lists.size()){
            if(lists.get(k)[0]<=mergedInterval[1]){
                mergedInterval[1]=Math.max(mergedInterval[1],lists.get(k)[1]);
                k++;
            }else{
                res.add(mergedInterval);
                j=k;
                k++;
                mergedInterval=lists.get(j);
            }
        }
        res.add(mergedInterval);
        int [][] result=new int[res.size()][2];
        for(int x=0;x<res.size();x++){
            result[x]=res.get(x);
        }
        return result;

    }
    public static void print(int [][] array){
        for(int [] a:array){
            System.out.println(a[0]+","+a[1]);
        }
    }

    public static void main(String[] args) {
        int [][] intervals = {};
        int [] newInterval={4,8};
        int [][] result=insert(intervals,newInterval);
        print(result);
    }
}
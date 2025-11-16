package revisiondsa;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Revision {
    //methods for merge sort
//    public static void mergeSort(int [] arr, int lower, int upper){
//        if(lower<upper){
//            int mid=(lower+upper)/2;
//            mergeSort(arr,lower,mid);
//            mergeSort(arr,mid+1,upper);
//            merger(arr,lower,mid+1,upper);
//        }
//    }
//
//    public static void merger(int [] arr, int low , int mid , int upper){
//        int merge[] =new  int[arr.length];
//        int start=low;
//        int ptr1=low;
//        int ptr2=mid;
//        while(ptr1<mid && ptr2<=upper){
//            if(arr[ptr1]<arr[ptr2]){
//                merge[start]=arr[ptr1];
//                ptr1++;
//            }
//            else{
//                merge[start]=arr[ptr2];
//                ptr2++;
//            }
//            start++;
//        }
//        while(ptr1<mid){
//            merge[start]=arr[ptr1];
//            ptr1++;
//            start++;
//        }
//        while(ptr2<=upper){
//            merge[start]=arr[ptr2];
//            ptr2++;
//            start++;
//        }
//
//        // copied element
//        for (int i=low;i<=upper;i++){
//            arr[i]=merge[i];
//        }
//
//    }

    //methods for  quick sort
//    public static int  partition(int [] arr,int lower,int upper){
//        int i=lower+1;
//        int j=upper;
//        int temp;
//        while(i<=j){
//            while(i<=upper && arr[i]<arr[lower]){
//                i++;
//            }
//            while(j>lower && arr[j]>=arr[lower]){
//                j--;
//            }
//            if(i<j){
//                temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//        }
//
//            temp=arr[lower];
//            arr[lower]=arr[j];
//            arr[j]=temp;
//        return j;
//
//    }
//    public static void quickSort(int [] arr, int lower , int upper){
//        if(lower<upper){
//            int partitionIndex=partition(arr,lower,upper);
//            quickSort(arr,lower,partitionIndex-1);
//            quickSort(arr,partitionIndex+1,upper);
//        }
//    }


    // methods for merge intervals
//    public static void mergeIntervals(int [][] intervals){
//        ArrayList<int []> arrayList=new ArrayList<>();
//        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
//        int i=0;
//        int j=1;
//        int [] mergedInterval=intervals[0];
//        while(j<intervals.length){
//            if(intervals[i][1]>=intervals[j][0]){
//                mergedInterval[1]=Math.max(intervals[j][1],mergedInterval[1]);
//            }else{
//                arrayList.add(mergedInterval);
//                mergedInterval=intervals[j];
//                i=j;
//            }
//            j++;
//        }
//        arrayList.add(mergedInterval);
//        for(int x=0;x<arrayList.size();x++){
//            System.out.println(Arrays.toString(arrayList.get(x)));
//        }
//
//    }



    public static void main(String[] args) {



        // find second largest element
//        int [] arr={0,1,0,4,12};
//        int first_max=-1;
//        int second_max=-1;
//        for(int i=0 ; i<arr.length;i++){
//            if(arr[i]>first_max) {
//                second_max = first_max;
//                first_max=arr[i];
//            }
//            if(arr[i]<first_max && arr[i]>second_max){
//                second_max=arr[i];
//            }
//        }
//        System.out.println(second_max);

        // move zeroes to the end
//
//        int arr[] ={0,0,1};
//        int first_ptr=0;
//        int second_ptr=1;
//        while(second_ptr<arr.length){
//            if(arr[first_ptr]==0 && arr[second_ptr]!=0){
//                arr[first_ptr]=arr[second_ptr];
//                arr[second_ptr]=0;
//            }
//            if(arr[first_ptr]!=0){
//                first_ptr++;
//            }
//            second_ptr++;
//        }
//        System.out.println(Arrays.toString(arr));

        // find the missing number

//        int [] arr={2,4,1,8,6,3,7};
//        int n=arr.length;
//        int sum=(n+1)*(n+2)/2;
//        for(int i=0;i<n;i++){
//            sum-=arr[i];
//        }
//        System.out.println(sum);

        // next greater element
//        int [] arr={4,7,3,4,8,1};
//        int [] output=new int[arr.length];
//        int optr=arr.length-1;
//        Stack<Integer> stack=new Stack<>();
//        for(int i=arr.length-1;i>=0;i--){
//            while (!stack.isEmpty()){
//                if(stack.peek()<arr[i]) stack.pop();
//                else break;
//            }
//            if(stack.isEmpty()) output[optr]=-1;
//            else output[optr]=stack.peek();
//            optr--;
//            stack.push(arr[i]);
//
//        }
//
//        System.out.println(Arrays.toString(output));

        // generate 1 to n binary number

//        Queue<String> queue= new LinkedList<>();
//        int n=50;
//        if(n<=0) return;
//        queue.add("1");
//        while(n!=0){
//          String t=  queue.remove();
//            System.out.println(t);
//            queue.add(t+"0");
//            queue.add(t+"1");
//            n--;
//        }

        // search element in sorted matrix row and column wise both

//        int [][] mat ={
//                {10,20,30,40},
//                {15,25,35,45},
//                {27,29,37,48},
//                {32,33,39,51}
//
//        };
//        int searchElement=37;
//        int row=0,col=mat[0].length-1;
//        while(row<mat.length && col>=0){
//            if(mat[row][col]==searchElement){
//                System.out.println("Element found at index "+row+" , "+col);
//                break;
//            }
//            else if(mat[row][col]<searchElement) row++;
//            else col--;
//        }
//        if(row>=mat.length || col<0)
//            System.out.println("Element not found");


        // Binary Search

//        int [] arr={10,15,17,19,20,30,40,45,48};
//        int low=0;
//        int high=arr.length-1;
//        int mid , searchElement=48;
//        while(low<=high){
//            mid=low+(high-low)/2;
//            if(arr[mid]==searchElement){
//                System.out.println("Element Found at index "+ mid);
//                break;
//            }
//            else if (arr[mid]>searchElement) high=mid-1;
//            else low =mid+1;
//        }
//        if(low>high) System.out.println("Element not found");


        // Search Element in Sorted Array and if not available suggest the place to insert

//        int [] arr={10,15,17,19,20,30,40,45,48};
//        int low=0;
//        int high=arr.length-1;
//        int mid , searchElement=0;
//        while(low<=high){
//            mid=low+(high-low)/2;
//            if(arr[mid]==searchElement){
//                System.out.println("Element Found at index "+ mid);
//                break;
//            }
//            else if (arr[mid]>searchElement) high=mid-1;
//            else low =mid+1;
//        }
//        if(low>high) System.out.println("Element not found and insert position will be "+ low);

        // Bubble sort
//        int [] arr={1,4,2,5,7,4,8,9,33};
//        int temp;
//        for(int i=0;i<arr.length-1;i++){
//            for (int j=0;j<arr.length-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));

        // insertion sort
//        int [] arr={1,4,2,5,7,4,8,9,33};
//        int temp;
//        int j;
//        for(int i=1;i<arr.length;i++){
//            temp=arr[i];
//            j=i-1;
//            while(j>=0 && arr[j]>temp){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // selection sort
//        int [] arr={1,4,2,5,7,4,8,9,33};
//        int smallesElementIndex,temp;
//        for(int i=0;i<arr.length-1;i++){
//            smallesElementIndex=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[smallesElementIndex]){
//                    smallesElementIndex=j;
//                }
//            }
//            if(smallesElementIndex!=i){
//                temp=arr[i];
//                arr[i]=arr[smallesElementIndex];
//                arr[smallesElementIndex]=temp;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));


        // merge sort
//        int [] arr={5, 3, 8, 4, 2, 7, 1, 6};
//        mergeSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

        // dutch national flag problem

//        int [] arr= {2,0,2,2,0,1,1,0,2,1,0};
//        int i=0,j=arr.length-1;
//        int k=0;
//        while(k<=j){
//            if(arr[k]==0){
//                arr[k]=arr[i];
//                arr[i]=0;
//                i++;
//                k++;
//
//            }
//           if(arr[k]==2){
//                arr[k]=arr[j];
//                arr[j]=2;
//                j--;
//            }
//           if(arr[k]==1) k++;
//        }
//        System.out.println(Arrays.toString(arr));

        // quick sort
//        int  [] arr={5, 3, 8, 4, 2, 7, 1, 6};
//        quickSort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

        // square of sorted array
//        int [] arr={-4,-1,0,3,10};
//        int [] output=new int[arr.length];
//        int i=0,j=arr.length-1;
//        int o=arr.length-1;
//        while(i<=j){
//            if(Math.abs(arr[i])>Math.abs(arr[j])){
//                output[o]=arr[i]*arr[i];
//                i++;
//            }else {
//                output[o]=arr[j]*arr[j];
//                j--;
//            }
//            o--;
//        }
//        System.out.println(Arrays.toString(output));

        // merge intervals

//        int[][] intervals = { {1, 3}, {2, 4}, {5, 7}, {6, 8} };
//        mergeIntervals(intervals);

        // Maximum sub-array

//        int [] arr= {-2, 0 ,-1 };
//        int sum=arr[0];
//        int currSum=arr[0];
//        for(int i=1;i<arr.length;i++){
//            currSum=Math.max(arr[i],currSum+arr[i]);
//            sum=Math.max(currSum,sum);
//        }
//        System.out.println(sum);

        // two sum problem

//        int [] arr= {2,7,11,15};
//        int target=9, diff;
//        HashMap<Integer, Integer> map=new HashMap<>();
//        int [] result=new int [2];
//        for(int i=0 ; i < arr.length; i++ ){
//            diff=target-arr[i];
//            if(map.containsKey(diff)){
//                result[0]=map.get(diff);
//                result[1]=i;
//                break;
//            }else {
//                map.put(arr[i],i);
//            }
//
//        }
//        System.out.println(Arrays.toString(result));

        // Three sum
//        int [] arr={2,4,3,7,1,0};
//        int target = 6;
//        Arrays.sort(arr);
//        int j,k;
//        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            if(i>0 && arr[i]==arr[i-1]) continue;
//            j=i+1;
//            k=arr.length-1;
//            while(j<k){
//                if(arr[i]+arr[j]+arr[k]==target){
//                    result.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k])));
//                    while(j<arr.length && arr[j]==arr[j+1]) j++;
//                    while(k>=0 && arr[k]==arr[k-1]) k--;
//                    j++;
//                    k--;
//                }
//                else if(arr[i]+arr[j]+arr[k]<target){
//                    j++;
//                }else{
//                    k--;
//                }
//            }
//        }
//        System.out.println(result);


        //  product of an array except itself

//        int [] arr= {-1,1,0,-3,3};
//        int [] output=new int[arr.length];
//        output[0]=1;
//        int multi=1;
//        for(int i=1; i<arr.length; i++){
//            multi*=arr[i-1];
//            output[i]=multi;
//        }
//        multi=1;
//        for(int i = arr.length-2;i>=0;i--){
//            multi*=arr[i+1];
//            output[i]=output[i]*multi;
//        }
//        System.out.println(Arrays.toString(output));


        // sliding window problem
//
//        int [] arr={100,200,300,400};
//        int windowSize =3;
//        Deque<Integer> deque=new ArrayDeque<>();
//        int i=0;
//        int j=0;
//        int [] maxi=new int[arr.length-windowSize+1];
//        for(;i<windowSize;i++){
//            while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i])
//                deque.removeLast();
//            deque.addLast(i);
//        }
//        for(;i<arr.length;i++){
//            maxi[j]=arr[deque.peekFirst()];
//            j++;
//            while(!deque.isEmpty() && deque.peekFirst()<=i-windowSize)
//                deque.removeFirst();
//            while(!deque.isEmpty() && arr[deque.peekLast()]<=arr[i])
//                deque.removeLast();
//            deque.addLast(i);
//        }
//        maxi[j]=arr[deque.peekFirst()];
//        System.out.println(Arrays.toString(maxi));

        // longest substring without repeatation

//        String s="pwwkew";
//        Set<Character> set=new HashSet<>();
//        Queue<Character> queue=new LinkedList<>();
//        char x,temp;
//        int maxSum=0;
//        for(int i=0;i<s.length();i++){
//            x=s.charAt(i);
//                while(set.contains(x)){
//                    temp=queue.remove();
//                    set.remove(temp);
//                }
//
//                queue.add(x);
//                set.add(x);
//                maxSum=Math.max(queue.size(),maxSum);
//            }
//
//        System.out.println(maxSum);

        // lower bound
//
//        int [] arr= {2, 3, 7, 10, 11, 11, 25};
//        int target=9;
//        int output=arr.length-1;
//        int low=0;
//        int high=arr.length-1;
//        int mid;
//        while (low<=high){
//            mid= low+(high-low)/2;
//            if(arr[mid]>=target){
//                output=mid;
//                high=mid-1;
//            }else {
//                low=mid+1;
//            }
//        }
//        System.out.println(output);

        //peak element
//
//        int [] arr={1,2,1,3,5,6,4};
//        int output;
//        int low=0, high=arr.length-1;
//        int mid;
//        while(low<=high){
//            mid=low+(high-low)/2;
//            if((mid==arr.length-1 || arr[mid]>arr[mid+1]) && (mid==0 ||  arr[mid]>arr[mid-1])){
//                System.out.println(mid);
//                break;
//            }
//            else if(arr[mid+1]>arr[mid]) low=mid+1;
//            else high=mid-1;
//
//        }

        // finding duplicates using position at num-1;
//         int [] arr ={1,3,4,2,2};
//         int i=0,temp;
//         while (i<arr.length){
//             if(arr[i]==i+1 || arr[arr[i]-1]==arr[i]) i++;
//             else{
//                 temp=arr[arr[i]-1];
//                 arr[arr[i]-1]=arr[i];
//                 arr[i]=temp;
//             }
//         }
//         for(int j=0;j<arr.length;j++){
//             if(arr[j]!=j+1) {
//                 System.out.println(arr[j]);
//             }
//         }


        //1700. Number of Students Unable to Eat Lunch

//        int [] sandwitchs={1,0,0,0,1,1};
//        int [] students ={1,1,1,0,0,1};
//        int count []=new int[2];
//        for(int s:students){
//            count[s]++;
//        }
//        for(int sandwitch:sandwitchs){
//            if(count[sandwitch]==0) break;
//            count[sandwitch]--;
//        }
//        System.out.println(count[0]+count[1]);


    }
}

import java.util.NoSuchElementException;

// max heap tree
public class HeapTree{
    private int [] heapArray;
    private int length;
    private int fullLength;

    public HeapTree(int size){
        heapArray=new int[size+1];
        length=1; //just like pointer to next unfill space in array
        fullLength=size+1; // total size of an array except 0 index
    }
    public boolean isFull(){
        return length==fullLength;
    }
//    public void heapify(int index){
//        int child=index;
//        while(child>=2){
//            int parent=child/2;
//            if(heapArray[parent]<heapArray[child]){
//                int temp=heapArray[parent];
//                heapArray[parent]=heapArray[child];
//                heapArray[child]=temp;
//                child=parent;
//            }else return;
//        }
//
//    }
    public void insertHeap(int data){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("heap array is already full so can not be inserted!!!");
        }
        heapArray[length]=data;
        int child=length;
        while(child>=2){
            int parent=child/2;
            if(heapArray[parent]<data){
                int temp=heapArray[parent];
                heapArray[parent]= heapArray[child];
                heapArray[child]=temp;
                child=parent;
            }else break;
        }

        length++;
    }
    public void maxHeapify(int index){
        int lc=index*2;
        int rc=index*2+1;
        int lar=index;
        if(lc<length && heapArray[lc]> heapArray[lar])
            lar=lc;
        if (rc<length && heapArray[rc]>heapArray[lar])
            lar=rc;
        if(lar!=index){
            int temp=heapArray[index];
            heapArray[index]=heapArray[lar];
            heapArray[lar]=temp;
            maxHeapify(lar);
        }

    }
    public int delete(){
        if (length == 1) {
            throw new NoSuchElementException("sorry heap is empty so can't be deleted ");
        }
        int result=heapArray[1];
        heapArray[1]=heapArray[length-1];
        length--;
        maxHeapify(1);
        return result;

    }

    public void printHeap(){
        if(length==1){
            return;
        }
        for(int i=1;i<length;i++){
            System.out.print(heapArray[i]+"--->>>");
        }
        System.out.println();
    }
    public void heapSort(int [] arr){
        if(arr.length==0)
            return;
        // creating heap tree
        HeapTree heapTree=new HeapTree(arr.length);
        for(int i=0;i<arr.length;i++){
            heapTree.insertHeap(arr[i]);
        }
        int len=heapTree.length-1;
        for(int i=0;i< len;i++){
            arr[i]= heapTree.delete();
        }

    }

    public static void main(String[] args) {
        HeapTree heapTree=new HeapTree(10);
        heapTree.printHeap();
        heapTree.insertHeap(25);
        heapTree.insertHeap(45);
        heapTree.insertHeap(35);
        heapTree.insertHeap(15);
        heapTree.insertHeap(95);
        heapTree.insertHeap(85);
        heapTree.insertHeap(75);
        heapTree.insertHeap(55);
        heapTree.insertHeap(75);
        heapTree.printHeap();
        for(int i=1;i<10;i++){
            System.out.println(heapTree.delete());
        }
        System.out.println("cheaking heapsort");
        int [] arr={3,2,5,10000,77,5,8,90};
        heapTree.heapSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"->");
        }


    }


}

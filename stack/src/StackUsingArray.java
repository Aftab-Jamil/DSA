public class StackUsingArray {
    int [] arr;
    int length;
    int top;
    public StackUsingArray(int capacity){
        this.arr=new int[capacity];
        this.length=0;
        this.top=-1;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public boolean isFull(){
        return arr.length==length;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("sorry stack is already full");
            return;
        }
        arr[top+1]=data;
        top++;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("sorry stack is already empty");
            return -1;
        }
        int result=arr[top];
        top--;
        length--;
        return result;
    }
    public void printStack(){
        int temp=top;
        if(isEmpty())
            return;
        while(temp!=0){
            System.out.print(arr[temp]+"----->>>>");
            temp--;
        }
        System.out.println(arr[temp]);
    }
    public static void main(String[] args) {
        StackUsingArray stack=new StackUsingArray(5);
        stack.printStack();

        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(9);
        stack.push(99);
        System.out.println(stack.pop());
        stack.push(0);
        stack.printStack();

    }
}

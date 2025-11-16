public class StackUsingLinkedList {

    private Node top;
    private int length;

    public static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public StackUsingLinkedList(){
        this.top=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int getLength(){
        return length;
    }
    public void push(int data){
        Node newNode=new Node(data);
        newNode.next = top;
        top=newNode;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("sorry Stack is already empty");
            return -1;
        }
        Node temp=top;
        top=top.next;
        temp.next=null;
        length--;
        return temp.data;
    }
    public void printStack(){
        Node temp=top;
        if(temp==null)
            return;
        while(temp.next!=null){
            System.out.print(temp.data+"---->>>>");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.printStack();
        stack.push(1);
        stack.push(3);
        stack.push(20);
        System.out.println("length: "+stack.getLength());
        System.out.println(stack.pop());
        stack.printStack();
        System.out.println("length: "+stack.getLength());

    }
}

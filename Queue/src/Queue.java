public class Queue {

    Node front;
    Node rear;
    int length;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public Queue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            front=newNode;
        }else{
            rear.next=newNode;
        }
        rear=newNode;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("sorry queue is already empty");
            return -1;
        }
        int result=front.data;
        if(front==rear){
            rear=null;
        }
        front=front.next;
        length--;
        return result;
    }
    public void printQueue(){
        Node temp=front;
        if(isEmpty()){
            return;
        }
        while(temp!=rear)
        {
            System.out.print(temp.data+"----->>>>");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Queue queue=new Queue();


        queue.enqueue(1);
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(10);
        System.out.println("length: "+queue.getLength());
        queue.printQueue();
        System.out.println(queue.dequeue());
//        System.out.println(queue.getLength());
        queue.printQueue();


    }
}

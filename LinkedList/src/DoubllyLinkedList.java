public class DoubllyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    public class Node{
        private int data;
        private Node pre;
        private Node next;
        public Node(int data)
        {
            this.data=data;
            this.pre=null;
            this.next=null;
        }
    }
    public DoubllyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void displayForward(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
    }
    public void displayBackword(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.pre;
        }
    }
    public void insertFirst(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            tail=newNode;
        }
        else{
            head.pre=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }
    public void insertLast(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
        }else{
            tail.next=newNode;
        }
        newNode.pre=tail;
        tail=newNode;
        length++;
    }
    public void deleteFirst(){
        if(isEmpty()){
            return;
        }
        if(getLength()==1){
            head=null;
            tail=null;
            length--;
            return;
        }
        head=head.next;
        head.pre.next=null;
        head.pre=null;
        length--;
    }
    public void deleteLast(){
        if(isEmpty()){
            return;
        }
        if(getLength()==1){
            head=tail=null;
            length--;
            return;
        }
        tail=tail.pre;
        tail.next.pre=null;
        tail.next=null;
    }


    public static void main(String[] args) {
        DoubllyLinkedList doubllyLinkedList=new DoubllyLinkedList();
//        doubllyLinkedList.insertFirst(1);
//        doubllyLinkedList.insertFirst(10);
//        doubllyLinkedList.insertFirst(12);
//        doubllyLinkedList.insertFirst(13);
//        doubllyLinkedList.insertLast(222);
//        doubllyLinkedList.insertLast(343);
        doubllyLinkedList.insertLast(444);
        doubllyLinkedList.insertFirst(1);
        doubllyLinkedList.displayForward();
        System.out.println();
//        doubllyLinkedList.deleteFirst();
//        doubllyLinkedList.displayForward();
//        System.out.println();
        doubllyLinkedList.deleteLast();
        doubllyLinkedList.displayForward();



    }
}

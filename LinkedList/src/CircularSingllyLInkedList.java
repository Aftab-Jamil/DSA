import java.util.NoSuchElementException;

public class CircularSingllyLInkedList {
    private Node last;
    private int length;

    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public CircularSingllyLInkedList(){
        this.last=null;
        this.length=0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void display(){
       if(last==null){
           return;
       }
       Node first=last.next;
       while(first!=last){
           System.out.print(first.data+"---->>>");
           first=first.next;
       }
        System.out.println(first.data);
    }
    public void insertFirst(int data){
        Node newNode=new Node(data);
        if(last==null){
            last=newNode;
        }
        else {
            newNode.next=last.next;
        }
        last.next=newNode;
        length++;
    }
    public void insertLast(int data){
        Node newNode=new Node(data);
        if(last==null){
            last=newNode;
            last.next=newNode;
        }else {
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        length++;
    }
    public Node deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("sorry cant delete because LinkedList  is empty");
        }
        Node temp=last.next;
        if(last.next==last){
            last=null;
        }else{
            last.next=last.next.next;
        }
        temp.next=null;
        length--;
        return  temp;
    }
    public Node deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException("sorry cant delete because Linked list is empty");
        }
        Node deletedNode=last;
        if(last.next==last){
            last=null;
        }else {
            Node itr=last.next;
            while (itr.next != last) {
                itr = itr.next;
            }
            itr.next = last.next;
            last=itr;
        }
        deletedNode.next=null;
        length--;
        return deletedNode;
    }
    public static void main(String[] args) {

        CircularSingllyLInkedList csll=new CircularSingllyLInkedList();
//        Node n1=new Node(1);
//        Node n2=new Node(3);
//        Node n3=new Node(5);
//        Node n4=new Node(7);
//        Node n5=new Node(20);
//        n1.next=n2;

        csll.insertFirst(1);
        csll.insertFirst(3);
        csll.insertFirst(5);
        csll.insertLast(9);
        csll.insertLast(10);
        csll.display();
//        csll.deleteFirst();
//        csll.display();
        System.out.println(csll.deleteLast().data);
        csll.display();



    }
}

public class SingllyLinkedList {
    private Node head;
    public static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertAtFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void printLinkedList(){
        if(head==null){
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data +"\t");
            current=current.next;
        }
    }
    public void insertAtLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public int length(){
        Node current=head;
        if(current==null){
            return 0;
        }
        int len=0;
        while(current!=null){
            current=current.next;
            len++;
        }
        return len;
    }
    public void insertAtPosition(int data,int pos){
        if(pos<=0){
            System.out.println("position start from 1");
            return;
        }
        if(pos==1){
            insertAtFirst(data);
            return;
        }
        Node previous=head;// this previous will point to previous to the node where i am inserting
        int count=1;
        while(count<pos-1 && previous!=null){
            previous=previous.next;
            count++;
        }
        if(previous==null) {
            System.out.println("position out bound, Cant insert");
        }else {
            Node newNode = new Node(data);
            newNode.next = previous.next;
            previous.next = newNode;
        }

    }
    public Node deleteFirstNode(){
        if(head==null){
            return null;
        }
        Node deletedNode=head;
        head=head.next;
        deletedNode.next=null;
        return deletedNode;
    }
    public Node deleteLastNode(){
        Node deletedNode=null;
        if(head==null){
            return deletedNode;
        }
        if(head.next==null){
            deletedNode=head;
            head=null;
            return deletedNode;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        deletedNode=current.next;
        current.next=null;
        return  deletedNode;
    }
    public Node delete(int position){
        Node deletedNode=null;
        if(position<=0){
            return deletedNode;
        }
        if(position==1){
            return deleteFirstNode();
        }
        Node current=head;
        int count=1;
        while(count<position-1 && current.next!=null){
            current=current.next;
            count++;
        }
        if(current.next==null){
            System.out.println("index out of bound so that cant be deleted");
            return null;
        }

        deletedNode=current.next;
        current.next=current.next.next;
        return deletedNode;

    }
    public boolean search(int element){
        Node current=head;
        if(current==null)
            return false;
        while(current!=null){
            if(current.data==element){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    public void reverseLinkedList(){
        if(head==null)
            return;
        Node previous=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;

        }
        head=previous;
    }
    public Node getNthNodeFromEnd(int n){
        if(head==null){
            return null;
        }
        if(n<=0){
            throw new IllegalArgumentException("position must be a positive Integer");
        }
        Node pre=head;
        Node post=head;
        int count=0;
        while(count!=n) {
            if(post==null){
                throw new IllegalArgumentException("sorry Position Out Of Bound");
            }
            post = post.next;
            count++;
        }
        while(post!=null){
            pre=pre.next;
            post=post.next;
        }
        return pre;
    }
    // given a sorted linked List and we have to remove duplicates element from linked list
    public void removeDuplicatesFromSortedLinkedList(){

        Node current=head;

        if(current==null || current.next==null){
            return;
        }
        Node temp;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                temp=current.next;
                current.next=current.next.next;
                temp.next=null;
            }
            else{
                current=current.next;
            }
        }
    }
    public void insertInSortedLinkedList(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        if(head.data>=data){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node previous=head;
        Node current=head.next;
        while(current!=null){
            if(current.data>=data)
                break;
            previous=current;
            current=current.next;
        }
        newNode.next=current;
        previous.next=newNode;

    }
    public void removeAKey(int data){
        if(head==null)
            return;
        Node current=head;
        Node previous=null;
        while(current!=null){
            if(current.data==data){
                if(previous==null){
                    head=current.next;
                    current=current.next;
                }
                else{
                    current=current.next;
                    previous.next=current;
                }

            }
            else{
                previous=current;
                current=current.next;

            }


        }
    }
    //floyd cycle detection  algorithm
    public boolean detectLoop(){
        Node fastPointer=head;
        Node slowPointer=head;
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer==slowPointer)
                return true;
        }
        return false;
    }
    // floyd cycle detection algorithm
    public Node findStartOfLoop(){
        Node slowNode=head;
        Node fastNode=head;
        while (fastNode!=null && fastNode.next!=null){
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
            if(fastNode==slowNode){
                Node start=head;
                while(start!=slowNode){
                    start=start.next;
                    slowNode=slowNode.next;
                }
                return start;
            }
        }
        return null;

    }
    public void removeLoop(){
        Node fastPtr=head;
        Node slowPtr=head;
        while(fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(fastPtr==slowPtr){
                Node start=head;
                while (start.next!=slowPtr.next){
                    start=start.next;
                    slowPtr=slowPtr.next;
                }
                slowPtr.next=null;
            }
        }
    }
    public Node addTwoSortedLinkedList(Node a,Node b){
        Node s=new Node(0);
        Node ptr=s;
        while(a!=null && b!=null){
            if(a.data<b.data){
                ptr.next=a;
                ptr=ptr.next;
                a=a.next;
            }
            else{
                ptr.next=b;
                ptr=ptr.next;
                b=b.next;
            }
        }
        if(a==null){
            ptr.next=b;
        }
        else{
            ptr.next=a;
        }
        return s.next;
    }
    public Node loopWalaLinkedList(){
        Node first=new Node(1);
        Node second=new Node(2);
        Node third=new Node(4);
        Node forth=new Node(5);
        Node fifth=new Node(6);
        Node sixth=new Node(7);
        first.next=second;
        second.next=third;
        third.next=forth;
        forth.next=fifth;
        fifth.next=sixth;
        sixth.next=forth;
        return first;
    }
    public static void main(String[] args) {
        SingllyLinkedList sll=new SingllyLinkedList();

//        System.out.println(sll.length());
//        sll.insertAtLast(30);
//        System.out.println(sll.length());
//        sll.printLinkedList();
//        System.out.println();
//
//        sll.printLinkedList();
//        sll.insertAtFirst(1);
//        sll.insertAtFirst(3);
//        sll.printLinkedList();
//        System.out.println();
//        sll.insertAtFirst(4);
//        sll.printLinkedList();
//        System.out.println();
//        sll.insertAtLast(45);
//        sll.printLinkedList();
//        System.out.println();
//        sll.insertAtPosition(2,34);
//        sll.printLinkedList();
//        System.out.println();
//        System.out.println("Deletion section");
//        Node n=sll.deleteFirstNode();
//        System.out.println(n.data);
//        sll.printLinkedList();
//        System.out.println();
//        Node l=sll.deleteLastNode();
//        System.out.println(l.data);
//        sll.printLinkedList();



//         sll.insertAtFirst(55);
//        sll.insertAtFirst(20);
//        sll.insertAtFirst(20);
//         sll.insertAtFirst(5);
//        sll.insertAtFirst(5);
//         sll.insertAtFirst(1);
//         sll.printLinkedList();
//         System.out.println();
//        System.out.println(sll.search(3));
//         Node n= sll.delete(5);
//        System.out.println(n.data);
//        sll.printLinkedList();
//        sll.printLinkedList();
//        System.out.println("------->>>>");
//        sll.reverseLinkedList();
//        sll.printLinkedList();
//        Node d= sll.getNthNodeFromEnd(5);
//        System.out.println(d.data);
//            sll.removeDuplicatesFromSortedLinkedList();
//            sll.printLinkedList();
//        System.out.println();
//        sll.insertInSortedLinkedList(8);
//        sll.printLinkedList();
//        System.out.println();
//        sll.removeAKey(8);
//        sll.printLinkedList();
//        System.out.println();
//        sll.head=sll.loopWalaLinkedList();
//        sll.printLinkedList();
//        System.out.println(sll.detectLoop());
//        System.out.println(sll.findStartOfLoop().data);
//        sll.removeLoop();
//        sll.printLinkedList();
//        System.out.println();
//        System.out.println(sll.detectLoop());
        //This is for Adding two sorted List such that it remains sorted
//        Node h1=new Node(1);
//        Node d1=new Node(4);
//        Node d2=new Node(5);
//        Node d3=new Node(6);
//        h1.next=d1;
//        d1.next=d2;
//        d2.next=d3;
//        Node h2=new Node(3);
//        Node d11=new Node(6);
//        Node d22=new Node(8);
//        Node d33=new Node(90);
//        h2.next=d11;
//        d11.next=d22;
//        d22.next=d33;
////        Node x=h2;
////        while(x!=null){
////            System.out.print(x.data+"\t");
////            x=x.next;
////        }
//        sll.head=sll.addTwoSortedLinkedList(h1,h2);
//        sll.printLinkedList();




    }
}

/*
Given two non-empty linked list representing two non-negative integers. The digits are stored in
 reverse order and each of their nodes contains a single digit. Add the two numbers and return
 the sun as a linked list.
 */
public class leetcodeSLL {
    public static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Sum(Node a, Node b){
        Node s=new Node(0);
        Node ptr=s;
        int carry=0;
        while(a!=null || b!=null){
            int d1=a!=null?a.data:0;
            int d2=b!=null?b.data:0;
            int sum=carry+d1+d2;
            carry=sum/10;
            ptr.next=new Node(sum%10);;
            ptr=ptr.next;
            a=a!=null?a.next:null;
            b=b!=null?b.next:null;
        }
        if(carry>0){ 
            ptr.next=new Node(carry);
        }
        return s.next;
    }
    public static void main(String[] args) {

        Node h1=new Node(7);
        Node d2=new Node(4);
        Node d3=new Node(9);
        h1.next=d2;
        d2.next=d3;
        Node h2=new Node(5);
        Node d22=new Node(6);
        h2.next=d22;
        Node result=Sum(h1,h2);
        Node ptr=result;
        while(ptr!=null){
            System.out.print(ptr.data+"\t");
            ptr=ptr.next;
        }

    }
}

import javax.print.attribute.standard.JobName;
import java.util.NoSuchElementException;

public class BinarySearchTree {

    private Node root;
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public  BinarySearchTree(){
        this.root=null;
    }
    public void insert(int data){
        root=insertLogic(root,data);
    }
    public Node insertLogic(Node r,int data){
        if(r==null){
            r=new Node(data);
            return r;
        }
        if(r.data>data){
            r.left=insertLogic(r.left,data);
        }else{
            r.right=insertLogic(r.right,data);
        }
        return r;
    }

    public void insertUsingIterativeApproach(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
            return;
        }
        Node temp=root;
        Node pre=null;
        while(temp!=null){
            pre=temp;
            if(temp.data>data){
                temp=temp.left;
            }else{
                temp=temp.right;
            }
        }
        if(pre.data>data){
            pre.left=newNode;
        }else {
            pre.right=newNode;
        }
    }
    // return null when not found so you cant access .data it will raise NullPointerException
    public Node search(int data){
        return search(root,data);
    }
    public Node search(Node r,int data){
        if (r == null || r.data==data) {
            return r;
        }
       if (r.data>data) {
            return search(r.left,data);
        }else{
            return search(r.right,data);
        }

    }
    //used for deletion
    public Node inorderPredecessor(Node r){
        if(r==null || r.left==null){
            throw new NoSuchElementException("sorry cant find inoreder Successor either root is null or root have no left node");
        }
        r=r.left;
        while(r.right!=null){
            r=r.right;
        }
        return r;
    }
//    used for deletion
    public Node inorderSuccessor(Node r){
        if(r==null || r.right==null){
            throw new NoSuchElementException("sorry cant find inoreder Predecessor, either root is null or root have no right node");
        }
        r=r.right;
        while (r.left != null) {
            r=r.left;
        }
        return r;
    }
    public void deleteNode(int value){
        root=deleteNode(root,value);
    }
    public Node deleteNode(Node r,int value){
        if(r==null){
            return r;
        }
        if(r.data>value){
            r.left=deleteNode(r.left,value);
        } else if (r.data<value) {
            r.right=deleteNode(r.right,value);
        }else {
            if(r.left==null && r.right==null){
                return null;
            }
            if(r.left==null){
                return r.right;
            }
            if (r.right == null) {
                return r.left;
            }
            Node temp=inorderSuccessor(r);
            r.data=temp.data;
            r.right=deleteNode(r.right,temp.data);
        }
        return r;
    }
    public boolean isValidBST(){
        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean isValidBST(Node r,int min,int max){
        if(r == null){
            return true;
        }
        if(r.data<=min || r.data>=max){
            return false;
        }
        boolean left=isValidBST(r.left,min,r.data);
        if(left){
            return isValidBST(r.right,r.data,max);
        }
        return false;
    }
    public void inOrder(Node r){
        if(r==null){
            return;
        }
        inOrder(r.left);
        System.out.print(r.data+"---->>>");
        inOrder(r.right);
    }
    public static void main(String[] args) {

       BinarySearchTree binarySearchTree=new BinarySearchTree();
       binarySearchTree.insert(50);
       binarySearchTree.insert(30);
       binarySearchTree.insert(70);
       binarySearchTree.insert(20);
       binarySearchTree.insert(40);
       binarySearchTree.insert(60);
       binarySearchTree.insert(80);
//     binarySearchTree.insert();

//     System.out.println(binarySearchTree.inorderPredecessor(null).data);
//     binarySearchTree.insertUsingIterativeApproache(2);
//     binarySearchTree.insertUsingIterativeApproache(4);
//     binarySearchTree.insertUsingIterativeApproache(3);
//     binarySearchTree.insertUsingIterativeApproache(1);
//     binarySearchTree.insertUsingIterativeApproache(5);
//     binarySearchTree.insertUsingIterativeApproache(3);
//     binarySearchTree.insertUsingIterativeApproache(5);
       binarySearchTree.inOrder(binarySearchTree.root);
       System.out.println(binarySearchTree.isValidBST());
       binarySearchTree.deleteNode(70);
       binarySearchTree.inOrder(binarySearchTree.root);
       System.out.println(binarySearchTree.isValidBST());
       System.out.println();
//     System.out.println(binarySearchTree.search(0).data);

    }
}

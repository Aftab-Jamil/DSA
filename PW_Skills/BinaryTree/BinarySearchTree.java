package PW_Skills.BinaryTree;

public class BinarySearchTree {

    class Node{
       private  int data;
       private Node left;
       private Node right;
       public  Node(int data){
             this.data=data;
             this.left=null;
             this.right=null;
         }
    }
    private Node root=null;
    public Node insertNode(Node root,int data){
        if(root== null){
            return new Node(data);
        }
        if(root.data<data){
            root.right= insertNode(root.right,data);
        }else{
           root.left= insertNode(root.left,data);
        }
        return root;
    }
    public void insertNode(int data){
        root=insertNode(root,data);
    }
    public Node
    public Node insertNodeIter(Node root, int data){
        Node preceder=null;
        Node temp=root;
        if(root==null){
            return new Node(data);
        }
        while(temp!=null){
            if(temp.data>data){
                preceder=temp;
                temp=temp.left;
            }else{
                preceder=temp;
                temp=temp.right;
            }
        }
        Node newNode=new Node(data);
        if(preceder.data>data) preceder.left=newNode;
        else preceder.right=newNode;
        return root;
    }

    public void insertNodeIter(int data){
        root=insertNodeIter(root,data);
    }



    public void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+"-->>");
        inorder(root.right);

    }
    public void inorder(){
        inorder(root);
    }

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.insertNodeIter(5);
        binarySearchTree.insertNodeIter(334);
        binarySearchTree.insertNodeIter(35);
        binarySearchTree.insertNodeIter(52);
        binarySearchTree.insertNodeIter(25);
        binarySearchTree.insertNodeIter(45);
        binarySearchTree.insertNodeIter(225);
        binarySearchTree.insertNodeIter(25);
        binarySearchTree.inorder();


    }

}

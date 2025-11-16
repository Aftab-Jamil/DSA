import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private Node root;
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }
    public BinaryTree(){
        this.root=null;
    }

    public void createBinaryTree(){
        Node first=new Node(40);
        Node second=new Node(30);
        Node third=new Node(50);
        Node forth=new Node(25);
        Node fifth=new Node(35);
        Node six=new Node(45);
        Node seven=new Node(60);
        Node eigth=new Node(15);
        Node nine=new Node(28);
        Node ten=new Node(55);
        Node eleven=new Node(70);
        root=first;
        first.left=second;
        first.right=third;
        second.left=forth;
        second.right=fifth;
        third.left=six;
        third.right=seven;
        forth.left=eigth;
        forth.right=nine;
        seven.left=ten;
        seven.right=eleven;
    }
    public void preOrder(Node r){

        if(r==null){
            return;
        }
        System.out.print(r.data + "--->>>");
        preOrder(r.left);
        preOrder(r.right);

    }
    public void preOrderUsingIterativeApproach(){
        if(root==null)
            return;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            System.out.print(temp.data+"--->>>");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
    }
    public void inOrder(Node r){
        if(r==null){
            return;
        }
        inOrder(r.left);
        System.out.print(r.data+"---->>>");
        inOrder(r.right);
    }
    public void inOrderUsingIterativeApproach(){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp=stack.pop();

            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left==null){
                System.out.print(temp.data+"---->>>");
            }else{
                stack.push(new Node(temp.data));
                stack.push(temp.left);
            }

        }
    }

    public void postOrder(Node r){
        if(r==null){
            return;
        }
        postOrder(r.left);
        postOrder(r.right);
        System.out.print(r.data+"---->>>");
    }
    public void postOrderUsingIterativeApproach(){
        if (root == null) {
            return;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            if (temp.left == null && temp.right == null) {
                System.out.print(temp.data+"---->>>");
            }else{
                stack.push(new Node(temp.data));
                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                }
            }
        }
    }
    public void levelInorder(){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            System.out.print(temp.data+"--->>>");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }
    public int findMax(Node r){
        if(r==null){
            return Integer.MIN_VALUE;
        }
        int result=r.data;
        int left=findMax(r.left);
        int right=findMax(r.right);
        if(left>result)
            result=left;
        if(right>result)
            result=right;
        return result;

    }
    public static void main(String[] args) {

        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);
        System.out.println("Pre-Order traversal");
        binaryTree.preOrderUsingIterativeApproach();
        System.out.println("Pre-Order traversal using iterative approach");
        binaryTree.inOrder(binaryTree.root);
        System.out.println("In-Order traversal");
        binaryTree.inOrderUsingIterativeApproach();
        System.out.println("In-Order traversal using iterative approach");
        binaryTree.postOrder(binaryTree.root);
        System.out.println("Post-Order traversal");
        binaryTree.postOrderUsingIterativeApproach();
        System.out.println("Post-Order traversal using iterative approach");
        binaryTree.levelInorder();
        System.out.println("level Inorder traversal");
        System.out.println(binaryTree.findMax(binaryTree.root));

    }
}

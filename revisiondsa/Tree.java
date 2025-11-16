package revisiondsa;


import java.util.*;

public class Tree {

    public Node root=null;


    public class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public void createTree(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(23);
        Node n4=new Node(30);
        Node n5=new Node(10);
        Node n6=new Node(25);
        Node n7=new Node(15);
        Node n8=new Node(21);
        Node n9=new Node(11);
        Node n10=new Node(12);
        n1.left=n2;
        n2.left=n3;
        n3.left=n4;
        n2.right=n5;
        n5.right=n6;
        n1.right=n7;
        n7.left=n8;
        n7.right=n9;
        n9.left=n10;
        root=n1;
//        root = new Node(10);
//        root.left = new Node(5);
//        root.right = new Node(15);
//
//        root.left.left = new Node(2);
//        root.left.right = new Node(7);

//        root.right.right = new Node(20);
    }
    public void display(Node root){
        if(root==null) return;
        System.out.print(root.data +"\t");
        display(root.left);
        display(root.right);
    }
    public void display(){
        display(root);
    }
    public int sumOfNode(Node root){
        if(root==null) return 0;
        return root.data+sumOfNode(root.left)+sumOfNode(root.right);
    }
    public void sumOfNode(){
        System.out.println(sumOfNode(root));
    }
    public int max(Node root){
        if(root==null) return -1;
        return Math.max(root.data,Math.max(max(root.left),max((root.right))));
    }
    public void max(){
        System.out.println(max(root));
    }

    public int height(Node root){
        if(root==null) return -1;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void height(){
        System.out.println(height(root));
    }
    public int sizeOfTree(Node root){
        if(root==null) return 0;
        return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
    }
    public void sizeOfTree(){
        System.out.println(sizeOfTree(root));
    }
    public void preOrderUsingRecc(Node root){
        if(root==null) return;
        System.out.print(root.data+ "--->>>");
        preOrderUsingRecc(root.left);
        preOrderUsingRecc(root.right);
    }
    public void preOrderUsingIter(Node root){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        Node temp;
        while(!stack.isEmpty()) {
            temp = stack.pop();
            System.out.print(temp.data + "--->>>");
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }
    }
    public void inOrderUsingRecc(Node root){
        if(root==null) return;
        inOrderUsingRecc(root.left);
        System.out.print(root.data+"--->>>");
        inOrderUsingRecc(root.right);
    }
    public void inOrderUsingIter(Node root){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();
        Node temp;
        stack.push(root);
        while(!stack.isEmpty()){
            temp=stack.pop();
            if(temp.left==null && temp.right==null){
                System.out.print(temp.data +"--->>>");
                continue;
            }
            if(temp.right!=null) stack.push(temp.right);
            stack.push(new Node(temp.data));
            if(temp.left!=null ) stack.push(temp.left);

        }
    }

    public void postOrderUsingRecc(Node root){
        if(root==null) return ;
        postOrderUsingRecc(root.left);
        postOrderUsingRecc(root.right);
        System.out.print(root.data +"--->>>");
    }
    public void postOrderUsingIter(Node root){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        Node temp;
        while(!stack.isEmpty()){
            temp=stack.pop();
            if(temp.left==null && temp.right==null){
                System.out.print(temp.data +"--->>>");
                continue;
            }
            stack.push(new Node(temp.data));
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);

        }
    }
    public void levelOrderTraversal(Node root){
        if(root== null) return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        Node temp;
        while(!queue.isEmpty()){
            temp=queue.remove();
            System.out.print(temp.data+"--->>>");
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
    }

            List<Integer> boundary=new ArrayList<>();
            public void leftBoundry(Node root){
                if(root==null) return;
                if(root.left!=null) {
                    boundary.add(root.data);
                    leftBoundry(root.left);
                }else if(root.right!=null){
                    boundary.add(root.data);
                    leftBoundry(root.right);
                }
            }
            public void leafNode(Node root){
                if(root==null) return;
                if(root.left==null && root.right==null) boundary.add(root.data);
                leafNode(root.left);
                leafNode(root.right);
            }
            public void rightBoundry(Node root){
                if(root==null) return ;
                if(root.right!=null){
                    boundary.add(root.data);
                    rightBoundry(root.right);
                }else if(root.left != null){
                    boundary.add(root.data);
                    rightBoundry(root.left);
                }
            }
            public void findBoundry(Node root){
                leftBoundry(root);
                leafNode(root);
               if(root.right!=null) rightBoundry(root.right);
            }


    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.createTree();
        tree.display();
        System.out.println();
        tree.sumOfNode();
        tree.max();
        tree.height();
        tree.sizeOfTree();
        tree.preOrderUsingRecc(tree.root);
        System.out.println();
        tree.preOrderUsingIter(tree.root);
        System.out.println();
        tree.inOrderUsingRecc(tree.root);
        System.out.println();
        tree.inOrderUsingIter(tree.root);
        System.out.println();
        tree.postOrderUsingRecc(tree.root);
        System.out.println();
        tree.postOrderUsingIter(tree.root);
        System.out.println();
        tree.levelOrderTraversal(tree.root);
        System.out.println();
        tree.findBoundry(tree.root);
        System.out.println(tree.boundary);
    }

}

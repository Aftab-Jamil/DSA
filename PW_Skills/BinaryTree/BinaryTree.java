package PW_Skills.BinaryTree;

import java.util.*;
class ForQueue{
    BinaryTree.Node node;
    int position;
    ForQueue(BinaryTree.Node node,int position){
        this.node=node;
        this.position=position;
    }

}

public class BinaryTree {
    class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    private Node root=null;
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
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
    public void display() {
        display(root);
    }

    public int sumOfNode(Node root){
        if(root==null) return 0;
        return root.data+sumOfNode(root.left)+sumOfNode(root.right);
    }
    public int sumOfNode(){
        return sumOfNode(root);
    }
    public int max(Node root){
        if(root==null) return -1;
        int leftMax=max(root.left);
        int rightMax=max(root.right);
        return Math.max(root.data,Math.max(leftMax,rightMax));
    }
    public int max(){
        return max(root);
    }
    public int height(Node root){
        if(root==null) return 0;
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
    public int height(){
        return height(root);
    }
    public int sizeOfTheTree(Node root){
        if(root==null) return 0;
        int leftLength=sizeOfTheTree(root.left);
        int rightLength=sizeOfTheTree(root.right);
        return 1+leftLength+rightLength;
    }
    public int sizeOfTheTree(){
        return sizeOfTheTree(root);
    }
    public void preOrderUsingReccursion(Node root){
        if(root==null) return;
        System.out.print(root.data+"\t");
        preOrderUsingReccursion(root.left);
        preOrderUsingReccursion(root.right);
    }
    public void preOrderUsingReccursion(){
        preOrderUsingReccursion(root);
    }
    public void preOrderUsingIterative(){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            System.out.print(temp.data+"\t");
            if(temp.right!=null) stack.add(temp.right);
            if(temp.left!=null) stack.add(temp.left);
        }
        System.out.println();
    }
    public void inOrderUsingReccursion(Node root){
        if(root==null) return;
        inOrderUsingReccursion(root.left);
        System.out.print(root.data+"\t");
        inOrderUsingReccursion(root.right);
    }
    public void inOrderUsingReccursion(){
        inOrderUsingReccursion(root);
    }
    public void inOrderUsingIterative(){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            Node temp=stack.pop();
            if(temp.left==null && temp.right==null){
                System.out.print(temp.data+"\t");
                continue;
            }
            if(temp.right!=null) stack.push(temp.right);
            stack.push(new Node(temp.data));
            if(temp.left!=null) stack.push(temp.left);

        }
        System.out.println();
    }
    public void postOrderUsingReccursion(Node root){
        if(root==null) return;
        postOrderUsingReccursion(root.left);
        postOrderUsingReccursion(root.right);
        System.out.print(root.data+"\t");
    }
    public void postOrderUsingReccursion(){
        postOrderUsingReccursion(root);
    }
    public void postOrderUsingIterative(){
        if(root==null) return;
        Stack<Node> stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node temp=stack.pop();
            if(temp.right==null && temp.left==null) {
                System.out.print(temp.data+"\t");
                continue;
            }
            stack.push(new Node(temp.data));
            if(temp.right!=null) stack.push(temp.right);
            if(temp.left!=null) stack.push(temp.left);
        }
        System.out.println();
    }
    public void levelOrderTraversal(){
        if(root==null) return;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp=queue.remove();
            System.out.print(temp.data+"\t");
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
        }
        System.out.println();
    }
        private List<Integer> boundary;

        // Left Boundary (excluding leaf nodes)
        public void findLeftBoundary(Node root) {
            if (root == null) return;
            if (root.left != null) {
                boundary.add(root.data);
                findLeftBoundary(root.left);
            } else if (root.right != null) {
                boundary.add(root.data);
                findLeftBoundary(root.right);
            }
            // Don't include leaf nodes here
        }

        // Leaf Nodes
        public void findLeafNode(Node root) {
            if (root == null) return;
            findLeafNode(root.left);
            if (root.left == null && root.right == null)
                boundary.add(root.data);
            findLeafNode(root.right);
        }

        // Right Boundary (excluding leaf nodes), collected in reverse
        public void findRightBoundary(Node root, List<Integer> temp) {
            if (root == null) return;
            if (root.right != null) {
                temp.add(root.data);
                findRightBoundary(root.right, temp);
            } else if (root.left != null) {
                temp.add(root.data);
                findRightBoundary(root.left, temp);
            }
            // Don't include leaf nodes here
        }

        // Final method to get boundary
        public List<Integer> findBoundaryOfBinaryTree(Node root) {
            boundary = new ArrayList<>();
            if (root == null) return boundary;

            boundary.add(root.data);

            findLeftBoundary(root.left);
            findLeafNode(root.left);
            findLeafNode(root.right);

            List<Integer> rightBoundary = new ArrayList<>();
            findRightBoundary(root.right, rightBoundary);
            Collections.reverse(rightBoundary);
            boundary.addAll(rightBoundary);

            return boundary;
        }
        public List<Integer> findBoundaryOfBinaryTree(){
            return findBoundaryOfBinaryTree(root);
        }
        public List<Integer> findRightview(Node root){

            List<Integer> result=new ArrayList<>();
            if(root==null) return result;
            Queue<Node> queue=new LinkedList<>();
            queue.add(root);
            Node temp;
            int indexOfElementComesInRightView;
            while(!queue.isEmpty()){
                indexOfElementComesInRightView=queue.size()-1;
                for(int i=0;i<indexOfElementComesInRightView;i++){
                    temp=queue.remove();
                    if(temp.left!=null) queue.add(temp.left);
                    if(temp.right!=null) queue.add(temp.right);
                }
                temp=queue.remove();
                result.add(temp.data);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            return result;
        }
        public void getTopView(Node root){
            if(root==null) return;
            Queue<ForQueue> queue=new LinkedList<>();
            Map<Integer,Integer> map=new TreeMap<>();

            queue.add(new ForQueue(root,0));
            ForQueue temp;
            while(!queue.isEmpty()){
                temp=queue.remove();
                if(!map.containsKey(temp.position)) {
                    map.put(temp.position,temp.node.data);
                }
                if(temp.node.left!=null) queue.add(new ForQueue(temp.node.left,temp.position-1));
                if(temp.node.right!=null) queue.add(new ForQueue(temp.node.right,temp.position+1));
            }
            System.out.println(map);


        }
        // construct tree when preorder and inorder is given

//    public Queue<Integer> copyPreorderInQueue(int [] preorder){
//        Queue<Integer> queue=new LinkedList<>();
//        for(int val:preorder){
//            queue.add(val);
//        }
//        return queue;
//    }
//
//    public int findIndexInInorder(int [] inorder,int val){
//        for(int i=0;i<inorder.length;i++){
//            if(inorder[i]==val) return i;
//        }
//        return -1;
//    }
//    public Node build(Queue<Integer> preorder,int [] inorder){
//        if(inorder.length>0){
//            int idx=findIndexInInorder(inorder,preorder.remove());
//            Node root=new Node(inorder[idx]);
//            root.left=build(preorder,Arrays.copyOfRange(inorder,0,idx));
//            root.right=build(preorder,Arrays.copyOfRange(inorder,idx+1,inorder.length));
//            return root;
//        }
//        return null;
//    }
//    public Node buildTree(int[] preorder, int[] inorder) {
//        Queue<Integer> queue=copyPreorderInQueue(preorder);
//        return build(queue,inorder);
//
//
//    }

    public Node findLowestCommonAncestor(Node root, int val1,int val2){
            if(root==null || root.data==val1 || root.data==val2) return root;
            Node leftCA=findLowestCommonAncestor(root.left,val1,val2);
            Node rightCA=findLowestCommonAncestor(root.right,val1,val2);
            if(leftCA!=null && rightCA!=null) return  root;
            return leftCA!=null? leftCA: rightCA;

    }

    // return true if a path is available from root to leaf whose sum is equal to target sum
    public boolean pathSum(Node root,int target){
            target-=root.data;
            if(target==0 && root.left==null && root.right==null) return true;
            pathSum(root.left,target);
            pathSum(root.right,target);
            return false;
    }

    // path sum 2: (leetcode 113) : return all the paths from root to leaf whose sum is equal to the targeted sum
    public void traverseTree(Node root, int targetSum, List<Integer> list ,List<List<Integer>> res){
        if(root==null) return;
        list.add(root.data);
        targetSum-=root.data;
        if(targetSum==0 && root.left==null && root.right==null) res.add(new ArrayList<>(list));
        traverseTree(root.left,targetSum,list,res);
        traverseTree(root.right,targetSum,list,res);
        list.remove(list.size()-1);
    }

    public List<List<Integer>> pathSum2(Node root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        traverseTree(root,targetSum,new ArrayList<>(),res);
        return res;

    }

    // path Sum 3(leetcode 437) : Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.
    //The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).
    int count=0;
    public void traverseTreeForNode(Node root, int targetSum, long currentSum){
        if(root==null) return;
        currentSum+=root.data;
        if(targetSum==currentSum) count++;
        traverseTreeForNode(root.left,targetSum,currentSum);
        traverseTreeForNode(root.right,targetSum,currentSum);
    }

    public void traverseTree(Node root, int targetSum){
        if(root==null) return ;
        traverseTreeForNode(root,targetSum,0);
        traverseTree(root.left,targetSum);
        traverseTree(root.right,targetSum);
    }

    public int pathSum3(Node root, int targetSum) {
        traverseTree(root,targetSum);
        return count;

    }
    //

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.createTree();
        binaryTree.display();
//        System.out.println("sum of all nodes:  "+binaryTree.sumOfNode());
//        System.out.println("finding max value in tree : "+ binaryTree.max());
//        System.out.println("finding  max height of tree : "+ binaryTree.height());
//        System.out.println("Size of the tree : "+binaryTree.sizeOfTheTree());
//        System.out.println("pre order traversal using recurrsion");
//        binaryTree.preOrderUsingReccursion();
//        System.out.println();
//        System.out.println("pre order traversal using itrative method");
//        binaryTree.preOrderUsingIterative();
//        System.out.println("in order traversal using recurrsion");
//        binaryTree.inOrderUsingReccursion();
//        System.out.println();
//        System.out.println("in order traversal using itrative method");
//        binaryTree.inOrderUsingIterative();
//        System.out.println("post order traversal using recurrsion");
//        binaryTree.postOrderUsingReccursion();
//        System.out.println();
//        System.out.println("post order traversal using itrative method");
//        binaryTree.postOrderUsingIterative();
//
//        System.out.println("level order traversal");
//        binaryTree.levelOrderTraversal();
//       List<Integer> boundary= binaryTree.findBoundaryOfBinaryTree();
//        System.out.println(boundary);
//        List<Integer > list=binaryTree.findRightview(binaryTree.root);
//        System.out.println(list);
        binaryTree.getTopView(binaryTree.root);
        }
}

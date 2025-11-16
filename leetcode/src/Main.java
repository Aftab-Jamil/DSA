import java.util.*;

public class Main {


       static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
      public static void dfs(TreeNode r){
          if(r==null) return ;
          System.out.println(r.val);
          dfs(r.left);
          dfs(r.right);



      }

    public static void main(String[] args) {
        TreeNode t1= new TreeNode(5);
        TreeNode t2= new TreeNode(4);
        TreeNode t3= new TreeNode(11);
        TreeNode t4= new TreeNode(7);
        TreeNode t5= new TreeNode(2);
        TreeNode t6= new TreeNode(8);
        TreeNode t7= new TreeNode(13);
        TreeNode t8= new TreeNode(4);
        TreeNode t9= new TreeNode(1);
//        TreeNode t10= new TreeNode(5/);
        t1.left=t2;
        t1.right=t6;
        t2.left=t3;
        t3.left=t4;
        t3.right=t5;
        t6.left=t7;
        t6.right=t8;
        t8.right=t9;
      dfs(t1);
      Queue<Integer> q=new LinkedList<>();
      q.add(1);



    }
}
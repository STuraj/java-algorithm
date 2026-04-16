package day11;

public class TreeNode {
    int val;
     TreeNode left, right;
     public TreeNode(int val){
         this.val = val;
     }
     public class InorderTraversal{
         public static void inorder(TreeNode root){
             if (root==null){
                 return;
             }
             inorder(root, left);
             
         }
     }
}

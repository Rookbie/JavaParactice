import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return Arrays.asList();

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(level);
        }

        return  res;
    }
    private static final List<List<Integer>> TRAVERSAL_LIST  = new ArrayList<>();
    private  static  void dfs(TreeNode root, int level){
        if(root == null)return;

        if(TRAVERSAL_LIST.size() == level){
            TRAVERSAL_LIST.add(new ArrayList<>());
        }
        List<Integer> levelList = TRAVERSAL_LIST.get(level);
        levelList.add(root.val);

        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}
class TreeNode {
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
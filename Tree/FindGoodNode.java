package Tree;

public class FindGoodNode
{
    public int goodNodes(TreeNode root)
    {
        return dfs(root,Integer.MIN_VALUE);
    }
    public int dfs(TreeNode node,int maxSoFor)
    {
        if(node==null)
        {
            return 0;
        }
        int left = dfs(node.left,Math.max(maxSoFor,node.val));
        int right =dfs(node.right,Math.max(maxSoFor,node.val));
        int ans = left+right;
        if(node.val>=maxSoFor)
        {
            ans+=1;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(5);
        TreeNode one = new TreeNode(4);
        TreeNode two = new TreeNode(8);
        TreeNode three = new TreeNode(11);
        TreeNode four = new TreeNode(13);
        TreeNode five = new TreeNode(4);
        TreeNode six = new TreeNode(7);
        TreeNode seven = new TreeNode(2);
        TreeNode eight = new TreeNode(1);

        root.left = one;
        root.right = two;
        one.left = three;
        three.left=six;
        three.right=seven;
        two.right = four;
        two.left = five;
        five.right = eight;
     FindGoodNode fg =new FindGoodNode();
     int result = fg.goodNodes(root);
        System.out.println(result);
    }

}

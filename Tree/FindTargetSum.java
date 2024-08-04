package Tree;

public class FindTargetSum
{
    int target;

    public boolean hasPathSum(TreeNode root,int targetSum)
    {
        target = targetSum;
        return dfs(root,0);
    }

    public boolean dfs(TreeNode node, int curr)
    {
        if(node==null)
        {
            return false;
        }
        if(node.left ==null && node.right==null)
        {
            return (curr+node.val) == target;
        }
        curr+=node.val;
        boolean left = dfs(node.left,curr);
        boolean right = dfs(node.right,curr);
        return left||right;

    }

    public static void main(String args[])
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
       FindTargetSum fs = new FindTargetSum();
        boolean result = fs.hasPathSum(root,22);
        System.out.println(result);
    }
}

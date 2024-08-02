package Tree;

public class MaximumDepthOfTree
{
    public int maxDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String args[])
    {
        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;
        two.right = five;
        five.right = six;
        MaximumDepthOfTree md = new MaximumDepthOfTree();
        int result = md.maxDepth(root);
        System.out.println(result);
    }
}

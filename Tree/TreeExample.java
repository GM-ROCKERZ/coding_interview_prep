package Tree;

public class TreeExample
{
    public static void main(String args[])
    {
        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);

        root.left = one;
        root.right = two;

        System.out.println(root.left.val);
        System.out.println(root.val);
        System.out.println(root.right.val);
    }

}

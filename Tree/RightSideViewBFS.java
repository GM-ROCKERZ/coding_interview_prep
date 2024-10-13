package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewBFS
{
    public List<Integer> rightSideView(TreeNode root)
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            int currentLength = queue.size();
            int prev =0;

            for(int i=0;i<currentLength;i++)
            {
                TreeNode node = queue.remove();
                prev =node.val;
                if(node.left !=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }

            }
            ans.add(prev);
        }
        return ans;

    }

    public static void main(String args[])
    {
        TreeNode root = new TreeNode(1);
        TreeNode one = new TreeNode(2);
        TreeNode two = new TreeNode(3);
        TreeNode three = new TreeNode(4);
        TreeNode four = new TreeNode(5);

        root.left = one;
        root.right = two;
        one.left = three;
        one.right = four;

     RightSideViewBFS rbfs = new RightSideViewBFS();
        List<Integer> result = rbfs.rightSideView(root);
        System.out.println(result);
    }
}

package linkedList;

public class FindLoop
{
    public boolean hasCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next !=null)
        {
            slow = slow.next;
            fast= fast.next.next;
            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next=new ListNode(3);
        node.next.next.next.next= node;
        FindLoop fl = new FindLoop();

        boolean hasLoop = fl.hasCycle(node);
        System.out.println(hasLoop);
    }

}

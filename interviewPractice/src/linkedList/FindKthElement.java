package interviewPractice.src.linkedList;

public class FindKthElement
{
    public ListNode findNode(ListNode head,int k )
    {
        ListNode slow = head;
        ListNode fast = head;

        for(int i =0;i<k;i++)
        {
            fast = fast.next;
        }

        while (fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String args[])
    {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next=new ListNode(4);

       FindKthElement fm = new FindKthElement();
        ListNode result = fm.findNode(node,2);
        System.out.println(result.val);
    }
}

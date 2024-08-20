package linkedList;


class ListNode
{
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
public class FindMiddleElement
{
    public  int getMiddle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
    public static void main(String args[])
    {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next=new ListNode(4);

        FindMiddleElement fm = new FindMiddleElement();
        int result = fm.getMiddle(node);
        System.out.println(result);
    }
}

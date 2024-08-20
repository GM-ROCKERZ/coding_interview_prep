package linkedList;

public class LinkedListReversal
{
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null;
        ListNode current = head;

        while(current != null)
        {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public void printList(ListNode head)
    {
        ListNode current = head;

        while(current!=null)
        {
            System.out.print(" "+current.val);
            current=current.next;
        }
    }

    public static void main(String args[])
    {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next=new ListNode(4);
        LinkedListReversal lr = new LinkedListReversal();
        ListNode resultNode = lr.reverseList(node);
        lr.reverseList(resultNode);
        lr.printList(resultNode);
    }
}

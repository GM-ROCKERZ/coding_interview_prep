package interviewPractice.src.linkedList;

public class RemovingDuplicates
{
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode currentNode = head;
        while(currentNode != null && currentNode.next !=null)
        {
            if(currentNode.next.val==currentNode.val)
            {
                currentNode.next = currentNode.next.next;
            }
            else
            {
                currentNode = currentNode.next;
            }
        }
        return head;
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
        node.next = new ListNode(1);
        node.next.next = new ListNode(1);
        node.next.next.next=new ListNode(2);
        RemovingDuplicates rd = new RemovingDuplicates();

        ListNode resultNode = rd.deleteDuplicates(node);
        rd.printList(resultNode);
    }
}

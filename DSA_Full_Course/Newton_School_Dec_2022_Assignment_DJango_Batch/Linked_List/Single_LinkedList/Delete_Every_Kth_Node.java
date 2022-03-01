/*

 class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/
static Node deleteK(Node head, int k){
//Enter your code here
        Node tempHead = head;
        while(tempHead.next != tempHead){
        Node p = head.next;
        System.out.print(head.data+"->");
        while( p != head){
        System.out.print(p.data +"->");
        p = p.next;
        }
        System.out.println(head.data);
        //Delete kth Node from current pointer
        int i = 1;
        while(i < k){
        tempHead = tempHead.next;
        i++;
        }
        if(tempHead.next == head)
        head = head.next;
        tempHead.next = tempHead.next.next;
        }
        System.out.println(head.data+"->"+head.data);
        return head;
        } 
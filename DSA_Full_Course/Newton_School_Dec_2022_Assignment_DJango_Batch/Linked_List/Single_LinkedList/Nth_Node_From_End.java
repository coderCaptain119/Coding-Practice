/*
// information about the class Node
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
static int getNthFromLast(Node head, int n)
        {
        Node slow = head;
        Node high = head;
        for(int i = 1; i < n; i++){
        high = high.next;
        if(high == null){
        return -1;
        }
        }
        while(high.next != null){
        slow = slow.next;
        high = high.next;
        }
        return slow.data;
        // Your code here
        }
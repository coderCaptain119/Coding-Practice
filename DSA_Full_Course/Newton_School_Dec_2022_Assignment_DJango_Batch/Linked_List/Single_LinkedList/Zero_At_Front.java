/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/
static public Node moveZeroes(Node head)
        {
        // Your code here
        Node prv = head;
        Node current = head.next;
        while(current != null){
        if(current.data == 0){
        prv.next = current.next;
        current.next = head;
        head = current;

        current = prv.next;
        }
        else{
        prv = current;
        current = current.next;
        }
        }

        return head;

        }
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
static Node deleteEven(Node head){
//Enter your code here
        Node temp = head;
        while(temp.next != head){
        if(temp.next.data%2 == 0){
        temp.next = temp.next.next;
        }
        else{
        temp = temp.next;
        }
        }
        if(head.data %2 == 0){
        temp.next = head.next;
        head = head.next;
        }
        return head;
        }
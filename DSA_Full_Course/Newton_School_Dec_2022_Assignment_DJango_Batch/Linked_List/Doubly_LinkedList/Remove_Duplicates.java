/*
class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
public static Node deleteDuplicates(Node head) {
//complete this function
        Node temp = head;
        while(temp.next != null){
        if(temp.val == temp.next.val){
        deleteNode(head, temp.next);
        }
        else{
        temp = temp.next;
        }
        }
        return head;
        }
public static void deleteNode(Node head, Node delete){
        if(head == null || delete == null){
        return;
        }
        if(head == delete){
        head = delete.next;
        }
        if(delete.next != null){
        delete.next.prev = delete.prev;
        }
        if(delete.prev != null){
        delete.prev.next = delete.next;
        }
        }
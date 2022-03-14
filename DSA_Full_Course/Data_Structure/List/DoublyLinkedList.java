package Data_Structure.List;

public class DoublyLinkedList implements List {

    Node head; // Pointer head that's point to first node of list
    int size; // variable size for maintain current size of list

    // Class Node represent single node of Doubly Linked List
    class Node{
        int data; // variable data to store list's data
        Node next; // pointer next for that's point to next node
        Node prv; // pointer prv for that's point to previous node

        Node(int x){
            this.data = x;
        }
    }

    // Method for check list is empty or not
    public boolean isEmpty(){
        // if head is null than stack is empty
        if(head == null){
            return true;
        }
        return false;
    }

    // Method for inser data at end of the list
    @Override
    public void add(Integer value) {
        Node newNode = new Node(value);
        // checking base condition list is empty or not
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        // finding last node of list
        while (temp.next != null){
            temp = temp.next;
        }

        // adding data at last
        temp.next = newNode;
        newNode.prv = temp;
        size++;
    }

    // Method for insert value at given index in list
    @Override
    public void add(int index, Integer value) {
        // checking given index is valid or not
        if (index < 0 || index > size){
            System.out.println("Enter valid index");
            return;
        }
        // Base condition : index 0 than add at head
        if (index == 0){
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        int i = 1;
        // find the previous index where we need to insert
        while(i < index){
            temp = temp.next;
            i++;
        }
        // adding newNode at next to previous index
        newNode.next = temp.next;
        newNode.prv = temp;
        temp.next = newNode;
        if(newNode.next != null)
            newNode.next.prv = newNode;
        size++;
    }

    // Method for insert all elements of given array at last in List
    @Override
    public void add(int[] arr) {
        /*
         pick each element from array
         add at end of the list
        */
        for (int a : arr){
            add(a);
        }
    }

    // Method for add data at head
    @Override
    public void addFirst(Integer value) {
        Node newNode = new Node(value);
        // Base condition : stack empty then make newNode head
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }
        // Connect newNode with head and make newNode head
        newNode.next = head;
        head.prv = newNode;
        head = newNode;
        size++;
    }

    // Method for delete first element of list
    @Override
    public void deleteFirst() {
        // Base condition : list empty then nothing to delete
        if (isEmpty()){
            return;
        }
        // Move head to it's next node
        head = head.next;
        if (head != null)
            head.prv = null;
        size--;
    }

    // Method for delete last element of list
    @Override
    public void deleteLast() {
        // Base condition : list empty then nothing to delete
        if (isEmpty()){
            return;
        }
        Node temp = head;
        // Finding second last node
        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        // Corner case : if list contains only two data
        if (temp.next == null)
            temp = null;
        else
            temp.next = null;
        size--;
    }

    // Method for delete given value from list
    @Override
    public void delete(Integer value) {
        if (isEmpty()){
            return;
        }
        if (head.data == value){
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp.next.data != value && temp.next != null){
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null)
                temp.next.prv = temp;
        }
        size--;
    }

    @Override
    public void deleteAt(int position) {
        if (isEmpty()){
            return;
        }
        if (position == 1){
            deleteFirst();
            return;
        }
        int i = 1;
        Node temp = head;
        while (i < position-1 && temp.next != null){
            temp = temp.next;
            i++;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null)
                temp.next.prv = temp;
            size--;
        }
    }

    @Override
    public void set(Integer value, Integer newValue) {
        if (isEmpty()){
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != value){
            temp = temp.next;
        }
        if (temp != null)
            temp.data = newValue;
    }

    @Override
    public int indexOf(Integer number) {
        if (isEmpty()){
            return -1;
        }
        Node temp = head;
        int i = 0;
        while (temp != null && temp.data != number){
            temp = temp.next;
            i++;
        }
        if(temp != null){
            return i;
        }
        return -1;
    }

    @Override
    public void reverseList() {
        if (isEmpty()){
            return;
        }
        Node prv = null;
        Node nxt = head.next;
        while(head.next != null){
            head.next = prv;
            head.prv = nxt;
            prv = head;
            head = nxt;
            nxt = head.next;
        }
        head.next = prv;
        head.prv = nxt;
    }

    public static Node reverseRecursive(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            head.prv = null;
            return head;
        }

        Node res = reverseRecursive(head.next);
        head.next.next = head;
        head.prv = head.next;
        head.next = null;

        return res;
    }

    @Override
    public int size() {
        return size;
    }
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node temp = head;
        s.append("null <- ");
        while(temp.next != null){
            s.append(temp.data);
            s.append(" <--> ");
            temp = temp.next;
        }
        s.append(temp.data);
        s.append(" -> null");
        return s.toString();
    }
}

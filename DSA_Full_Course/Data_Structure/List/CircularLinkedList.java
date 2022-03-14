package Data_Structure.List;

public class CircularLinkedList implements List{
    Node head;
    int size;

    class Node{
        Integer data;
        Node next;
        public Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }

    public CircularLinkedList(){
        this.head = null;
        this.size = 0;
    }

    // Method for check current list is Empty or not
    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    //Method for add value at last in List
    @Override
    public void add(Integer value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        newNode.next = head;
        size++;
    }

    //Method for insert value at given index in list
    @Override
    public void add(int index, Integer value) {
        if (index < 0 || index > size){
            System.out.println("Please Enter Valid Index");
            return;
        }
        if (index == 0){
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Method for insert all elements of given array at last in List
    @Override
    public void add(int[] arr) {
        for (Integer a : arr){
            add(a);
        }
    }

    // Method for insert value at start of in List
    @Override
    public void addFirst(Integer value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        }
        else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Method for delete first element of list
    @Override
    public void deleteFirst() {
        if (isEmpty()){
            return;
        }
        if (head.next == head){
            head = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != head){
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
        size--;
    }

    //Method for delete last element of list
    @Override
    public void deleteLast() {
        if (isEmpty()){
            return;
        }
        if (head.next == head){
            head = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
        size--;
    }

    //Method for delete given value from list
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
        while (temp.next != head && temp.next.data != value){
            temp = temp.next;
        }
        if (temp.next.data == value) {
            temp.next = temp.next.next;
            size--;
        }
    }

    //Method for delete element at given position from start of list
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
        while (i < position - 1 && temp.next != head){
            temp = temp.next;
            i++;
        }
        if (temp.next != head){
            temp.next = temp.next.next;
            size--;
        }
    }

    //Method for update the value in list
    @Override
    public void set(Integer value, Integer newValue) {
        if (isEmpty()){
            return;
        }
        boolean flag = true;
        Node temp = head;
        while (temp.data != value && flag){
            temp = temp.next;
            if (temp == head)
                flag = false;
        }
        if (flag){
            temp.data = newValue;
        }
    }

    //Method for find the index of given number from list
    @Override
    public int indexOf(Integer number) {
        if (isEmpty()){
            return -1;
        }
        boolean flag = true;
        Node temp = head;
        int index = 0;
        while (temp.data != number && flag){
            temp = temp.next;
            if (temp == head)
                flag = false;
            index++;
        }
        if (flag) {
            return index;
        }
        return -1;
    }

    @Override
    public void reverseList() {
        if (size < 2){
            return;
        }
        Node prv = head;
        while (prv.next != head){
            prv = prv.next;
        }
        Node newTail = head;
        Node nxt = head.next;
        while (head.next != newTail) {
            head.next = prv;
            prv = head;
            head = nxt;
            nxt = head.next;
        }
        head.next = prv;
    }

    // Twp wrapped static method to reverse circular linked list
    // using recursion.
    public static Node reverseRecursive(Node head){
        Node prv = head;
        while (prv.next != head){
            prv = prv.next;
        }

        return reverseRecursive(head, prv, head);
    }

    private static Node reverseRecursive(Node head, Node prv, Node newTail){
        if(head == null){
            return null;
        }
        if(head.next == newTail){
            return head;
        }

        Node res = reverseRecursive(head.next, head, newTail);
        head.next.next = head;
        head.next = prv;

        return res;
    }

    //Method for find size of current list
    @Override
    public int size() {
        return this.size;
    }

    //Overridden Method toString() for print current list
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node temp = head;
        s.append(".... -> ");
        while(temp.next != head){
            s.append(temp.data);
            s.append(" -> ");
            temp = temp.next;
        }
        s.append(temp.data);
        s.append(" -> ");
        s.append(head.data);
        s.append("....");
        return s.toString();
    }
}

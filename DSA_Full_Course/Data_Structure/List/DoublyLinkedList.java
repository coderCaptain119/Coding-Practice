package Data_Structure.List;

public class DoublyLinkedList implements List {

    Node head;
    int size;

    class Node{
        int data;
        Node next;
        Node prv;

        Node(int x){
            this.data = x;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    @Override
    public void add(Integer value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prv = temp;
        size++;
    }

    @Override
    public void add(int index, Integer value) {
        if (isEmpty()){
            System.out.println("List is Empty");
        }
        if (index < 0){
            System.out.println("Enter valid index");
            return;
        }
        if (index == 0){
            addFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        int i = 1;
        while(temp != null && i < index){
            temp = temp.next;
            i++;
        }
        if (temp == null){
            System.out.println("Enter valid index");
            return;
        }
        newNode.next = temp.next;
        newNode.prv = temp;
        temp.next = newNode;
        if(newNode.next != null)
            newNode.next.prv = newNode;
        size++;
    }

    @Override
    public void add(int[] arr) {
        for (int a : arr){
            add(a);
        }
    }

    @Override
    public void addFirst(Integer value) {
        Node newNode = new Node(value);
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prv = newNode;
        head = newNode;
        size++;
    }

    @Override
    public void deleteFirst() {
        if (isEmpty()){
            return;
        }
        head = head.next;
        if (head != null)
            head.prv = null;
        size--;
    }

    @Override
    public void deleteLast() {
        if (isEmpty()){
            return;
        }
        Node temp = head;
        while(temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        if (temp.next == null)
            temp = null;
        else
            temp.next = null;
        size--;
    }

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
    public void delete(int position) {
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
        }
        size--;
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

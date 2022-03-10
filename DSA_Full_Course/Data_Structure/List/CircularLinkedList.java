package Data_Structure.List;

public class CircularLinkedList implements List{
    Node head;
    Node tail;
    int size;

    class Node{
        Integer data;
        Node next;
        public Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    @Override
    public void add(Integer value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.next = head;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void add(int index, Integer value) {
        if (index < 0 || index >= size){
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

    @Override
    public void add(int[] arr) {
        for (Integer a : arr){
            add(a);
        }
    }

    @Override
    public void addFirst(Integer value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        tail.next = head;
        size++;
    }

    @Override
    public void deleteFirst() {
        if (isEmpty()){
            return;
        }
        if (head.next == head){
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        tail.next = head;
        size--;
    }

    @Override
    public void deleteLast() {
        if (isEmpty()){
            return;
        }
        if (head.next == head){
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = head;
        size--;
    }

    @Override
    public void delete(Integer value) {
        if (isEmpty()){
            return;
        }
        if (head.next == head){
            if (head.data == value){
                head = null;
                tail = null;
                size--;
            }
            return;
        }

    }

    @Override
    public void delete(int position) {

    }

    @Override
    public void set(Integer value, Integer newValue) {

    }

    @Override
    public int indexOf(Integer number) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}

package Data_Structure.List;

public class LinkedList implements List {

    Node head;
    Node tail;
    int size;

    public class Node{
        Integer data;
        public Node next;
        public Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Return true if List is empty
    public boolean isEmpty(){
        if( head == null ){
            return true;
        }
        return false;
    }

    // insert number at the end of list
    public void add(Integer value){
        Node newNode = new Node(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    // insert number at the given index
    public void add(int index, Integer value){
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

    // insert given array at the end of list
    public void add(int[] arr){
        for (int a : arr)
            add(a);
    }

    // insert number at start of list
    public void addFirst(Integer value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // delete head from the list
    public void deleteFirst(){
        if (isEmpty()){
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
        }
        head = head.next;
        --size;
    }

    // delete tail from the list
    public void deleteLast(){
        if (isEmpty()){
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
        }
        Node temp = head;
        while (temp.next != tail)
            temp = temp.next;
        temp.next = null;
        tail = temp;
        --size;
    }

    // delete given number from list
    public void delete(Integer value){
        if (isEmpty()){
            return;
        }
        if(head.data == value){
            deleteFirst();
            return;
        }
        if(tail.data == value){
            deleteLast();
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            if(temp.next.data == value){
                temp.next = temp.next.next;
                size--;
                break;
            }
        }
    }

    // delete number from given position in list
    public void delete(int position){
        if (isEmpty()){
            System.out.println("EmptyLinkedList");
            return;
        }
        if(position == 1){
            deleteFirst();
            return;
        }
        if (position == size){
            deleteLast();
            return;
        }
        int count = 1;
        Node temp = head;
        while(temp != tail && count < position-1){
            temp = temp.next;
            ++count;
        }
        if (temp != tail)
            temp.next = temp.next.next;
        size--;
    }

    // update given number with older number
    public void set(Integer value, Integer newValue){
        int index = indexOf(value);
        if(index >= 0){
            delete(index + 1);
            add(index, newValue);
        }
    }

    // return index of given number
    public int indexOf(Integer number){
        if(isEmpty()){
            System.out.println("EmptyList");
            return -1;
        }
        if (head.data == number){
            return 0;
        }
        if (tail.data == number){
            return size-1;
        }
        Node temp = head.next;
        int count = 0;
        while(temp != tail && temp.data != number){
            temp = temp.next;
            ++count;
        }
        if(temp == tail){
            System.out.println("Element Not Found");
            return -1;
        }
        return count;
    }
    public void reverseList(){
        if (isEmpty()){
            return;
        }
        Node prv = null;
        Node nxt = head.next;
        while(head.next != null){
            head.next = prv;
            prv = head;
            head = nxt;
            nxt = head.next;
        }
        head.next = prv;
    }

    // return size of the list
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        Node temp = head;
        while(temp != null){
            s.append(temp.data);
            s.append(" -> ");
            temp = temp.next;
        }
        s.append("null");
        return s.toString();
    }
}

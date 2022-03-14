package Data_Structure.Stack;

public class Stack_Using_Array {
    // This class shows how to Implement
    // Stack using Array

    int top;
    int[] arr;
    int size;
    public Stack_Using_Array(){
        this.top = -1;
        this.arr = new int[100];
        this.size = 0;
    }
    public Stack_Using_Array(int size){
        this.top = -1;
        this.arr = new int[size];
        this.size = 0;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        return false;
    }
    // push() method for insert data into Stack
    public void push(int value){
        if (top == arr.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
        /*
        arr[top + 1] = value;
        top++;
        */
        size++;
    }
    // pop() method for delete data from Stack
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        top--;
        /*
        arr[top] = 0;
        top--;

        One line : arr[top--] = 0;
         */
        size--;
    }
    // peek() method for get data from Stack
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    // size() method for get size of current stack
    public int size(){
        return this.size;
        // return top+1;
    }

    @Override
    public String toString(){
        if (isEmpty()){
            String s = "Stack is Empty";
            return s;
        }
        StringBuffer s = new StringBuffer();
        s.append("[ ");
        for (int i = 0; i < size; i++){
            s.append(arr[i] + " ");
        }
        s.append("]");
        return s.toString();
    }
}

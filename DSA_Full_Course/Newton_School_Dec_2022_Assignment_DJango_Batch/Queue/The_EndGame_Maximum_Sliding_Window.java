import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = inputTaker.nextInt();
        }
        int k = inputTaker.nextInt();

        getMax(arr,n,k);
    }

    private static void getMax(int[] arr, int n , int k){

        Deque<Integer> maxQueue = new LinkedList<>();

        for(int i =0;i<k;i++){
            while(!maxQueue.isEmpty() && arr[maxQueue.getLast()] <= arr[i]){
                maxQueue.removeLast();
            }
            maxQueue.addLast(i);
        }

        for(int i = k;i<n;i++){
            System.out.print(arr[maxQueue.peek()]+" ");

            while(!maxQueue.isEmpty() && maxQueue.peek() <= i - k){
                maxQueue.remove();
            }

            while(!maxQueue.isEmpty() && arr[maxQueue.getLast()] <= arr[i]){
                maxQueue.removeLast();
            }
            maxQueue.addLast(i);

        }
        System.out.print(arr[maxQueue.peek()]+" ");
    }
}
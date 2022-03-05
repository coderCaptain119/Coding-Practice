import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner inputTaker = new Scanner(System.in);
        int n = inputTaker.nextInt();
        int k = inputTaker.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = inputTaker.nextInt();
        }

        System.out.println(getSum(arr,n,k));
    }

    private static long getSum(int[] arr, int n , int k){
        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer> minQueue = new LinkedList<>();

        for(int i =0;i<k;i++){
            while(!maxQueue.isEmpty() && arr[maxQueue.getLast()] <= arr[i]){
                maxQueue.removeLast();
            }
            maxQueue.addLast(i);

            while(!minQueue.isEmpty() && arr[minQueue.getLast()] >= arr[i]){
                minQueue.removeLast();
            }
            minQueue.addLast(i);
        }

        long sum = 0;
        for(int i = k;i<n;i++){
            sum += arr[maxQueue.peek()] + arr[minQueue.peek()];

            while(!maxQueue.isEmpty() && maxQueue.peek() <= i - k){
                maxQueue.remove();
            }
            while(!minQueue.isEmpty() && minQueue.peek() <= i - k){
                minQueue.remove();
            }

            while(!maxQueue.isEmpty() && arr[maxQueue.getLast()] <= arr[i]){
                maxQueue.removeLast();
            }
            maxQueue.addLast(i);

            while(!minQueue.isEmpty() && arr[minQueue.getLast()] >= arr[i]){
                minQueue.removeLast();
            }
            minQueue.addLast(i);
        }
        sum += arr[maxQueue.peek()] + arr[minQueue.peek()];
        return sum;
    }
}
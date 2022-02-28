import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        list2.addAll(list);

        nextPermutation(list,n);

        if(list.equals(list2)){
            reverse(list,0,n-1);
        }

        for(Integer a : list){
            System.out.print(a+" ");
        }

    }
    private static List<Integer> nextPermutation(List<Integer> list, int n){

        for (int i = n - 1; i > 0; i--) {
            if (list.get(i - 1) < list.get(i)) {
                int j = n-1;
                while(j>= i) {
                    if(list.get(j) > list.get(i-1)) {
                        swap(list, i - 1, j);
                        break;
                    }
                    j--;
                }
                reverse(list, i, n - 1);
                break;
            }
        }
        return list;

    }
    private static void swap(List<Integer> list, int a, int b){
        Integer temp = list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }
    private static void reverse(List<Integer> list, int low, int high){
        if(low >= high){
            return;
        }
        swap(list,low,high);
        reverse(list, low+1,high-1);
    }
}
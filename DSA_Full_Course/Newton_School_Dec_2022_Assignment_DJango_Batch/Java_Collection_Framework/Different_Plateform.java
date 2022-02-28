import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for(int i = 0; i < n; i++){
            list1.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            list2.add(sc.nextInt());
        }

        Collections.sort(list1);
        Collections.sort(list2);

        // Check which list is contains arrival time and deparature time
        if(list1.get(0) <= list2.get(0)){
            System.out.println(minPlateformNeeded(list1, list2, n));
        }
        else{
            System.out.println(minPlateformNeeded(list2, list1, n));
        }

    }
    private static int minPlateformNeeded(List<Integer> arr, List<Integer> dep, int n){

        // Minimum plateform needed is always 1.
        int current_needed_plateform = 1;
        // Variable result for store Maximum plateforms
        // needed for all trains arrivel and deparature.
        int result = 1;

        int i = 1, j = 0;
        while(i < n && j < n){
            // If New Train is arrive and Plateform is not empty
            // Than we need extra plateform for ith Train.
            if(arr.get(i) <= dep.get(j)){
                current_needed_plateform++;
                i++;
            }
            // If New Train arrive and Plateform is empty
            // Than we don't need extra plateform.
            else{
                current_needed_plateform--;
                j++;
            }
            // Set result as Maximum Plateform needed all over
            result = Math.max(result, current_needed_plateform);

        }

        return result;

    }
}
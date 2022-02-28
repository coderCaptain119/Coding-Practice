package home.Practice;

import java.util.*;
public class Triplets {
    public static void main(String[] args) {
        int[] arr = {10,2,4,11,8,3,7,5};
        int n = arr.length;
        int k = 15;

        Arrays.sort(arr);

        for(int i=0; i<n-2; i++){
            int first = arr[i];
            int x = i+1, y = n-1;
            while(x<y){
                int sum = arr[x] + arr[y];
                if((first+sum)==k){
                    System.out.println(first+" "+arr[x]+" "+arr[y]);
                    x++;
                    y--;
                }
                else if((first+sum) > k){
                    y--;
                }
                else{
                    x++;
                }
            }
        }

    }
}

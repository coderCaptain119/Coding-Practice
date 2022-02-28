package home.Practice;

import java.util.*;

public class ReverseStringSpace {
    public static void main(String[] args) {

        String s = "I am Newton School Student";

        s = reverseOrdeOfWords(s);

        System.out.println(s.trim());

    }
    private static String reverseEachWord(String str){
        String[] arr = str.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i=0; i<arr.length; i++) {
            StringBuffer sb = new StringBuffer(arr[i]);
            sb.reverse();
            result.append(sb);
            result.append(" ");
        }
        return result.toString();
    }
    private static String reverseOrdeOfWords(String str){
        String[] arr = str.split(" ");
        reverseArray(arr,0, arr.length-1);
        StringBuffer sb = new StringBuffer();
        for (int i=0; i< arr.length; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    private static void reverseArray(String[] arr, int l, int h){
        if(l < h){
            String temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;

            reverseArray(arr, l+1, h-1);
        }
    }
}

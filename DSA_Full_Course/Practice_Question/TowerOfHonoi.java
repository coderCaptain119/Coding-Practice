package home.Practice;

import java.util.Scanner;

public class TowerOfHonoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        towerOfHonoi(n,'A','C','B');
    }
    private static void towerOfHonoi(int disk, char from, char dest, char aux){
        if(disk == 0){
            return;
        }
        towerOfHonoi(disk-1, from,aux,dest);
        System.out.println(disk+" : "+from+" --> "+dest);
        towerOfHonoi(disk-1,aux,dest,from);
    }
}

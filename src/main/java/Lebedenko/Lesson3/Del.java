package main.Java.Lebedenko.lesson3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Del {
    public  void iii(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created::");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array ::");

        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("The array created is ::"+ Arrays.toString(myArray));
        System.out.println("indices of duplicate elements in the array are elements::");
        Set set = new HashSet ();

        for(int i=0; i<myArray.length; i++) {
            if(!set.add(myArray[i])) {
                System.out.println(i);
            }
        }
    }
}

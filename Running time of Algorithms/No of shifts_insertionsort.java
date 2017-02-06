// NUmber of shifts an insertion sort takes to sort an array 
// Input --- 2 1 3 1 2
// Output -- There will be total 4 shifts 
//Explanation
        //The first 1 is shifted once. 
       //The 3 stays where it is.
      //The next 1 gets shifted twice.
     //The final 2 gets shifted once.
    //Hence, the total number of shifts is 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        for(int i=0;i<array.length;i++)
            array[i]=s.nextInt();
        int key ,i,count=0;
        for(int j=1;j<array.length;j++)
            {
                key = array[j];
                i=j-1;
                while(i>-1 && array[i] > key)
                    {
                        array[i+1]=array[i];
                        count++;
                        i=i-1;
                }
            array[i+1]=key;
        }
        System.out.println(count);
    }
}

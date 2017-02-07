import java.io.*;
import java.util.*;
public class SELECTION_SORT {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int j;
		int[] array = new int[size];
		for(int i=0;i<size;i++)
			array[i]=s.nextInt();
		for(int i=0;i<size-1;i++)
		{
			int min = i;
			for( j=i+1;j<size;j++)
			{
				if(array[j]<=array[min])
					min = j;
					
			}
			//Swap
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
			
		}
		for(int i=0;i<size;i++)
			System.out.println(array[i]);
	}

}

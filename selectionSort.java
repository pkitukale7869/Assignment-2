package Practice2;
//import java.io.*;
public class selectionSort
{
 void sort(int arr[])
 {
     int n = arr.length;
     for (int i = 0; i < n-1; i++)
     {
         int minvalue = i;
         for (int j = i+1; j < n; j++)
             if (arr[j] < arr[minvalue])
                 minvalue = j;
         int temp = arr[minvalue];
         arr[minvalue] = arr[i];
         arr[i] = temp;
     }
 }
 void printArray(int arr[])
 {
     int n = arr.length;
     for (int i=0; i<n; ++i)
         System.out.print(arr[i]+" ");
     System.out.println();
 }
 public static void main(String args[])
 { 
	 int arr[] = {63,12,87,36,98,0,1,25,11,2,8,45,65,36,23};
     selectionSort ob = new selectionSort();
     System.out.println("Before Sorting");
     ob.printArray(arr);
     System.out.println("================***********==============");
     ob.sort(arr);
     System.out.println("After Sorting");
     ob.printArray(arr);
 }
}

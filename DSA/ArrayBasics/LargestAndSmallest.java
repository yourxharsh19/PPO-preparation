import java.util.*;
public class LargestAndSmallest
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
         int n=sc.nextInt();
         int arr[] = new int[n];
         int largest=arr[0];
         int smallest=arr[0];
        System.out.println("Enter the elements of array");
         for(int i=0;i<n;i++)
           {
           arr[i]=sc.nextInt();
            if(arr[i]>largest)
          {
             largest=arr[i];
        }
          else if(arr[i]<smallest){
            smallest=arr[i];
           }
        }
        System.out.println("The largest element in the array is: " + largest);
         System.out.println("The smallest element in the array is: " + smallest);
          sc.close();
         }
          }
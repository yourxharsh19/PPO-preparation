import java.util.*;
public class Average
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

       int sum=0;
       double avg;
        System.out.println("Enter the size of the array");
          int n = sc.nextInt();
            int []arr =new int[n];
          System.out.println("Enter the elements of the array");
          for(int i=0;i<n;i++)
            {
          arr[i]=sc.nextInt();
            sum=arr[i]+sum;
            }
           avg=sum/n;
           System.out.println("Average:"+avg);
           sc.close();
              }
         }
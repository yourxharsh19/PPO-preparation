import java.util.*;
class ClosestSum
{
    public static void main(String args[])
    {
       Scanner in= new Scanner (System.in);
       int n=in.nextInt();
       int x=in.nextInt();
       int arr[]= new int[n];
         for(int i=0;i<n;i++)
         {
              arr[i]=in.nextInt();
         }
         int left=0;
         int right =n-1;
         int closestsum = Integer.MAX_VALUE;
            int ans1=0;
            int ans2=0;
            while(left<right)
            {
                int sum = arr[left]+arr[right];
                if(Math.abs(sum-x)<Math.abs(closestsum-x))
                {
                    closestsum=sum;
                    ans1=arr[left];
                    ans2=arr[right];
                }
                if(sum<x)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
            System.out.println("The closest sum is: " + closestsum);
            System.out.println("The closest pair is: " + ans1 + " and " + ans2);
            in.close();
    }
}
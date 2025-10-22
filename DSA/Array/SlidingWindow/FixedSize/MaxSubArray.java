public class MaxSubArray {
    public static void main(String[] args) {
       int arr[]={2,5,1,9,2,8};
       int k=3;
       int windowStart=0;
       int windowEnd=0;
       int sum=0;
       int max=Integer.MIN_VALUE;
       while(windowEnd<arr.length){
           sum=sum+arr[windowEnd];
           if((windowEnd-windowStart+1)==k){
                max=Math.max(max,sum);
                sum=sum-arr[windowStart];
                windowStart++;
                 windowEnd++;
           }
           else if((windowEnd-windowStart+1)<k){
               windowEnd++;
           }
           else{
               windowStart++;
           }
         }
         System.out.println(max);
    }
}
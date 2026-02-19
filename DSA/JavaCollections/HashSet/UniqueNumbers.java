package DSA.JavaCollections.HashSet;
import java.util.*;
public class UniqueNumbers {
      public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            HashSet<Integer> uniqueNumbers = new HashSet<>();
            System.out.println("Enter total numbers :");
            int n = in.nextInt();
            System.out.println("Enter the numbers :");
            for(int i=0; i<n; i++){
                  int num = in.nextInt();
                  uniqueNumbers.add(num);
            }
            Arrays.sort(uniqueNumbers.toArray());
            System.out.println("Unique numbers are :");
            for(int number : uniqueNumbers){
                  System.out.println(number);
            }
            in.close();
      }

}

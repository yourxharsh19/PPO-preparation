package DSA.JavaCollections.HashSet;
import java.util.*;
public class CountCommons {
      public static void main(String args[]){
            Scanner in = new Scanner(System.in);

            int n1=in.nextInt();
            String S1=in.next();
            int n2=in.nextInt();
            String S2=in.next();
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<n2;i++){
                  set.add(S2.charAt(i));
            }
            HashSet<Character> set1=new HashSet<>();
            int count=0;
            for(int i=0;i<n1;i++){
                  if(set.contains(S1.charAt(i))){
                       set1.add(S1.charAt(i)); 
                  }
            }
            count=set1.size();
            System.out.println(count);
            in.close();
      }
      
}

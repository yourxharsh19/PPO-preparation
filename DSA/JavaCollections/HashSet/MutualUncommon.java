package DSA.JavaCollections.HashSet;
import java.util.*;
public class MutualUncommon {
      public static void main(String args[]){
            // Implementation goes here
            Scanner in = new Scanner(System.in);
            int p=in.nextInt();
            int q=in.nextInt();
            int m[]=new int[p];
            for(int i=0;i<p;i++){
                  m[i]=in.nextInt();
              }
            int n[]=new int[q];
            for(int i=0;i<q;i++){
                  n[i]=in.nextInt();
            }
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<p;i++){
                  set.add(m[i]);
            }
            HashSet<Integer> set1=new HashSet<>();
             for(int i=0;i<q;i++){
                  set1.add(n[i]);
            }
            int count1=0;
            for(int i=0;i<q;i++){
                  if(!set.contains(n[i])){
                        count1++;
                  }
            }
            int count2=0;
            for(int i=0;i<p;i++){
                  if(!set1.contains(m[i])){
                        count2++;
                  }
      }
            System.out.println(count1*count2);
            in.close();
      }
}

package DSA.JavaCollections.HashMap;
import java.util.*;
public class CountMostFreq {
       public static void main(String[] args) {
        int arr[]={1,1,3,4,2,3,5,3};
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int a : arr){
            map.put(a ,map.getOrDefault(a,0)+1);
        }
        int mostfreq=-1;
        int max=0;
        for(int key : map.keySet()){
            if(max < map.get(key)){
                max=map.get(key);
                mostfreq=key;
            }
        }
       System.out.println("Frequency Map: " + map);
        System.out.println("Most Frequent Element: " + mostfreq);
        System.out.println("It appears " + max + " times.");
    }
}

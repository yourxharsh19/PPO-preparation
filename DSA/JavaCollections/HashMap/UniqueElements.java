package DSA.JavaCollections.HashMap;

import java.util.HashMap;

public class UniqueElements {
       public static void main(String[] args) {
        int arr[]={1,1,3,4,2,3,5,3};
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int a : arr){
            map.put(a ,map.getOrDefault(a,0)+1);
        }
            System.out.println("Frequency Map: " + map);
            System.out.print("Unique Elements: ");
            for(int key : map.keySet()){
                  if(map.get(key) == 1){
                        System.out.println(key + " ");
                  }
            }
      }
}

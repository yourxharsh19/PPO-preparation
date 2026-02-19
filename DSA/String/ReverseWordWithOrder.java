/*
      * Title: Reverse Each Word in a String While Maintaining Word Order
      * Difficulty: Easy            
      * Tags: String, Array, Iteration     
      * Description:
      * Given a string containing multiple words, reverse each word individually while also reversing the sentence(order).
      * Example:
      * Input: s = "I love Java"
      * Output: "avaj evol i"
      * Explanation: Each word in the string is reversed and the order of the words also reverse.
      * Constraints:
      *  - 1 <= s.length <= 10^5                
      *  - s consists of English letters and spaces only.
      * Note:
      * The solution splits the string into words, reverses each word individually, and joins them back into a single string.
*/
public class ReverseWordWithOrder {
      public static void main(String[] args) {
       String s="i love java";
       
         String[] words = s.split(" ");
         
         String result="";
         for(int i=words.length-1;i>=0;i--){
             String word=words[i];
             String revWord = "";
             
        for(int j=word.length()-1;j>=0;j--){
            revWord +=word.charAt(j);
        }
          result += revWord+" ";   
         }
         System.out.print(result.trim());
    }  
}

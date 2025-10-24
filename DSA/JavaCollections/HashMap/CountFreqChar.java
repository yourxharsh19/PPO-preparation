package DSA.JavaCollections.HashMap;
/*
 * Count the frequency of each character in a string using HashMap
 * Input: "harsh"
 * Output: {h=2, a=1, r=1, s=1}
 *         Character Frequencies:
 *        h → 2
 *       a → 1
 *      r → 1
 *     s → 1
 * 
 * Explanation:
 * We use a HashMap to store each character as a key and its frequency as the value
 * by iterating through the string and updating the count for each character.
 * Finally, we print the frequency map and the character frequencies.
 */
import java.util.HashMap;

public class CountFreqChar {
      public static void main(String[] args) {
        String str = "harsh";
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
        System.out.println("\nCharacter Frequencies:");
        for (char c : freq.keySet()) {
            System.out.println(c + " → " + freq.get(c));
        }
    }
}

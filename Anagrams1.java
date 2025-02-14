import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams1 {
    static HashMap<String, List<String>> map = new HashMap<>();

    public static void check_anagrams(String word) {
        word = word.toLowerCase(); // Convert to lowercase
        char[] new_word = word.toCharArray();
        Arrays.sort(new_word); // Sort characters
        String result = new String(new_word); // Convert sorted char array to string

        // Add word to the correct anagram group
        map.putIfAbsent(result, new ArrayList<>()); // Ensure the key exists
        map.get(result).add(word);
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        for (String word : words) {
            check_anagrams(word);
        }

        // Print grouped anagrams
        System.out.println(new ArrayList<>(map.values()));
    }
}

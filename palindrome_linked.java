import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.stream.Stream;

public class palindrome_linked  {

    public static boolean isPalindrome(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }

        // Find the midpoint using slow and fast pointers
        int slow = 0, fast = 0;
        while (fast < list.size() - 1 && fast + 1 < list.size() - 1) {
            slow++;
            fast += 2;
        }

        // Store second half in another list
        List<Integer> secondHalf = new LinkedList<>(list.subList(slow + 1, list.size()));

        // Reverse the second half
        Collections.reverse(secondHalf);

        // Compare first half with reversed second half
        for (int i = 0; i < secondHalf.size(); i++) {
            if (!list.get(i).equals(secondHalf.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1));
        System.out.println("Is Palindrome: " + isPalindrome(myList));
    }
}

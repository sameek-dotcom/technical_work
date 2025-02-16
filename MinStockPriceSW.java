import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MinStockPriceSW {

    public static int[] findMin(int[] arr, int window) {
        int[] result = new int[arr.length - window + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int index = 0; index < arr.length; index++) {
            // Remove elements out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < index - window + 1) {
                deque.pollFirst();
            }

            // Remove elements from the back of deque 
            while (!deque.isEmpty() && arr[deque.peekLast()] >= arr[index]) {
                deque.pollLast();
            }

            // Add current index to deque
            deque.offerLast(index);

            // Store the minimum element in the result array
            if (index >= window - 1) {
                result[index - window + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] stockPrices = {120, 110, 115, 100, 105, 98, 102};
        int k = 3;
        int[] minPrices = findMin(stockPrices, k);
        System.out.println(Arrays.toString(minPrices)); 
    }
}

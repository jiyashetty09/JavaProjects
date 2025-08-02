import java.util.HashMap;
import java.util.Arrays;

public class LeapCode {

    public int[] Sum(int[] arr1, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            int complement = target - arr1[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr1[i], i);
        }

        return new int[] {}; // No pair found
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 8, 9, 10};// duplicacy is allowed in array
        int target = 6;

        LeapCode obj1 = new LeapCode();
        int[] result = obj1.Sum(arr1, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
            System.out.println("Values: " + arr1[result[0]] + " + " + arr1[result[1]] + " = " + target);
        } else {
            System.out.println("No two numbers found that sum to the target.");
        }
    }
}

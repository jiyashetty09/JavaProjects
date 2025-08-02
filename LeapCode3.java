import java.util.HashMap;
import java.util.Map; // ✅ Required for Map.Entry

public class LeapCode3 {
    public static void main(String[] args) {
        String word = "chandukechachanechandukichachikochandniraatmeinchandikechamachsechutneychatayee";
        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!map.containsValue(word.charAt(i))) {
                map.put(i, word.charAt(i));
            }
        }

        System.out.println("Largest Substring is:");
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            System.out.print(entry.getValue());
        }
    }
}

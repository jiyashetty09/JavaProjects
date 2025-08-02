public class Leapcode7 {
    public static void main(String[] args) {
        String str = "bobad";
        String container = "";

        for (int i = 0; i < str.length(); i++) {
            container += str.charAt(i);

            String reversed = new StringBuilder(container).reverse().toString();

            if (container.length() != 1 && container.equals(reversed)) {
                System.out.println(container + " is the palindrome in the word");
                break;
            }
        }
    }
}

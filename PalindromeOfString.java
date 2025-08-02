public class PalindromeOfString {
    public static void main(String[] args) {
        String name="yaay";
        String Reverse="";
        for(int i= name.length()-1;i>=0;i--){
            Reverse+=name.charAt(i);

        }
        System.out.println(" Reverse of the String is :-"+Reverse);
        if(Reverse.equals(name)){
            System.out.println("Palindrome exists");
        }
        else{
            System.out.println("palindrome doesn't exit");
        }

    }
}

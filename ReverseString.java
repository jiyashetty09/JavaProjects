public class ReverseString {
    public static void main(String[] args) {
        String original="HelloWorld";
        String reverse="";
        for(int i=original.length()-1;i>=0;i--){
            reverse+=original.charAt(i);
        }
        System.out.println("The reversed String is: "+reverse);
    }
    
}

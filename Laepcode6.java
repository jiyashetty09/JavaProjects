public class Laepcode6 {
    public static void main(String[] args) {
        String str="bob";
        String container="";//do not put extra space
        for(int i=str.length()-1;i>=0;i--){
            container+=str.charAt(i);
        }
        if(str.equals(container)){   //use .equals() method because it checks for the contents not the location
            System.out.println("Palindrome Exists!");
        }
        else{
            System.out.println("Palindrome does not Exists!");
        }
    }
}

public class CountOfVowels {
    public static void main(String[] args) {
        String name="Jiya";
        String Save="";
        for(int i=0;i<=name.length()-1;i++){
            char Store=name.charAt(i);
            if(Store=='a'|| Store=='e'|| Store=='i'|| Store=='o'|| Store=='u'||Store=='A'|| Store=='E'|| Store=='I'|| Store=='O'|| Store=='U'){
                 Save+= Store;
            }
        }
        System.out.println("the vowels are "+Save);
        System.out.println("total number of vowels are "+Save.length());
    }
    
}

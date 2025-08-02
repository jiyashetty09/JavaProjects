import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        int sum=0;
        int originalNumber= number;
        int power=String.valueOf(number).length();
        while(number!=0){
            int digit=number%10;
            sum+=Math.pow(digit,power);
            number/=10;
            

        }

        if(originalNumber==sum){
            System.out.println("Armstrong Exists");
        }
        else{
            System.out.println("Arsmstrong Does not Exist");
        }
    }
}

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        boolean isPrime = true;

        if (Number <= 1) {
            isPrime = false;  // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(Number); i++) {
                if (Number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(Number + " is a Prime Number");
        } else {
            System.out.println(Number + " is NOT a Prime Number");
        }
    }
}

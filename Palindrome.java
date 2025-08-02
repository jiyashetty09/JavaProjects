public class Palindrome {
    public static void main(String[] args) {
        int number=101;
        int original=number;//since int is a primitive data type it copies the value inside the number it doesnt make a reference pointing to the number that if the number value changes original variable value will also change it is not klike this
  
        int reversed=0;
        while(number!=0){
            int digit=number%10;  //1st step->   101%10=1
            reversed=reversed*10+digit; //  0*10+1=1
            number/=10;//  101/10=10   
            

            /*
             process 
             now digit=10%10=0
             reversed=1*10+0=10
             number/=10->10/10=1

             step3-
             digit=1%10=1;
             reversed=10*10+1=101
             number/=10  ->1/10=0
             */




        }
         //here == is used because int is primitive data type in java but string is an object in java so == can be saely used for integers 
          if(number==reversed){
            System.out.println("palindrome exists");
          }
          else{
            System.out.println("palindrome does not exists");
          }
    }
}



/*primitive data types
like int,float,boolean,char the value is copies

 non primitive datatypes(also called as reference type)
 like String,array,object the memory address is copied
 
 */

 /*
  Yes, in Java, if a variable is declared outside a block (like if, while, for, or {}), and you change its value inside that block, the change will be reflected outside the block as well — as long as it's the same variable
  */
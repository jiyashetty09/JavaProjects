import java.util.Scanner;

public class Array {
  

   // see this way is incorrectSystem.out.println("The array is of 5 length size"); without an method or a block

   

  
    public static void main(String[] args) {
        int[] arr1=new int[5];
  Scanner sc=new Scanner(System.in);


  //for input

  for(int i=0;i<arr1.length;i++){
    System.out.println("enter the"+(i+1)+" element: ");
    arr1[i]=sc.nextInt();
      
    }

    //for accessing the data
     System.out.println(("printing the array"));
    for(int i=0;i<arr1.length;i++){
      System.out.print(+arr1[i]);
    }
    
}
}

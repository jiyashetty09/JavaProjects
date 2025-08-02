public class ArrayEvenOrOdd {
    public static void main(String[] args) {
        int[] Arr1={1,2,3,5,6,7,8,9,10};
    
    for(int i=0;i<=Arr1.length-1;i++){    // As the 'length' is not a function it is a prroperty of an Array
        int Store=Arr1[i];
        if(Store%2==0){
            System.out.println(Store+" is a an even number");
        }
        else{
            System.out.println(Store+" is an odd number");
        }
    }
}
    
}

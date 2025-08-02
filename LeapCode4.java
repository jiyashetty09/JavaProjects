public class LeapCode4 {
     public static int median(int[] arr1,int[] arr2){
         int[] arr3 =new int[arr1.length+arr2.length];
         int mediantotal=0;
         int i=0;

         while(i<arr1.length){                ///limit become 4 instead of 2
            arr3[i]=arr1[i];
            i++;
         }
     while(i<(2*arr1.length)){                ///limit become 4 instead of 2
        arr3[i]=arr2[i];
        i++;
         }
        
      mediantotal=arr3[0]+arr3[-1];
       int divide=mediantotal/2;
       return divide;
     }
    public static void main(String[] args) {
        int[] arr1={1,2};
        int[] arr2={3,4};
        System.out.println("Median Of The Arrays is");
        median(arr1, arr2);

    }
}

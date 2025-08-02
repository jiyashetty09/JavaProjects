public class RevereseArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
         int[] arr2=new int[5];
         for(int i=arr1.length-1,j=0;i>=0 && j<=arr2.length-1;i--,j++){
            
                arr2[j]=arr1[i];
            
         }
         for(int x=0;x<=arr2.length-1;x++){
            System.out.println(arr2[x]);
         }

    }
}

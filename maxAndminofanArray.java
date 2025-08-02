public class maxAndminofanArray {
    public static void main(String[] args) {
        int[] arr1={55,66,87,100,42};
        int max=arr1[0];
        int min=arr1[0];
        for(int i=1;i<arr1.length;i++){
            if(arr1[i]>max){
                max=arr1[i];
            }
            if(arr1[i]<min){
                min=arr1[i];
            }
        }
        System.out.println("maximum is "+max);
        System.out.println("minimum is "+min);
    }
    
}

public class TargetSumBasic {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,9,2,1,4};
        int sum = 9;
        int counter = 0;
        // Using two elments
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==sum) {
                    counter++;                    
                }
                // System.out.println(arr[i]+" "+arr[j]);
                
            }
            
        }
        System.out.println("Target sum are : "+counter);
    }
    
}

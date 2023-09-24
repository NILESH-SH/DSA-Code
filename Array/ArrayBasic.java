/**
 * PairSum
 */
public class ArrayBasic {
    static void arraysum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of array element : "+sum);
    }
    static void greatestnum(int[] arr){
        int greatest = Integer.MIN_VALUE;
        System.out.println(greatest);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>greatest) {
                greatest=arr[i];
            }
        }
        System.out.println("The greatest element in the array is : "+greatest);
    }
    static void positivenum(int[] arr){
        for (int i : arr) {
            if (i>0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,-5,6,7,-8,9,10};
        // arraysum(arr);
        // greatestnum(arr);
        positivenum(arr);
    }
}
public class FindUnique {
    static int unique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    arr[i]=arr[j]=-1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=-1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,2,9,6,5,9,8,8,0,1};
        System.out.println(unique(arr));
    }
    
}

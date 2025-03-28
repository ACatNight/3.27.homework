public class two {
    public static void main(String[] args) {
        int[] arr = {10 , 23 , 234 , 32};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("最大值:" + max);
        System.out.print("最小值" + min);
    }
}

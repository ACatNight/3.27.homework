import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        int[] arrs = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrs.length; i++) {
            System.out.println("请输入数组");
            int arr = sc.nextInt();
            arrs[i] =arr;
        }
        int sum = 0;
        for (int i = 0; i < arrs.length; i++) {
            sum = sum + arrs[i];
        }
        System.out.println(sum);
    }
}

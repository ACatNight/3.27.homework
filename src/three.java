import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int[] codes = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入当前第" + (i + 1) + "个员工的工号");
            int code = sc.nextInt();
            codes[i] = code;

        }
        sc.close();
        for(int i = 0 , j = codes.length - 1; i < j ; i++,j--){
            int temp = codes[j];
            codes[j] = codes[i];
            codes[i] = temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i] + " ");
        }
        }

    }

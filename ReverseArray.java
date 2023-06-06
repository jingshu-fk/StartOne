import java.util.Arrays;
import java.util.Scanner;

/**
 * ReverseArray
 * @description 输入6个整数，先将其输出然后再将数组倒转，再次输出数组
 * @author shujingping
 * @date 2023/5/9 17:08
 * @version 1.0
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // 使用双指针
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
 

import java.util.Scanner;

/**
 * MinCommonMultiple
 * @description 最小公倍数
 * 最大值和两个数的乘积之间循环，如果既能被m整除也能被n整除
 * @author shujingping
 * @date 2023/5/8 11:16
 * @version 1.0
 */
public class MinCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    public static int getCM(int m, int n) {
        int max = Math.max(m, n);
        for (int i = max; i < m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                return i;
            }
        }
        return m * n;
    }
}
 

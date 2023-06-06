import java.util.Scanner;

/**
 * NumAvg
 * @description 输入任意多个正整数，出现负数代表结束，求平均数
 * @author shujingping
 * @date 2023/5/8 21:32
 * @version 1.0
 */
public class NumAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        double sum = 0;
        double avg = 0;
        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
            cnt++;
        }
        avg = sum / cnt;
        System.out.printf("%.2f%n", avg);
    }
}
 

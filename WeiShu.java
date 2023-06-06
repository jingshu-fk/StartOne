import java.util.Scanner;

/**
 * WeiShu
 * @description 输入一个整数，计算它的位数。如果输入的整数不大于0则输出这个数
 * @author shujingping
 * @date 2023/5/8 21:48
 * @version 1.0
 */
public class WeiShu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <= 0) {
            System.out.println(num);
        } else {
            System.out.println((num + "").length());
        }
    }
}
 

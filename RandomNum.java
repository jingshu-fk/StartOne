import java.util.Random;
import java.util.Scanner;

/**
 * RandomNum
 * @description 开发一个掷骰子游戏，即每次运行程序时，产生一个[1,6]之间的随机整数
 * @author shujingping
 * @date 2023/5/10 16:48
 * @version 1.0
 */
public class RandomNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int seed = scanner.nextInt();
            Random random = new Random(seed);
            System.out.println(random.nextInt(6) + 1);
        }
    }
}
 

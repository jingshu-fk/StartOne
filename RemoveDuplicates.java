import java.util.HashSet;
import java.util.Scanner;

/**
 * RemoveDuplicates
 * @description 去重字符串，使用hashset实现
 * @author shujingping
 * @date 2023/5/16 15:13
 * @version 1.0
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ks = sc.nextLine();
        sc.close();

        HashSet<Character> hs = new HashSet<Character>();
        char[] text = ks.toCharArray();
        for (char t: text) {
            hs.add(t);
        }
        for (char c: hs) {
            System.out.print(c);
        }
    }
}
 

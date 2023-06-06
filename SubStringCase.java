import java.util.ArrayList;
import java.util.Scanner;

/**
 * SubStringCase
 * @description 给定一个字符串s和一个数字n，返回它的所有子串，如果没有返回空
 * @author shujingping
 * @date 2023/5/16 19:40
 * @version 1.0
 */
public class SubStringCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt();
        input.close();

        ArrayList<String> al = new ArrayList<String>();
        if (n > s.length()) {
            System.out.println(" ");
        } else {
            int left = 0;
            while (left < s.length() - n + 1) {
                al.add(s.substring(left, left + n));
                left++;
            }
            System.out.println(al.toString());
        }
    }
}
 

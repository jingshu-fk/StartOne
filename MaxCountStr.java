import java.util.Scanner;

/**
 * MaxCountStr
 * @description 给定一个字符串，随机输入一个字母，判断该字母在这个字符串中出现的次数
 * @author shujingping
 * @date 2023/5/10 16:17
 * @version 1.0
 */
public class MaxCountStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String test = "H e l l o ! n o w c o d e r";
        System.out.println(check(test, word));
    }

//    public static int check(String test, String word) {
//        return test.length() - test.replace(word, "").length();
//    }

    public static int check(String test, String word) {
        int count = 0;
        char c = word.charAt(0);
        for (int i = 0; i < test.length(); i++) {
            if (c == test.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
 

import java.util.Scanner;

/**
 * DymaticString
 * @description 将一个由英文字母组成的字符串转换成从末尾开始每三个字母用逗号分隔的形式。
 * @author shujingping
 * @date 2023/5/10 16:07
 * @version 1.0
 */
public class DynamicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length() - 3; i >= 0; i -= 3) {
            sb.insert(i, ',');
        }
        System.out.println(sb.toString());
    }
}
 

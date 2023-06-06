import java.util.Scanner;

/**
 * CountString
 * @description 输入一行字符串，分别统计出其中英文字母、空格、数字和其它字符的个数
 * @author shujingping
 * @date 2023/5/18 16:20
 * @version 1.0
 */
public class CountString {
    public static void main(String[] args) {
        int numbers = 0;
        int words = 0;
        int space = 0;
        int other = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i= str.length()-1; i>=0; i--) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                words++;
            }else if (Character.isDigit(c)) {
                numbers++;
            }else if (Character.isWhitespace(c)) {
                space++;
            }else {
                other++;
            }
        }

        System.out.println("英文字母"+words+"数字"+numbers+"空格"+space+"其他"+other);
    }
}
 

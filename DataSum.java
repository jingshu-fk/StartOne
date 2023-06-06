/**
 * DataSum
 * @description 有数列：9，99，999，...，9999999999，求和
 * @author shujingping
 * @date 2023/5/8 09:56
 * @version 1.0
 */
public class DataSum {
    public static void main(String[] args) {
        long sum = 0;
        long base = 9;
        for (int i = 0; i < 10; i++) {
            sum += base;
            base = base * 10 + 9;
        }
        System.out.println(sum);
    }
}
 

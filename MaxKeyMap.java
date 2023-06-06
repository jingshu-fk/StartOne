import java.util.*;

/**
 * MaxKeyMap
 * @description 查找map值最大的key
 * @author shujingping
 * @date 2023/5/7 20:18
 * @version 1.0
 */
public class MaxKeyMap {
    public static void main(String[] args) {
//        hashMapMethod();
        sortMethodToAchieve();
    }

    public static void hashMapMethod() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        // 转成字符数组
        char[] arr = str.toCharArray();
        Map<Character, Integer> mp = new HashMap<>(10);
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (mp.get(arr[i]) != null) {
                    mp.put(arr[i], mp.get(arr[i]) + 1);
                } else {
                    mp.put(arr[i], 1);
                }
            }
        }
        // 1 使用for循环直接比较
        findTheMaxKey(mp, arr);
    }

    public static void findTheMaxKey(Map<Character, Integer> mp, char[] arr) {
        // 查找map里最大值的key
        int maxValue = mp.get(arr[0]);
        char maxKey = ' ';
        for (char c : arr) {
            if (maxValue < mp.get(c)) {
                maxValue = mp.get(c);
                maxKey = c;
            }
        }
        System.out.println("出现次数最多的字符是：" + maxKey);
    }

    public static void sortMethodToAchieve() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        // 记录出现次数最多的元素
        char maxValue = 'a';
        // 记录出现次数
        int maxCount = 0;
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            }
            if (arr[i] != arr[i+1]) {
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = arr[i];
                }
                count = 1;
            }
        }
        System.out.println("出现次数最多的字符是：" + maxValue);
    }

}
 

import java.util.Scanner;
public class FirstUniqueCharacterInAString_387 {
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + firstUniqChar(s1));
        System.out.println("Input: " + s2);
        System.out.println("Output: " + firstUniqChar(s2));
        System.out.println("Input: " + s3);
        System.out.println("Output: " + firstUniqChar(s3));
    }
}

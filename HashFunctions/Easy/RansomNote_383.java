package Easy;
import java.util.HashMap;
public class RansomNote_383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aqa";
        String magazine = "aqwvad";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}
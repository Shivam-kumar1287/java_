import java.util.HashMap;
import java.util.Map;
// 09-03-2025
public class q387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;  }

    public static void main(String[] args) {
        q387 solution = new q387();
        System.out.println(solution.firstUniqChar("leetcode")); 
        System.out.println(solution.firstUniqChar("loveleetcode")); 
        System.out.println(solution.firstUniqChar("aabb")); 
    }
}

import java.util.HashSet;
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          while(set.contains(c)){
            set.remove(s.charAt(i));
          }
         set.add(c);

        }
        System.out.println("The length of longest substring without repeating characters is: " + set.size());
        for(char ch:set){
            System.out.print(ch+" ");
        }

    }
}

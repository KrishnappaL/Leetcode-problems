import java.util.HashMap;

public class LargestSubstringPalindrome {
    public static void main(String[] args) {
        longestString("abcacbb");
    }
   static int longestString(String s){
               HashMap<Character, Integer> map = new HashMap<>();

               int l = 0, r = 0,max=0;
               while (r != s.length()) {

                   if ((!map.containsKey(s.charAt(r))) || map.get(s.charAt(r)) < l) {
                       map.put(s.charAt(r), r);
                       max = Math.max(r - l + 1, max);
                       r++;
                   }
                   else
                       l = map.get(s.charAt(r)) + 1;

               }


               return max;
}
}



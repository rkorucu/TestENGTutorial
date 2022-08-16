import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int slow=0;
        int fast=0;
        int max=0;
        HashSet<Character>hashSet=new HashSet<>();

        while (fast<s.length()){
            if (!hashSet.contains(s.charAt(fast))){
                hashSet.add(s.charAt(fast));
                fast++;
                max=Math.max(hashSet.size(),max);
            }else{
                hashSet.remove(s.charAt(slow));
                slow++;
            }
        }
return max;

    }
}

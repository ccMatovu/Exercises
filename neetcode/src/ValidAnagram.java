/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("check");
        System.out.println(isAnagram("good","doog"));
    }
    public static boolean isAnagram(String s, String t) {
        for(int i = 0; i < t.length(); i+=){
            char c = t.charAt(i);
            String sc = Character.toString(c);
            if(s.contains(sc)){
                int begin = s.indexOf(sc);
                s = s.substring(0,begin) + s.substring(begin+1,s.length());
                System.out.println(s);
            }
        }
        if(s.length() == t.length()){
            return true;
        }
        return false;
    }

}

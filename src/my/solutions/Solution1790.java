package my.solutions;

import java.util.Set;
import java.util.stream.Collectors;

public class Solution1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        Set<Character> s1Set = s1.chars().mapToObj(value -> (char) value).collect(Collectors.toSet());
        Set<Character> s2Set = s2.chars().mapToObj(value -> (char) value).collect(Collectors.toSet());
        if (s1.length() <= 3) {
            return s1Set.containsAll(s2Set) && s2Set.containsAll(s1Set);
        }
        char[] s1_chars = s1.toCharArray();
        char[] s2_chars = s2.toCharArray();
        byte difference = 0;
        for (int position = 0; position < s1.length(); position++) {
            if (s1_chars[position] != s2_chars[position]) difference++;
        }
        return difference == 2 && s1Set.containsAll(s2Set) && s2Set.containsAll(s1Set);
    }

    public static void main(String[] args) {
        System.out.println(new Solution1790().areAlmostEqual("aa", "ac"));
        System.out.println(new Solution1790().areAlmostEqual("ac", "ca"));
        System.out.println(new Solution1790().areAlmostEqual("caa", "aaz"));
        System.out.println(new Solution1790().areAlmostEqual("caa", "aac"));
        System.out.println(new Solution1790().areAlmostEqual("abcd", "dcba"));
        System.out.println(new Solution1790().areAlmostEqual("bank", "kanb"));
        System.out.println(new Solution1790().areAlmostEqual("bank", "canb"));
        System.out.println(new Solution1790().areAlmostEqual("attack", "defend"));
        System.out.println(new Solution1790().areAlmostEqual("abca", "abcc"));
        System.out.println(new Solution1790().areAlmostEqual("bankb", "kannb"));
    }
}

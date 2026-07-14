// Last updated: 7/14/2026, 2:21:44 PM
import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> li = new ArrayList<>();

        for (String word : words) {
            if (!li.isEmpty() && isAnagram(li.get(li.size() - 1), word)) {
                continue;
            }
            li.add(word);
        }

        return li;
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

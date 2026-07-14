// Last updated: 7/14/2026, 2:34:15 PM
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Map to hold sorted string -> list of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);  // sorted string
            
            // Add string to corresponding group
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        // Return all grouped lists
        return new ArrayList<>(map.values());
    }
}

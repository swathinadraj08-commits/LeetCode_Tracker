// Last updated: 7/14/2026, 2:20:46 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> indices = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                indices.add(i);
            }
        }
        return indices;
        
    }
}
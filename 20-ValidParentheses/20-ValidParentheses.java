// Last updated: 7/14/2026, 2:34:26 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='['|| ch=='('){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // mismatched bracket
                }
            }
        }
        return stack.isEmpty();
        
    }
}
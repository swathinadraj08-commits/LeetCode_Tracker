// Last updated: 7/27/2026, 11:45:49 AM
1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack=new Stack<>();
4        for(int i=0; i<s.length(); i++){
5            char ch=s.charAt(i);
6            if(ch=='{' || ch=='[' || ch=='('){
7                stack.push(ch);
8            }
9            else{
10                if(stack.isEmpty()){
11                    return false;
12                }
13                else{
14                    char top=stack.pop();
15                    if ((ch == ')' && top != '(') ||
16                       (ch == '}' && top != '{') ||
17                       (ch == ']' && top != '[')){
18                        return false;
19
20                       }
21                    
22                }
23            }
24        }
25        return stack.isEmpty();
26        
27    }
28}
// Last updated: 7/25/2026, 12:33:46 PM
1class Solution {
2    public int romanToInt(String s) {
3        
4        HashMap<Character,Integer> map=new HashMap<>();
5        map.put('I',1);
6        map.put('V',5);
7        map.put('X',10);
8        map.put('L',50);
9        map.put('C',100);
10        map.put('D',500);
11        map.put('M',1000);
12        int res=0;
13        for(int i=0; i<s.length(); i++){
14            int c=map.get(s.charAt(i));
15            if(i<s.length()-1 && c<map.get(s.charAt(i+1))){
16                 res=res-c;
17            }
18            else{
19                res=res+c;
20            }
21
22        }
23        return res;
24
25
26
27        
28    }
29}
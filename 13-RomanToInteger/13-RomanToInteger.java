// Last updated: 7/14/2026, 2:34:31 PM
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mapp=new HashMap<>();
        mapp.put('I',1);
        mapp.put('V',5);
        mapp.put('X',10);
        mapp.put('L',50);
        mapp.put('C',100);
        mapp.put('D',500);
        mapp.put('M',1000);
        int result=0;
        

        for(int i=0; i<s.length(); i++){
            int cur=mapp.get(s.charAt(i));
            if(i<s.length()-1 && cur<mapp.get(s.charAt(i+1))){
                result-=cur;
            }
            else{
                result+=cur;
            }
        }
        return result;

        
    }
}
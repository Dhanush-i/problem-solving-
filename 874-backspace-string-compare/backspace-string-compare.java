class Solution {
    private String build(String str){
        Stack<Character> st=new Stack<>();
        for(char c:str.toCharArray()){
            if(c!='#')  st.push(c);
            else if(!st.isEmpty())
                st.pop();
        }
        StringBuilder ns=new StringBuilder();
        for(char c:st)
            ns.append(c);
        return ns.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        if(build(s).equals(build(t)))   return true;
        return false;
    }
}
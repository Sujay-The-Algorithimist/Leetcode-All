class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer>st=new Stack();
        int cnt=1;
        String ans="";
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                st.push(cnt);

                if(cnt!=1)
                ans=ans+c;

                cnt++;
            }
            else if(c==')')
            {
                if(!st.isEmpty())
                {
                    int x=st.pop();
                    if(x!=1)
                    ans=ans+c;
                    else
                    cnt=1;
                }
                
            }
        }
        return ans;
    }
}
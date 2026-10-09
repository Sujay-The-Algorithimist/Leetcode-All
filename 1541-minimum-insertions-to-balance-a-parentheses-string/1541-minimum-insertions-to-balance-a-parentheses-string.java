
import java.util.Stack;

class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int curly = 0;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {

                if (curly == 1) {
                    cnt++; // Insert one ')' to complete the pair
                    curly = 0;

                    if (!st.isEmpty())
                    st.pop();
                    else
                    cnt++; // Insert '(' for the unmatched ')'
                }
                st.push('(');
            } else {
                curly++;

                if (curly == 2) {
                    curly = 0;

                    if (!st.isEmpty())
                    st.pop();
                    else
                    cnt++; // Insert missing '('
                }
            }
        }

        if (curly == 1) {
            cnt++; // Insert the second ')'

            if (!st.isEmpty())
            st.pop();
            else
            cnt++; // Insert missing '('
        }

        cnt += 2 * st.size();

        return cnt;
    }
}
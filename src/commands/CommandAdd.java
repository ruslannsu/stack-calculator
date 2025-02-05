package commands;

import java.util.Stack;

public class CommandAdd extends Command {
    @Override
    void execute(Stack <Integer> st) {
        int res = st.pop() + st.pop();
        st.push(res);
    }
}

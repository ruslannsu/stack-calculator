package commands;

import java.util.Stack;

public class CommandAdd extends Command {
    @Override
    public void execute(Stack <Integer> st) {
        int res = st.pop() + st.pop();
        st.push(res);
        System.out.println("this is add command");
    }
}

package commands;

import java.util.Stack;

public class CommandPush extends Command {
    @Override
    public void execute(Stack<Double> st, String[] params) {
        st.push(Double.parseDouble(params[0]));
    }
}

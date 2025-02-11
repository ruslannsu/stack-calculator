package commands;

import java.util.ArrayList;
import java.util.Stack;

public class CommandPush extends Command {
    @Override
    public void execute(Stack<Double> st, ArrayList<String> params) {
        st.push(Double.parseDouble(params.getFirst()));
    }
}

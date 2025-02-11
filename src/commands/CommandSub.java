package commands;

import java.util.ArrayList;
import java.util.Stack;

public class CommandSub extends Command {
    @Override
    public void execute(Stack<Double> st, ArrayList<String> params) {
        double res = st.pop() - st.pop();
        st.push(res);
    }
}

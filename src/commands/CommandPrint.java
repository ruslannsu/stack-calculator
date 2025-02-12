package commands;

import java.util.ArrayList;
import java.util.Stack;

public class CommandPrint extends Command {
    @Override
    public void execute(Stack<Double> st, ArrayList<String> params) {
        double buffer = st.pop();
        System.out.print(buffer);
        st.push(buffer);
    }
}

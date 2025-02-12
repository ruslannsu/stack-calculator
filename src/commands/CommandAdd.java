package commands;

import commands.exceptions.IncorrectConfigLogic;

import java.util.ArrayList;
import java.util.Stack;

public class CommandAdd extends Command {
    @Override
    public void execute(Stack <Double> st, ArrayList<String> params) {
        try {
            double res = st.pop() + st.pop();
            st.push(res);
        }
        catch (RuntimeException ex) {
            throw new IncorrectConfigLogic();
        }
    }
}

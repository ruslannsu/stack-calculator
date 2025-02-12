package commands;

import commands.exceptions.IncorrectConfigLogic;

import java.util.ArrayList;
import java.util.Stack;

public class CommandMult extends Command{
    @Override
    public void execute(Stack<Double> st, ArrayList<String> params) {
        try {
            st.push(st.pop() * st.pop());
        }
        catch (Exception ex) {
            throw new IncorrectConfigLogic();
        }
    }
}

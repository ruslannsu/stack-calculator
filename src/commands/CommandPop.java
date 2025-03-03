package commands;

import command_parser.exceptions.BadCountArgs;
import commands.exceptions.IncorrectConfigLogic;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class CommandPop extends Command{
    @Override
    public void execute(Environment env, ArrayList<String> params) {
        Stack<Double> st = env.getStack();
        if (!Objects.equals(params.getFirst(), "no params")) {
            throw new BadCountArgs();
        }
        if (st.isEmpty()) {
            throw new IncorrectConfigLogic();
        }
        st.pop();
    }
}

package commands;

import command_parser.exceptions.BadCountArgs;
import commands.exceptions.BadCommandArgs;
import java.util.ArrayList;
import java.util.Stack;

public class CommandPush extends Command {
    @Override
    public void execute(Environment env, ArrayList<String> params) {
        Stack<Double> st = env.getStack();
        if (params.size() != 1) {
            throw new BadCountArgs();
        }
        try {
            st.push(Double.parseDouble(params.getFirst()));
        }
        catch (Exception ex) {
            throw new BadCommandArgs();
        }
    }
}

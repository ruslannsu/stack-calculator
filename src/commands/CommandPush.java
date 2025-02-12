package commands;

import command_parser.exceptions.BadCountArgs;
import commands.exceptions.BadCommandArgs;
import java.util.ArrayList;
import java.util.Stack;

public class CommandPush extends Command {
    @Override
    public void execute(Stack<Double> st, ArrayList<String> params) {
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

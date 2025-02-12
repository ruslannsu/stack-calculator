package commands;

import command_parser.exceptions.BadCountArgs;
import commands.exceptions.IncorrectConfigLogic;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class CommandPrint extends Command {
    @Override
    public void execute(Stack<Double> st, ArrayList<String> params) {
        if (!Objects.equals(params.getFirst(), "no params")) {
            throw new BadCountArgs();
        }
        if (st.isEmpty()) {
            throw new IncorrectConfigLogic();
        }
        double buffer = st.pop();
        System.out.println(buffer);
        st.push(buffer);
    }
}

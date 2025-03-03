package commands;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class CommandDefine extends Command {
    @Override
    public void execute(Environment env, ArrayList<String> params) {
        env.getParams().put(params.getFirst(), Double.parseDouble(params.get(1)));
    }
}

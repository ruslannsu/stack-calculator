package commands;

import java.util.ArrayList;
import java.util.Stack;

public abstract class Command {
    public abstract void execute(Environment env, ArrayList<String> params);
}




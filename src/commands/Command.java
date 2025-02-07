package commands;

import java.util.Hashtable;
import java.util.Stack;

public abstract class Command {
    public abstract void execute(Stack<Double> st, String[] params);
}




package commands;

import java.util.ArrayList;
import java.util.Stack;

public abstract class Command {
    public abstract void execute(Stack<Double> st, ArrayList<String> params);
}




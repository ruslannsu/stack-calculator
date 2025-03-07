package commands;

import java.util.Hashtable;
import java.util.Stack;

public class Environment {
    Stack<Double> stack_;
    Hashtable<String, Double> defined_params_;
    public Environment() {
        defined_params_ = new Hashtable<>();
        stack_ = new Stack<>();
    }
    public Stack<Double> getStack() {
        return stack_;
    }
    public Hashtable<String, Double> getParams(){ return defined_params_;}
}

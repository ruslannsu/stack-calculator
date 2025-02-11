package calculator;

import command_parser.CommandLine;
import command_parser.CommandParser;
import commands.Command;
import creator.Creator;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Calculator {
    private String start_params_file_;
    CommandParser commands_list_;
    private Hashtable<String, Double> define_params_;
    public Calculator(String[] start_params_file) throws Exception {
        start_params_file_ = start_params_file[0];
        commands_list_ = new CommandParser(start_params_file_);
    }
    public void run() throws Exception {
        ArrayList<CommandLine> command_lines = commands_list_.getCommands();
        Stack<Double> calc_stack = new Stack<Double>();
        for (int i = 0; i != command_lines.toArray().length; ++i) {
            Creator creator = new Creator();
            Command command = creator.create(command_lines.get(i).command_name_);
            command.execute(calc_stack, command_lines.get(i).command_params_);
        }
    }
}

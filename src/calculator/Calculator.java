package calculator;

import command_parser.CommandParser;
import commands.Command;
import creator.Creator;

import java.util.Hashtable;

public class Calculator {
    private String start_params_file_;
    CommandParser commands_list_;
    private Hashtable<String, Double> define_params_;
    public Calculator(String[] start_params_file) throws Exception {
        start_params_file_ = start_params_file[0];
        commands_list_ = new CommandParser(start_params_file_);
    }
    void run() throws Exception {

    }
}

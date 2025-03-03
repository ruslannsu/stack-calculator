package calculator;

import command_parser.CommandLine;
import command_parser.CommandParser;
import commands.Command;
import commands.Environment;
import creator.Creator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;

public class Calculator {
    private String start_params_file_;
    CommandParser commands_list_;
    Environment env_;
    public Calculator(String[] start_params_file) throws Exception {
        start_params_file_ = start_params_file[0];
        commands_list_ = new CommandParser(start_params_file_);
        env_ = new Environment();
        env_.getParams().put("a", 10.0);
    }
    public void run() throws Exception {
        ArrayList<CommandLine> command_lines = commands_list_.getCommands();
        for (int i = 0; i != command_lines.toArray().length; ++i) {
            Creator creator = new Creator();
            Command command = creator.create(command_lines.get(i).command_name_);
            ArrayList<String> command_defined = new ArrayList<>();
            for (int j = 0; j != command_lines.get(i).command_params_.toArray().length; ++j) {
                if (env_.getParams().get(command_lines.get(i).command_params_.get(j)) != null) {
                    command_defined.add(String.valueOf(env_.getParams().get(command_lines.get(i).command_params_.get(j))));
                }
                else {
                    command_defined.add(command_lines.get(i).command_params_.get(j));
                }
            }
            command.execute(env_, command_defined);

        }
    }
}

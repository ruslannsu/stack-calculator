package command_parser;

import command_parser.exceptions.CommandIsEmpty;
import java.util.ArrayList;

public class CommandLine {
    public String command_name_;
    public ArrayList<String> command_params_;
    CommandLine(String file_line) {
        if (file_line.isEmpty()) {
            throw new CommandIsEmpty();
        }
        boolean got_name = false;
        int last_index = 0;
        command_params_ = new ArrayList<>();
        for (int i = 0; i != file_line.length(); ++i) {
            if ((i == file_line.length() - 1) && (!got_name)) {
                command_name_ = file_line.substring(0, i + 1);
                command_params_.add("no params");
                break;
            }
            if ((file_line.charAt(i) == ' ') && (!got_name)) {
                command_name_ = file_line.substring(0, i);
                last_index = i;
                got_name = true;
            } else if (file_line.charAt(i) == ' ') {
                command_params_.add(file_line.substring(last_index + 1, i));
                last_index = i;
            }
            if (i == file_line.length() - 1) {
                command_params_.add(file_line.substring(last_index + 1, i + 1));
            }
        }
    }
}

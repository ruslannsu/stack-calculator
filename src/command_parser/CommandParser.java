package command_parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class CommandParser {
    private ArrayList<CommandLine> command_lines_;
    public CommandParser(String file_path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(file_path));
        command_lines_ = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            CommandLine command_line = new CommandLine(line);
            command_lines_.add(command_line);
            line = reader.readLine();
        }
        reader.close();
    }
    public ArrayList getCommands() {
        return command_lines_;
    }
}

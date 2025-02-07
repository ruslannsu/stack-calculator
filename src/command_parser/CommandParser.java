package command_parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CommandParser {
    private String[] commands_list_;
    public CommandParser(String file_path) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(file_path));
        String line = reader.readLine();
        while (line != null) {
            CommandLine command_line = new CommandLine(line);
            command_line.print();
            line = reader.readLine();
        }
        reader.close();
    }
    public String[] getCommands() {
        return commands_list_;
    }
}

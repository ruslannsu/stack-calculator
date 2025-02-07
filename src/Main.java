import java.io.*;
import java.util.Properties;
import java.util.Stack;

import command_parser.CommandParser;
import creator.*;
import commands.*;

public class Main  {
    public static void main(String[] args) throws Exception {
        CommandParser parser = new CommandParser("src/commands.txt");
    }
}
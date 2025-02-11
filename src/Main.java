import java.io.*;
import java.util.Properties;
import java.util.Stack;

import calculator.Calculator;
import command_parser.CommandParser;
import creator.*;
import commands.*;

public class Main  {
    public static void main(String[] args) throws Exception {
        String[] str = {"src/commands.txt"};
        Calculator calc = new Calculator(str);
        calc.run();
    }
}
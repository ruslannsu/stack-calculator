package commands.exceptions;

import commands.Command;

import java.util.ArrayList;

public class BadCommandArgs extends RuntimeException {
    public BadCommandArgs() {
        super("Incorrect command args");
    }
}

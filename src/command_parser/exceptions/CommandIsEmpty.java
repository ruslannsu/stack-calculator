package command_parser.exceptions;

public class CommandIsEmpty extends RuntimeException {
    public CommandIsEmpty() {
        super("Command is empty, try again");
    }
}

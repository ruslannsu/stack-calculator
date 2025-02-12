package command_parser.exceptions;

public class CommandNameNotFound extends RuntimeException {
    public CommandNameNotFound() {
        super("Command name not found, try again");
    }
}

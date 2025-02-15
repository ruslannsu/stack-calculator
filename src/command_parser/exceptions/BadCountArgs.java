package command_parser.exceptions;

public class BadCountArgs extends RuntimeException {
    public BadCountArgs() {
        super("Too many or too few args to command, please change config file or input");
    }
}

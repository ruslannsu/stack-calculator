package commands.exceptions;

public class IncorrectConfigLogic extends RuntimeException {
    public IncorrectConfigLogic() {
        super("This command input is incorrect");
    }
}

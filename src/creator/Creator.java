package creator;
import commands.*;

import java.io.FileInputStream;
import java.util.Properties;

public class Creator {
    private Properties properties_;
    public Creator() throws Exception {
        FileInputStream input_stream= new FileInputStream("src/config.properties");
        properties_ = new Properties();
        properties_.load(input_stream);
    }
    public Command create(String command) throws Exception {
        return (Command) Class.forName(properties_.getProperty(command)).getDeclaredConstructor().newInstance();
    }
}

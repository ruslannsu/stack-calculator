package calculator;

import java.util.Hashtable;

public class Calculator {
    private String[] start_params_;
    private String[] commands_list_;
    private Hashtable<String, Double> define_params_;
    public Calculator(String[] start_params) {
        start_params_ = start_params;
    }
    void run() {
        if (start_params_.length == 0) {

        }
    }
}

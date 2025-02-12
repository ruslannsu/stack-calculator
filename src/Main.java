import calculator.Calculator;

public class Main  {
    public static void main(String[] args) throws Exception {
        String[] str = {"src/commands.txt"};
        Calculator calc = new Calculator(str);
        calc.run();
    }
}
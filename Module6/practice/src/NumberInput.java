import javax.swing.*;
public class NumberInput{
    public static void main(String[] args){
        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 10;
//        all JOptionPane inputs are strings to start
        inputString = JOptionPane.showInputDialog(null, "Enter a number");
//        parseInt to convert and store as an Int
//        var = Class.staticMethod() format
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " +
                FACTOR + " = " + result);
    }
}

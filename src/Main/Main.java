
package Main;

import Calculator.AddCalculator;
import Calculator.Calculator;
import Operator.Operator;
import Operator.OperatorType;
import Type.DoubleType;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        AddCalculator c = new AddCalculator();
        try {
            System.out.println(c.calculate(new Operator("+", OperatorType.BINARY), new DoubleType(2), new DoubleType(2)));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package Calculator;

import Type.Type;
import Operator.Operator;
import Type.DoubleType;
import Type.IntegerType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddCalculator implements Calculator {

    public Type calculate(Operator operator, Type p0, Type p1) throws Exception {
        for (Method method : AddCalculator.class.getDeclaredMethods()) {
            if (getMethodSignature(method).equals(getSignature(operator, p0, p1))) {
                try {
                    return (Type) method.invoke(this, p0, p1);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(AddCalculator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        throw new Exception ("No suitable methods");
    }
    
    public Integer add(IntegerType arg0, IntegerType arg1) {
        return arg0.getValue() + arg1.getValue();
    }

    public Double add(IntegerType arg0, DoubleType arg1) {
        return arg0.getValue() + arg1.getValue();
    }

    public Double add(DoubleType arg0, IntegerType arg1) {
        return arg0.getValue() + arg1.getValue();
    }

    public Double add(DoubleType arg0, DoubleType arg1) {
        return arg0.getValue() + arg1.getValue();
    }

    private String getMethodSignature(Method method) {
        String result = "";
        for (Class<?> parameter : method.getParameterTypes()) {
            result += parameter.getSimpleName();
        }
        return result;
    }

    private String getSignature(Operator operator, Type p0, Type p1) {
        return operator.getSymbol() + p0.getClass() + p1.getClass();
    }
}

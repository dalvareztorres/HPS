package Calculator;

import Type.Type;
import Operator.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddCalculator implements Calculator {

    public Type calculate(Operator operator, Type p0, Type p1) {
        for (Method method : AddCalculator.class.getDeclaredMethods()) {
            if (getMethodSignature(method).equals(getSignature(operator, p0, p1))) {
                try {
                    return (Type) method.invoke(this, p0, p1);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(AddCalculator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    
    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }

    public Double add(Integer arg0, Double arg1) {
        return arg0 + arg1;
    }

    public Double add(Double arg0, Integer arg1) {
        return arg0 + arg1;
    }

    public Double add(Double arg0, Double arg1) {
        return arg0 + arg1;
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

package Nodes;

import Operator.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberCalculator {

    public Type calculate(Operator operator, Type p0, Type p1) {
        for (Method method : NumberCalculator.class.getDeclaredMethods()) {
            if (getMethodSignature(method).equals(getSignature(operator, p0, p1))) {
                try {
                    return (Type) method.invoke(this, p0, p1);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(NumberCalculator.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }

    public String getMethodSignature(Method method) {
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

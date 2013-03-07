package Calculator;

import Type.DoubleType;
import Type.IntegerType;
import Type.Type;

public class MultiplyCalculator implements Calculator {

    
    @Override
    public Type calculate(IntegerType arg0, IntegerType arg1) {
        return new IntegerType(arg0.getValue() * arg1.getValue());
    }

    @Override
    public Type calculate(IntegerType arg0, DoubleType arg1) {
        return new DoubleType(arg0.getValue() * arg1.getValue());
    }

    @Override
    public Type calculate(DoubleType arg0, IntegerType arg1) {
        return new DoubleType(arg0.getValue() * arg1.getValue());
    }

    @Override
    public Type calculate(DoubleType arg0, DoubleType arg1) {
        return new DoubleType(arg0.getValue() * arg1.getValue());
    }

}

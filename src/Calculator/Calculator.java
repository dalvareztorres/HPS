
package Calculator;

import Type.DoubleType;
import Type.IntegerType;
import Type.Type;

public interface Calculator {
    
    public Type calculate(IntegerType arg0, IntegerType arg1);
    public Type calculate(IntegerType arg0, DoubleType arg1);
    public Type calculate(DoubleType arg0, IntegerType arg1);
    public Type calculate(DoubleType arg0, DoubleType arg1);
}

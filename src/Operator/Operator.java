package Operator;

import java.util.HashMap;

public class Operator{
    
    public static final Operator ADD = new Operator("Add", "+", OperatorType.BINARY);
    public static final Operator MULTIPLY = new Operator("Multiply", "*", OperatorType.BINARY);
    
    private String name;
    private String symbol;
    private OperatorType operatorType;

    private Operator (String name, String symbol, OperatorType operatorType){
        this.name = name;
        this.symbol = symbol;
        this.operatorType = operatorType;
    }
    
    public String getName(){
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

}

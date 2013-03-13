package Operator;

import java.util.ArrayList;

public class Operator{
    
    public static final Operator ADD = new Operator("Add", "+", OperatorType.BINARY, 0);
    public static final Operator MULTIPLY = new Operator("Multiply", "*", OperatorType.BINARY, 1);
    
    private String name;
    private String symbol;
    private OperatorType operatorType;
    private int precedence;

    private Operator (String name, String symbol, OperatorType operatorType, int precedence){
        this.name = name;
        this.symbol = symbol;
        this.operatorType = operatorType;
        this.precedence = precedence;
    }
    
    public String getName(){
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }
    
    public int getPrecedence(){
        return this.precedence;
    }
    
    public static ArrayList<String> getOperatorSymbols(){
        ArrayList<String> operatorSymbols = new ArrayList<>();
        operatorSymbols.add(Operator.ADD.getSymbol());
        operatorSymbols.add(Operator.MULTIPLY.getSymbol());
        return operatorSymbols;
    }

}

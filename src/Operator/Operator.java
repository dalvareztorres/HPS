package Operator;

import java.util.HashMap;

public class Operator{
    
    private String symbol;
    private OperatorType operatorType;
    private static HashMap <String, Operator> operatorMap;
    
    static{
        Operator.operatorMap = new HashMap<>();
        Operator.operatorMap.put("+", new Operator("+", OperatorType.BINARY));
        Operator.operatorMap.put("-", new Operator("-", OperatorType.BINARY));
        Operator.operatorMap.put("*", new Operator("*", OperatorType.BINARY));
        Operator.operatorMap.put("/", new Operator("/", OperatorType.BINARY));        
    }
    
    private Operator (String symbol, OperatorType operatorType){
        this.symbol = symbol;
        this.operatorType = operatorType;
    }
    
    public static Operator get (String symbol){
        return operatorMap.get(symbol);
    }

    public String getSymbol() {
        return symbol;
    }

}

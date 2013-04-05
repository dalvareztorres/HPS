package Parser;

import Operator.Operator;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Parser {

    private Queue<String> outputQueue;
    private Stack operatorStack;

    public Parser() {
        this.outputQueue = new LinkedList<>();
        this.operatorStack = new Stack();
    }

    public static boolean isNumeric(String str) {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

    public static boolean isOperator(String str) {
        ArrayList<String> operatorList = Operator.getOperatorSymbols();
        return (operatorList.contains(str));
    }

    public static boolean isLeftParenthesis(String str) {
        return str.equals("(");
    }

    public static boolean isRightParenthesis(String str) {
        return str.equals(")");
    }
}

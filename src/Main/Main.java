
package Main;

import Node.ConstantNode;
import Node.OperationNode;
import Operator.Operator;
import Parser.Parser;
import Type.IntegerType;


public class Main {

    public static void main(String[] args) {
        OperationNode root = new OperationNode(Operator.MULTIPLY);

        root.insert(new ConstantNode(new IntegerType(2)));
        
        root.insert (new OperationNode(Operator.ADD));
        
        root.insert(new ConstantNode(new IntegerType(2)));
        root.insert(new ConstantNode(new IntegerType(2)));

        
        
        System.out.println(root.evaluate().toString());
        System.out.println(root.toString());
        
        Parser parser = new Parser();
        
        parser.parse("2+2-4*(2+2)-9");
        
    }
}

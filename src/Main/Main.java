
package Main;

import Node.ConstantNode;
import Node.OperationNode;
import Operator.Operator;
import Type.IntegerType;


public class Main {

    public static void main(String[] args) {
        OperationNode root = new OperationNode(Operator.MULTIPLY);
        
        root.insert(new ConstantNode(new IntegerType(2)));
        
        root.insert(new OperationNode(Operator.ADD));
        root.insert(new ConstantNode(new IntegerType(2)));
        root.insert(new ConstantNode(new IntegerType(2)));
        
        System.out.println(root.evaluate().toString());
        System.out.println(root.toString());
        
    }
}


package Main;

import Node.ConstantNode;
import Node.OperationNode;
import Operator.Operator;
import Type.IntegerType;


public class Main {

    public static void main(String[] args) {
        OperationNode root = new OperationNode(Operator.MULTIPLY);


        
        OperationNode subRootLeft = new OperationNode(Operator.ADD);
        
        subRootLeft.insert(new ConstantNode(new IntegerType(2)));
        subRootLeft.insert(new ConstantNode(new IntegerType(2)));
        
        OperationNode subRootRight = new OperationNode(Operator.ADD);
        
        subRootRight.insert(new ConstantNode(new IntegerType(2)));
        subRootRight.insert(new ConstantNode(new IntegerType(2)));

                
        root.insert(subRootLeft);
        root.insert(subRootRight);
        
        
        System.out.println(root.evaluate().toString());
        System.out.println(root.toString());
        
    }
}

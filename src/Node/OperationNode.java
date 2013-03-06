package Node;

import Operator.Operator;
import Type.Type;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OperationNode extends Node {
    
    private Operator operator;
    private Node leftChild;
    private Node rightChild;
    
    public OperationNode (Operator operator){
        this.operator = operator;
        this.leftChild = null;
        this.rightChild = null;
    }

    public boolean insert(Node node) {
        if (isChildNull(this.leftChild)) {
            this.leftChild = node;
            return true;
        }
        if (isChildNull(this.rightChild)) {
            this.rightChild = node;
            return true;
        }
        if (this.rightChild instanceof OperationNode) {
            return ((OperationNode) this.rightChild).insert(node);
        }
        return false;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    private boolean isChildNull(Node child) {
        if (child == null) {
            return true;
        }
        return false;
    }

    @Override
    public Type evaluate() {
        try {
            return useCalculator();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(OperationNode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        throw new RuntimeException("Unable to use calculator");
    }
    
    public Type useCalculator () throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException{
        Class calculatorClass = Class.forName("Calculator."+this.operator.getName()+"Calculator");
        Object calculatorInstance = calculatorClass.newInstance();
        Method method = calculatorClass.getDeclaredMethod("calculate", getParameterClasses());
        return (Type) method.invoke(calculatorInstance, getParameters());
    }

    private Class[] getParameterClasses() {
        return new Class[] {this.leftChild.evaluate().getClass(), this.rightChild.evaluate().getClass(), };
    }

    private Object[] getParameters() {
        return new Object[] {this.leftChild.evaluate(), this.rightChild.evaluate()};
    }
}

package Node;

import Type.Type;

public class ConstantNode extends Node {
    
    private Type value;
    
    public ConstantNode(Type value){
        this.value = value;
    }

    @Override
    public Type evaluate() {
        return this.value;
    }
    
    @Override    
    public String toString(){
        return String.valueOf(this.evaluate().toString());
    }

}

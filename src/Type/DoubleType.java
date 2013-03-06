
package Type;

public class DoubleType implements Type{
    private double value;

    public DoubleType(double value) {
        this.value = value;
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public String toString (){
        return String.valueOf(this.value);
    }
    
}

import java.util.LinkedList;

/**
 * @author Jesus Vazquez
 * 
 */

 /**
  * This stack of doubles has the methods StackofDoubles, isEmpty, push and peek. This will help us compile
  * and implement the PostfixCalculator.
  */
public class StackOfDoubles implements Stack<Double> {

    LinkedList<Double> mylist;
    /**
     * This only creates a new linked list of doubles.
     */
    public StackOfDoubles() {
        this.mylist = new LinkedList<Double>();
    }

    /**
     * this only says it's empty
     */
    public boolean isEmpty() {
        return this.mylist.isEmpty();
    }
    

    /**
     * This takes a double and pushes it to the list.
     */
    public void push(Double val) {
        this.mylist.push(val);
    }

    /**
     * This will remove the first value.
     */
    public Double pop() {
        return this.mylist.pop();
    }

    /**
     * This will only look at the first value.
     */
    public Double peek() {
        return this.mylist.peek();
    }
}
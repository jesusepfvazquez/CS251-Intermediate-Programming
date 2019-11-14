import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

/**
 * @author Jesus Vazquez
 */


 /**
  * This is a postfix calculator which takes a series of operators and numbers and returns the answer to the calculation.
  * for example: Yoiu might want to calculate the 1 2 + =, so post fix calculator should take it and recognize that you
  * want to add 1 and 2 and give an answer of 3. 
  */
public class PostfixCalculator{

    private StackOfDoubles stack;
    private Map<String, Operator> operatorMap;
    private Collection < Double > numbers = new Set < >();

    /**
     * This is the post fix calculator method. Here we are assigning the addition and all of the operators to the map.
     * Not returning anything
     */
    public PostfixCalculator(){
        
        this.stack = new StackOfDoubles();
        this.operatorMap= new HashMap<>();

        operatorMap.put("+", new Addition());
        operatorMap.put("add", new Addition());
        operatorMap.put("-", new Subtraction());
        operatorMap.put("sub", new Subtraction());
        operatorMap.put("*", new Multiplication());
        operatorMap.put("mult", new Multiplication());
        operatorMap.put("/", new Division());
        operatorMap.put("div", new Division());
        operatorMap.put("=", new Print());
        operatorMap.put("print", new Print());
    }

    /**
     * Here we are making an addition class to sum the numbers
     */
    private class Addition implements Operator{

        public int numArgs(){
            return 2;
        }

        public double eval(List<Double> args){
            return args.get(0) + args.get(1);
        }
    }

    /**
     * Here we are making an subtraction class to subtract the numbers
     */
    private class Subtraction implements Operator{

        public int numArgs(){
            return 2;
        }
        
        public double eval(List<Double> args){
            return args.get(0) - args.get(1);
        }
    }

    /**
     * Here we are making a multiplicatio class to multiply the numbers
     */
    private class Multiplication implements Operator{

        public int numArgs(){
            return 2;
        }
        
        public double eval(List<Double> args){
            return args.get(0)*args.get(1);
        }
    }

    /**
     * Here we are making a division class to subtract the numbers
     */
    private class Division implements Operator{

        public int numArgs(){
            return 2;
        }
        
        public double eval(List<Double> args){
            return args.get(0) / args.get(1);
        }
    }

    /**
     * Here we make a print class to print the result.
     */
    private class Print implements Operator{

        public int numArgs(){
            return 1;
        }
        
        public double eval(List<Double> args){
            System.out.println(String.valueOf(args.get(0)));
            return args.get(0);
        }
    }    

    /**
     * The storeOperand method takes a double and pushes it onto the operand stack. It does not return anything.
     * @param myItem is the double
     */
    public void storeOperand(double myItem) {
        stack.push(myItem);
    }

    /**
     * Here we take the instance of the operator we are dealing with. We then get the number of arguments it needs 
     * to be able to pop them from the stack and push them to the list. We make the calulation and push it to the stack
     * @param key this refers to the operator 
     */
    public void evaluateOperator(String key) {

        Operator op = operatorMap.get(key);
        LinkedList<Double> myList = new LinkedList<Double>();

        for (int x = 0; x < op.numArgs(); x++){
            myList.push(stack.pop());
        }

        stack.push(op.eval(myList));

    }
}
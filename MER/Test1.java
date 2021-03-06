import java.util.Scanner;    //imports scanners
import java.util.Stack;
import javax.swing.JOptionPane;

public class Test1{

    // instance variables
    private Stack < Double > nums;
    private Stack < String > ops; 
    String list;

        // constructor
    public Test1()
    {
        nums = new Stack < Double > ();
        ops = new Stack < String > ();
    }

    // methods

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static boolean isValidOp(String str) {
        return (str == "(" || str == ")" || str == "^" || str == "*" || str == "/" || str == "+" || str == "-");
    }

    public int prec(String str) {
        if (str == "(" || str == ")")
            return 4;
        if (str == "^")
            return 3;
        if (str == "*" || str == "/")
            return 2;
        if (str == "+" || str == "-")
            return 1;
        else
            return -1;
    }

    public double applyOperator(double left, String op, double right) {
        if (op == "+") {
            return (left + right);
        }
        if (op == "-") {
            return (left - right);
        }
        if (op == "*") {
            return (left * right);
        }
        if (op == "/") {
            return (left / right);
        }
        if (op == "^") {
            return  Math.pow(left, right);
        } else {
            throw new IllegalArgumentException("Not a valid operator");
        }
    }

    public String evaluate(String str)
    {   
        String [] tokens = str.split(" ");

        for (int i = 0; i < tokens.length; i++)
        {
            if (isDouble(tokens [i]) == true)
            {
                nums.push(Double.parseDouble(tokens [i]));
            }   
            if (tokens [i] == "(")
            {
                ops.push(tokens [i]);
            }
            if (tokens [i] == ")")
            {
                String op1 = ops.pop();
                double num1 = nums.pop();
                double num2 = nums.pop();
                double result = applyOperator(num1,op1,num2);
                nums.add(result);
            }
            if (tokens [i] == "+" || tokens [i] == "-" || tokens [i] == "*" || tokens [i] == "/" || tokens [i] == "^")
            {
                if(ops.isEmpty())
                {
                    ops.push(tokens [i]);
                }
                else if (prec(tokens [i]) > prec(ops.peek()))
                {
                    ops.push(tokens [i]);
                }
                else if (prec(tokens [i]) < prec(ops.peek()) && !ops.isEmpty() && ops.peek() != "(")
                {
                    String ac1 = ops.pop();
                    double res1 = nums.pop();
                    double res2 = nums.pop();
                    double outcome = applyOperator(res1,ac1,res2);
                    nums.add(outcome);
                }   
            }
        }

        while(!ops.isEmpty() && nums.size() > 1)
        {
            String ab = ops.pop();
            double bb = nums.pop();
            double cb = nums.pop();
            double clac = applyOperator(bb,ab,cb);
            nums.add(clac);
        }
        String fix = nums.pop().toString();
        return fix;
    }
}

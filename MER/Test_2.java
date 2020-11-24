import java.util.Scanner;

import javax.script.*;
public class Test_2 {
    public static void main(String[] args) throws Exception {
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a JavaScript engine
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        // evaluate JavaScript code from String
       
       System.out.print("Enter expression");
       Scanner sc=new Scanner(System.in);
      
       String s= sc.nextLine();
       Number number = (Number)engine.eval(s);
        System.out.println("abc = " + number);
        
        
    }
}
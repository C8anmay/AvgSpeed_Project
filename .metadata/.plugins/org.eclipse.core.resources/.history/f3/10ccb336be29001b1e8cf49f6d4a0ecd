import javax.script.ScriptEngineManager;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

import com.sun.tools.javac.Main;

public class Eg1 {
  public static void main(String[] args) throws ScriptException {
	//  private static final Logger LOGGER = Logger.getLogger(main.class);
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    System.out.print("Input expression: ");
    Scanner sc=new Scanner(System.in);
    String s= sc.nextLine();
    char operator = sc.next().charAt(0);

    //String foo = "40+2*3";
   System.out.println(s);
   System.out.println("Result:"+engine.eval(s));
   
    
    
    } 
}
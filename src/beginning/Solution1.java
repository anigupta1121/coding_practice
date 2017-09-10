package beginning;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.beans.Expression;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/19/2017.
 */
public class Solution1 {
    public static void main(String[] args) throws IOException, ScriptException {
        Scanner p=new Scanner(System.in);
        String n=p.next();

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        Object res=engine.eval(n);

        System.out.println(res.toString());
    }




}

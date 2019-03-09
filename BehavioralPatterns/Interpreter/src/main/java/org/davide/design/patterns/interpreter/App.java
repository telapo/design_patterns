/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.interpreter;

import java.util.List;
import org.davide.design.patterns.interpreter.iterator.AbstractExpression;
import org.davide.design.patterns.interpreter.iterator.Context;
import org.davide.design.patterns.interpreter.iterator.From;
import org.davide.design.patterns.interpreter.iterator.Select;
import org.davide.design.patterns.interpreter.iterator.Where;

/**
 * This is the Client object.
 * 
 * It uses the context and the interpreter to query the fake table of our
 * example.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        AbstractExpression query = new Select("name", new From("people"));
        Context context = new Context();
        List<String> result = query.interpret(context);
        System.out.println(result);

        AbstractExpression query2 = new Select("*", new From("people"));
        List<String> result2 = query2.interpret(context);
        System.out.println(result2);

        AbstractExpression query3 = new Select("name",
                new From("people",
                        new Where(name -> name.toLowerCase().startsWith("d"))));
        List<String> result3 = query3.interpret(context);
        System.out.println(result3);
    }
}

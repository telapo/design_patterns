/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.strategy;

import org.davide.design.patterns.strategy.java.classical.Context;
import org.davide.design.patterns.strategy.java.classical.StrategyAddImpl;
import org.davide.design.patterns.strategy.java.classical.StrategyMultiplyImpl;
import org.davide.design.patterns.strategy.java.classical.StrategySubtractImpl;
import org.davide.design.patterns.strategy.java.eight.ContextValidator;

/**
 * This is the Client.
 *
 * It creates the Context, passes it a Strategy and then calls executeStrategy()
 * on the Context.
 *
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        /*
        Pre Java 8 version
         */
        Context context = new Context(new StrategyAddImpl());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new StrategySubtractImpl());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new StrategyMultiplyImpl());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        /*
        Post Java 8 version
         */
        ContextValidator numericValidator = new ContextValidator((String s) -> s.matches(" [a-z] + "));
        boolean b1 = numericValidator.validate("aaaa");
        System.out.println("B1: " + b1);
        ContextValidator lowerCaseValidator = new ContextValidator((String s) -> s.matches("\\d+"));
        boolean b2 = lowerCaseValidator.validate("bbbb");
        System.out.println("B2: " + b2);
        System.out.println("B3: " + lowerCaseValidator.validate("123"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.strategy.java.eight;

/**
 * This is the Java 8 context.
 * 
 * @author davide
 */
public class ContextValidator {

    private final ValidationStrategy strategy;

    public ContextValidator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean validate(String s) {
        return strategy.execute(s);
    }
}

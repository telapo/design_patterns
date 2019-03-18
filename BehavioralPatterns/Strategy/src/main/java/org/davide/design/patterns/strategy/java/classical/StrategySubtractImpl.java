/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.strategy.java.classical;

/**
 * This is a ConcreteStrategy.
 * 
 * It implements the Strategy.
 * 
 * @author davide
 */
public class StrategySubtractImpl implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

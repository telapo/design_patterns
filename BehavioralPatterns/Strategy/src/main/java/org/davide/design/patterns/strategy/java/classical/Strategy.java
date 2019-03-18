/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.strategy.java.classical;

/**
 * This is the Strategy interface.
 * 
 * It applies to all the algorithms.
 * 
 * @author davide
 */
public interface Strategy {

    public int doOperation(int num1, int num2);
}

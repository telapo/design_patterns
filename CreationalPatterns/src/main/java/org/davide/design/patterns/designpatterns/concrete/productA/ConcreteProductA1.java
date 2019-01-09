/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.designpatterns.concrete.productA;

import org.davide.design.patterns.designpatterns.concrete.InterfaceProductA;

/**
 * Concrete implementation of productA.
 * 
 * @author davide
 */
public class ConcreteProductA1 implements InterfaceProductA{

    @Override
    public void draw() {
        System.out.println("Type A1!");
    }
    
}

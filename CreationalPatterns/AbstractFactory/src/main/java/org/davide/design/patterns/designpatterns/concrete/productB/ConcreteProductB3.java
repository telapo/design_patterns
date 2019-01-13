/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.designpatterns.concrete.productB;

import org.davide.design.patterns.designpatterns.concrete.InterfaceProductB;

/**
 * Concrete implementation of productB.
 * 
 * @author davide
 */
public class ConcreteProductB3 implements InterfaceProductB{

    @Override
    public void sing() {
        System.out.println("Product B3 is singing!");
    }
    
}

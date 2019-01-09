/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.designpatterns;

import org.davide.design.patterns.designpatterns.concrete.InterfaceProductA;
import org.davide.design.patterns.designpatterns.concrete.InterfaceProductB;

/**
 * Abstract class that can be used to create products. The type depends on the
 * enum passed, but it can also be a string or similar.
 * 
 * There are 2 products in this example, productA and productB.
 * 
 * @author davide
 */
public abstract class AbstractFactory {

    abstract InterfaceProductA createProductA(ProductAEnum productAType);
    abstract InterfaceProductB createProductB(ProductBEnum productBType);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.designpatterns;

import org.davide.design.patterns.designpatterns.concrete.productA.ConcreteProductA1;
import org.davide.design.patterns.designpatterns.concrete.productA.ConcreteProductA2;
import org.davide.design.patterns.designpatterns.concrete.productA.ConcreteProductA3;
import org.davide.design.patterns.designpatterns.concrete.InterfaceProductA;
import org.davide.design.patterns.designpatterns.concrete.InterfaceProductB;
import org.davide.design.patterns.designpatterns.concrete.productB.ConcreteProductB1;
import org.davide.design.patterns.designpatterns.concrete.productB.ConcreteProductB2;
import org.davide.design.patterns.designpatterns.concrete.productB.ConcreteProductB3;

/**
 * Implements the operations to create concrete products.
 *
 * In this case, we can create objects of 2 types, productA and productB. 
 * However, the products are generic, and specific implementations can be
 * created by passing an argument. So, if we want a productA1, we call
 * createProductA(PRODUCT_A1).
 *
 * @author davide
 */
public class ConcreteFactory extends AbstractFactory {

    @Override
    public InterfaceProductA createProductA(ProductAEnum productAType) {
        switch (productAType) {
            case PRODUCT_A1:
                return new ConcreteProductA1();
            case PRODUCT_A2:
                return new ConcreteProductA2();
            case PRODUCT_A3:
                return new ConcreteProductA3();
            default:
                return null;
        }
    }

    @Override
    InterfaceProductB createProductB(ProductBEnum productBType) {
        switch (productBType) {
            case PRODUCT_B1:
                return new ConcreteProductB1();
            case PRODUCT_B2:
                return new ConcreteProductB2();
            case PRODUCT_B3:
                return new ConcreteProductB3();
            default:
                return null;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.designpatterns;

import org.davide.design.patterns.designpatterns.concrete.InterfaceProductA;
import org.davide.design.patterns.designpatterns.concrete.InterfaceProductB;

/**
 * This is an example of a class that uses the Abstract Factory and the
 * Interface of the products to create the various objects.
 *
 * @author davide
 */
public class Client {

    public static void main(String[] args) {

        // AbstractFactory uses a ConcreteFactory to actually create the
        // objects of type productA or product B.
        AbstractFactory objectFactory = new ConcreteFactory();

        // create objects of type A1, A2, A3
        InterfaceProductA a1 = objectFactory.createProductA(ProductAEnum.PRODUCT_A1);
        a1.draw();

        InterfaceProductA a2 = objectFactory.createProductA(ProductAEnum.PRODUCT_A2);
        a2.draw();

        InterfaceProductA a3 = objectFactory.createProductA(ProductAEnum.PRODUCT_A3);
        a3.draw();

        // create objects of type B1, B2, B3
        InterfaceProductB b1 = objectFactory.createProductB(ProductBEnum.PRODUCT_B1);
        b1.sing();

        InterfaceProductB b2 = objectFactory.createProductB(ProductBEnum.PRODUCT_B2);
        b2.sing();

        InterfaceProductB b3 = objectFactory.createProductB(ProductBEnum.PRODUCT_B3);
        b3.sing();
    }
}

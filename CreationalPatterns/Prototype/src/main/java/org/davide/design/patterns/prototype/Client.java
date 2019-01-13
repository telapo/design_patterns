/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.prototype;

import org.davide.design.patterns.prototype.products.ProductA;
import org.davide.design.patterns.prototype.products.ProductB;

/**
 *
 * @author davide
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // using Java defined Cloneable interface
        ProductA productA = new ProductA("A", "123456");
        System.out.println("First product: " + productA);

        ProductA productA2 = productA.clone();
        productA2.setId("789012");
        System.out.println("Cloned product: " + productA2);

        // using custom defined Prototype interface
        ProductB productB = new ProductB("B", "000000");
        System.out.println("Custom product: " + productB);

        ProductB productB2 = productB.clone();
        productB2.setId("111111");
        System.out.println("Cloned custom product: " + productB2);
    }
}

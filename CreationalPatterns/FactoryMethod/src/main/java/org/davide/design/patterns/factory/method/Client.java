/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.factory.method;

import org.davide.design.patterns.factory.method.products.Products;

/**
 *
 * @author davide
 */
public class Client {
    public static void main(String[] args) {
        Creator factory = new ConcreteCreator();
        
        Products productA = factory.factoryMethod(ProductType.PRODUCT_A);
        System.out.println("First product: " + productA.printMe());
        
        Products productB = factory.factoryMethod(ProductType.PRODUCT_B);
        System.out.println("Second product: " + productB.printMe());
        
        Products productC = factory.factoryMethod(ProductType.PRODUCT_C);
        System.out.println("Third product: " + productC.printMe());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.factory.method;

import org.davide.design.patterns.factory.method.products.ProductA;
import org.davide.design.patterns.factory.method.products.ProductB;
import org.davide.design.patterns.factory.method.products.ProductC;
import org.davide.design.patterns.factory.method.products.Products;

/**
 * Concrete class to return the required product/object. The enum could be a
 * string or something else.
 * 
 * @author davide
 */
public class ConcreteCreator implements Creator {

    @Override
    public Products factoryMethod(ProductType productType) {
        switch (productType) {
            case PRODUCT_A:
                return new ProductA();
            case PRODUCT_B:
                return new ProductB();
            case PRODUCT_C:
                return new ProductC();
            default:
                throw new IllegalArgumentException("Unknown type...");
        }
    }

}

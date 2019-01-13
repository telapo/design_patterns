/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.factory.method;

import org.davide.design.patterns.factory.method.products.Products;

/**
 * Interface that defines the Factory Method and returns the interface of the
 * products.
 * 
 * @author davide
 */
public interface Creator {

    // It may have a default implementation too!
    Products factoryMethod(ProductType productType);
}

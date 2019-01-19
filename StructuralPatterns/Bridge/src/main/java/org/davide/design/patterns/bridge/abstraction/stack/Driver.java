/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.bridge.abstraction.stack;

import org.davide.design.patterns.bridge.implementor.stack.Car;

/**
 * This is the Abstraction, which keeps a reference to an object of type
 * Implementor. This is the first hierarchy.
 *
 * @author davide
 */
public interface Driver {

    String first();
    String second();
    
    // reference to the other hierarchy - BRIDGE
    Car getCar();
}

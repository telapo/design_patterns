/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.bridge.abstraction.stack;

import org.davide.design.patterns.bridge.implementor.stack.Car;

/**
 * Concrete implementation of the first hierarchy.
 * 
 * @author davide
 */
public class Paul implements Driver {

    private Car car;

    public Paul(Car car) {
        this.car = car;
    }

    @Override
    public String first() {
        return "Paul first " + car.drive();
    }

    @Override
    public String second() {
        return "Paul second " + car.fillIn();
    }

    @Override
    public Car getCar() {
        return car;
    }

}

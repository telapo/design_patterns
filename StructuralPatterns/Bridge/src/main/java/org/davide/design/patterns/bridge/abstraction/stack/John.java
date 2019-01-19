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
public class John implements Driver {

    private Car car;

    public John(Car car) {
        this.car = car;
    }

    @Override
    public String first() {
        return "John first " + car.drive();
    }

    @Override
    public String second() {
        return "John second " + car.park();
    }

    @Override
    public Car getCar() {
        return car;
    }

}

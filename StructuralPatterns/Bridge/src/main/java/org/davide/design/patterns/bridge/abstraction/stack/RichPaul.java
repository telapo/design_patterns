/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.bridge.abstraction.stack;

import java.math.BigDecimal;
import org.davide.design.patterns.bridge.implementor.stack.Car;

/**
 * Concrete implementation of the first extended hierarchy.
 * 
 * @author davide
 */
public class RichPaul implements RichDriver {

    private Car car;

    public RichPaul(Car car) {
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

    @Override
    public BigDecimal costOfCar() {
        return new BigDecimal(130_000L);
    }

}

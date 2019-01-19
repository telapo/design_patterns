/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.adapter.models.classAdpter;

/**
 *
 * @author davide
 */
public class Driver implements Car {

    private Car car;

    public Driver(Car car) {
        this.car = car;
    }

    @Override
    public String driverCar() {
        return car.driverCar();
    }

}

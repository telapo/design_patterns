/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.adapter.models.classAdpter;

/**
 * This is the adapter, which allows to use the methods from the Motorbike
 * interface even though the object implements Car.
 * 
 * @author davide
 */
public class MotorbikeAdapter implements Car {

    // instance of the incompatible interface
    private Motorbike motorbike;

    public MotorbikeAdapter() {
        // there could be a proper implementation in a separate class instead
        // of doing everything inline
        this.motorbike = new Motorbike() {
            @Override
            public String driveMotorbike() {
                return "I am driving a motorbike";
            }
        };
    }

    // when calling the method of the Car interface, actually the one from
    // the Motorbike one is called.
    @Override
    public String driverCar() {
        return motorbike.driveMotorbike();
    }

}

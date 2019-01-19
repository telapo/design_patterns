/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.adapter;

import org.davide.design.patterns.adapter.models.classAdpter.Driver;
import org.davide.design.patterns.adapter.models.classAdpter.MotorbikeAdapter;

/**
 *
 * @author davide
 */
public class Client {

    public static void main(String[] args) {
        // driver's constructor takes an object that implements the Car 
        // interface. We pass the adapter here.
        Driver driver = new Driver(new MotorbikeAdapter());
        String result1 = driver.driverCar();
        System.out.println("Result of driving: " + result1);
    }
}

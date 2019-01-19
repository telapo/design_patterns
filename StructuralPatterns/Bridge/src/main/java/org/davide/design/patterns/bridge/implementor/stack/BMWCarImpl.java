/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.bridge.implementor.stack;

/**
 * Concrete examples of the second hierarchy.
 * 
 * @author davide
 */
public class BMWCarImpl implements Car {

    @Override
    public String drive() {
        return "I am driving a BMW";
    }

    @Override
    public String park() {
        return "I am parking a BMW";
    }

    @Override
    public String fillIn() {
        return "I am filling in a BMW";
    }

}

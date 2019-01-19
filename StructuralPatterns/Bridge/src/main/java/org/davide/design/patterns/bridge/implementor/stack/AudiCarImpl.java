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
public class AudiCarImpl implements Car {

    @Override
    public String drive() {
        return "I am driving an Audi";
    }

    @Override
    public String park() {
        return "I am parking an Audi";
    }

    @Override
    public String fillIn() {
        return "I am filling in an Audi";
    }

}

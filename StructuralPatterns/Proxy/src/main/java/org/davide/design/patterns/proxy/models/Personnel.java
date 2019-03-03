/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.proxy.models;

/**
 * This object is used in the example as something that needs to be limited
 * when accessing the real object.
 * 
 * @author davide
 */
public class Personnel {

    private String name;

    public Personnel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

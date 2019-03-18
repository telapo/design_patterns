/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.memento.models;

/**
 * This is the Memento obj.
 * 
 * It is used to store the state of the Originator obj.
 * 
 * @author davide
 */
public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

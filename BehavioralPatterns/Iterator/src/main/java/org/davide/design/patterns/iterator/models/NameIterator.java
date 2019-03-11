/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.iterator.models;

/**
 * This is the ConcreteIterator.
 *  
 * It is in charge to traverse the array.
 * 
 * @author davide
 */
public class NameIterator implements Iterator {

    private int index;
    private String[] names;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if (index < names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {

        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }

}

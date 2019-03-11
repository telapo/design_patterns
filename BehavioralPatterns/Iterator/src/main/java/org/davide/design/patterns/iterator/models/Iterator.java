/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.iterator.models;

/**
 * This is the Iterator interface.
 * 
 * @author davide
 */
public interface Iterator {

    public boolean hasNext();

    public Object next();
}

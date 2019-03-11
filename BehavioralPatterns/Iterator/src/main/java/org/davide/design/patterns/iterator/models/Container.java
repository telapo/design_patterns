/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.iterator.models;

/**
 * This is the DataStructure Interface that is implemented and returns an
 * Iterator.
 * 
 * @author davide
 */
public interface Container {

    public Iterator getIterator();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.iterator.models;

/**
 * This is the Data Structure that is similar to a list.
 * 
 * It is in charge to provide an Iterator to the Client.
 * 
 * @author davide
 */
public class NameDataStructure implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}

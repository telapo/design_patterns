/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.iterator;

import org.davide.design.patterns.iterator.models.Iterator;
import org.davide.design.patterns.iterator.models.NameDataStructure;

/**
 * The Client that uses the Iterator to traverse the data structure.
 *
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        NameDataStructure namesRepository = new NameDataStructure();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}

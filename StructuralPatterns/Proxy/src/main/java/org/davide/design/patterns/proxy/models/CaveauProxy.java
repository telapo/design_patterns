/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.proxy.models;

/**
 * This is the proxy object, which implements the common interface and acts
 * like an access controller, limiting the number of personnel allowed inside
 * to be 3.
 * 
 * @author davide
 */
public class CaveauProxy implements Caveau {

    private static final int NUMBER_OF_PERSONNEL_ALLOWED = 3;
    private int numberOfPersonnel;
    private final Caveau caveau;

    public CaveauProxy(Caveau caveau) {
        this.caveau = caveau;
    }

    @Override
    public void enter(Personnel personnel) {
        if (numberOfPersonnel < NUMBER_OF_PERSONNEL_ALLOWED) {
            caveau.enter(personnel);
            numberOfPersonnel++;
        } else {
            System.out.println(personnel.toString() + " cannot enter, max"
                    + " number of personnel already inside");
        }
    }

}

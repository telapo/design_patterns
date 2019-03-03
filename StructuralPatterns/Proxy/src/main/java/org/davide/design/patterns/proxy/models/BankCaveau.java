/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.proxy.models;

/**
 * This is the real object which implements the common interface.
 * 
 * @author davide
 */
public class BankCaveau implements Caveau {

    @Override
    public void enter(Personnel personnel) {
        System.out.println(personnel.toString() + " is entered in the caveau"
                + " of the bank");
    }

}

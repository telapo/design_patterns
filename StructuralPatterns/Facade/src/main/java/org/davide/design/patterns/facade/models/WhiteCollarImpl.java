/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.facade.models;

/**
 *
 * @author davide
 */
public class WhiteCollarImpl extends WhiteCollarAbstract {

    public WhiteCollarImpl(String name, int id, String work) {
        super(name, id, work);
    }

    @Override
    public void goToMeeting() {
        System.out.println(name + " is in a meeting");
    }

    @Override
    public void useComputer() {
        System.out.println(name + " is working at his computer");
    }

    @Override
    public void avoidStrike() {
        System.out.println(name + " is not on strike");
    }
}

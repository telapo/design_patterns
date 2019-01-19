/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.bridge;

import org.davide.design.patterns.bridge.abstraction.stack.John;
import org.davide.design.patterns.bridge.abstraction.stack.Paul;
import org.davide.design.patterns.bridge.abstraction.stack.RichPaul;
import org.davide.design.patterns.bridge.implementor.stack.AudiCarImpl;
import org.davide.design.patterns.bridge.implementor.stack.BMWCarImpl;

/**
 *
 * @author davide
 */
public class Client {

    public static void main(String[] args) {
        Paul paul = new Paul(new AudiCarImpl());
        System.out.println(paul.first());
        System.out.println(paul.second());

        John john = new John(new BMWCarImpl());
        System.out.println(john.first());
        System.out.println(john.second());
        
        // with extended Abstraction
        RichPaul richPaul = new RichPaul(new BMWCarImpl());
        System.out.println(richPaul.first());
        System.out.println(richPaul.second());
        System.out.println(richPaul.costOfCar());
    }
}

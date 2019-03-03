/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.proxy;

import org.davide.design.patterns.proxy.models.BankCaveau;
import org.davide.design.patterns.proxy.models.CaveauProxy;
import org.davide.design.patterns.proxy.models.Personnel;

/**
 *
 * @author davide
 */
public class App {
    public static void main(String[] args) {
        CaveauProxy proxy = new CaveauProxy(new BankCaveau());
        proxy.enter(new Personnel("Mario"));
        proxy.enter(new Personnel("Luca"));
        proxy.enter(new Personnel("Rosa"));
        proxy.enter(new Personnel("Stefano"));
        proxy.enter(new Personnel("Pino"));
    }
}

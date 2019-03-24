/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.visitor.nodes;

import org.davide.design.patterns.visitor.visitors.Visitor;

/**
 * This is the ConcreteElement class that implements the Node interface.
 * 
 * It implements the accept() method, and passes itself to the visitor.
 * 
 * @author davide
 */
public class Monitor implements Node {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}

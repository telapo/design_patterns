/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.visitor.nodes;

import org.davide.design.patterns.visitor.visitors.Visitor;

/**
 * This is the ObjectStructure which represents a group of Nodes.
 * 
 * It defines how to traverse the structure in the accept() method. Where it
 * also calls the visit() method.
 * 
 * @author davide
 */
public class Computer implements Node {

    private final Node[] parts;

    public Computer() {
        parts = new Node[]{new Monitor(), new Keyboard(), new Mouse()};
    }

    @Override
    public void accept(Visitor visitor) {
        for (Node part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }

}

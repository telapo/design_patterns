/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.visitor.visitors;

import org.davide.design.patterns.visitor.nodes.Computer;
import org.davide.design.patterns.visitor.nodes.Keyboard;
import org.davide.design.patterns.visitor.nodes.Monitor;
import org.davide.design.patterns.visitor.nodes.Mouse;

/**
 * This is the Visitor interface, which declares a Visit operation for each
 * ConcreteElement class.
 * 
 * @author davide
 */
public interface Visitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}

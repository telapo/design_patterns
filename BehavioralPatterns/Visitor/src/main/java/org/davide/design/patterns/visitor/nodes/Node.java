/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.visitor.nodes;

import org.davide.design.patterns.visitor.visitors.Visitor;

/**
 * This is the ELement interface that represents the objs in the obj structure, 
 * and contains the accept() method to take a Visitor.
 * 
 * @author davide
 */
public interface Node {

    public void accept(Visitor visitor);
}

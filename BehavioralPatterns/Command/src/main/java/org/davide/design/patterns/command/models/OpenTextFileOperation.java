/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.command.models;

/**
 * This is a ConcreteCommand implementation.
 * 
 * It defines a binding between a Receiver and an Action.
 * 
 * @author davide
 */
public class OpenTextFileOperation implements TextFileOperation {
 
    private TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }
     
    @Override
    public void execute() {
        textFile.open();
    }
}
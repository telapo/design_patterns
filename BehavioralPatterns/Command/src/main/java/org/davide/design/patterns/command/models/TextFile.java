/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.command.models;

/**
 * This is the Receiver object, which is actually in charge of executing the
 * command.
 *
 * @author davide
 */
public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Opening file " + name);
    }

    public void save() {
        System.out.println("Saving file " + name);
    }

    // additional text file methods (editing, writing, copying, pasting)
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.interpreter.models;

/**
 * This is a model that represents a row in a table.
 * 
 * It is part of the example, not of the Interpreter pattern.
 * 
 * @author davide
 */
public class Row {

    private String name;
    private String surname;

    public Row(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}

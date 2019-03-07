/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.command.models;

/**
 * This is the Command interface.
 * 
 * @author davide
 */
@FunctionalInterface
public interface TextFileOperation {

    void execute();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.command;

import org.davide.design.patterns.command.models.OpenTextFileOperation;
import org.davide.design.patterns.command.models.SaveTextFileOperation;
import org.davide.design.patterns.command.models.TextFile;

/**
 * This is the Client.
 * 
 * It uses the Invoker and passes to it the ConcreteCommand objects.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        TextFileInvoker textFileOperationExecutor = new TextFileInvoker();
        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
    }
}

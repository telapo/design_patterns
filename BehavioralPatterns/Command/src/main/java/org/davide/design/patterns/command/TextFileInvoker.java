/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.command;

import java.util.ArrayList;
import java.util.List;
import org.davide.design.patterns.command.models.TextFileOperation;

/**
 * This is the Invoker.
 *
 * It asks the command to carry out the request.
 *
 * @author davide
 */
public class TextFileInvoker {

    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public void executeOperation(TextFileOperation textFileOperation) {
        textFileOperations.add(textFileOperation);
        textFileOperation.execute();
    }
}

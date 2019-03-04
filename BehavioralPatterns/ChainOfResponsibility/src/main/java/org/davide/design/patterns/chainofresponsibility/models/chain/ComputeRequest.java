/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.chainofresponsibility.models.chain;

import org.davide.design.patterns.chainofresponsibility.models.Request;
import org.davide.design.patterns.chainofresponsibility.models.RequestType;

/**
 * Concrete implementation of a node in the chain, which actually does something.
 * 
 * @author davide
 */
public class ComputeRequest extends RequestHandler {

    public ComputeRequest(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.COMPUTE)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Compute Handler";
    }
}

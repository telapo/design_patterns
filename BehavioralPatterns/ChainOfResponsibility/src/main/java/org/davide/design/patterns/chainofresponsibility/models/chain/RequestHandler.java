/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.chainofresponsibility.models.chain;

import org.davide.design.patterns.chainofresponsibility.models.Request;

/**
 * This is the common abstract class to the whole chain.
 * 
 * @author davide
 */
public abstract class RequestHandler {

    private RequestHandler next;

    // It contains a pointer to the next node, or null if it is the last one
    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    // pass the request to the next node if the pointer is not null
    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println("Handling request: " + req + " " + this);
    }

    @Override
    public abstract String toString();
}

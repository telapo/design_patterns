/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.chainofresponsibility.models.chain;

import org.davide.design.patterns.chainofresponsibility.models.Request;

/**
 * This is the controller of the chain.
 * 
 * 
 * @author davide
 */
public class ChainMaster {

    RequestHandler chain;

    public ChainMaster() {
        buildChain();
    }

    // it creates the chain here
    private void buildChain() {
        chain = new ComputeRequest(new CloseRequest(new OpenRequest(null)));
    }

    // it passes the request to the chain
    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }
}

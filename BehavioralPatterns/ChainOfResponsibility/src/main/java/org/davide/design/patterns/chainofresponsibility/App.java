/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.chainofresponsibility;

import org.davide.design.patterns.chainofresponsibility.models.Request;
import org.davide.design.patterns.chainofresponsibility.models.RequestType;
import org.davide.design.patterns.chainofresponsibility.models.chain.ChainMaster;

/**
 * Client app.
 * 
 * @author davide
 */
public class App {

    public static void main(String[] args) {
        ChainMaster chain = new ChainMaster();
        chain.makeRequest(new Request(RequestType.OPEN, "Open a request"));
        chain.makeRequest(new Request(RequestType.COMPUTE, "Elaborate the request"));
        chain.makeRequest(new Request(RequestType.CLOSE, "Close a request"));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.bridge.abstraction.stack;

import java.math.BigDecimal;

/**
 * This demonstrates how the first hierarchy can be evolved independently.
 * 
 * @author davide
 */
public interface RichDriver extends Driver {

    BigDecimal costOfCar();
}

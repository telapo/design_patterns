/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.facade;

import java.util.ArrayList;
import java.util.List;
import org.davide.design.patterns.facade.models.BlueCollarAbstract;
import org.davide.design.patterns.facade.models.WhiteCollarImpl;
import org.davide.design.patterns.facade.models.BlueCollarImpl;
import org.davide.design.patterns.facade.models.WhiteCollarAbstract;

/**
 * The facade object.
 * 
 * @author davide
 */
public class CompanyFacade {
    // the 2 subsystems
    private final List<WhiteCollarAbstract> employeesWhite;
    private final List<BlueCollarAbstract> employeeBlue;
    
    public CompanyFacade() {
        this.employeesWhite = new ArrayList<>();
        employeesWhite.add(new WhiteCollarImpl("gianni", 12, "manager"));
        employeesWhite.add(new WhiteCollarImpl("luca", 13, "cfo"));
        this.employeeBlue = new ArrayList<>();
        employeeBlue.add(new BlueCollarImpl("pino", 15, "line worker"));
        employeeBlue.add(new BlueCollarImpl("sandro", 10, "line worker"));
    }
    
    public void startNormalDay() {
        employeeBlue.stream().forEach(x -> x.mountCar());
        employeesWhite.stream().forEach(x -> x.goToMeeting());
    }
    
    public void endNormalDay() {
        employeeBlue.stream().forEach(x -> x.clearShopfloor());
        employeesWhite.stream().forEach(x -> x.useComputer());
    }
    
    public void strikeDay() {
        employeeBlue.stream().forEach(x -> x.goOnStrike());
    }
}

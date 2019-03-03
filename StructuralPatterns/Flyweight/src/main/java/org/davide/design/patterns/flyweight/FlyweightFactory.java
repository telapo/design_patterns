/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import org.davide.design.patterns.flyweight.models.AntibioticDrug;
import org.davide.design.patterns.flyweight.models.AspirinDrug;
import org.davide.design.patterns.flyweight.models.Drug;
import org.davide.design.patterns.flyweight.models.DrugEnum;
import org.davide.design.patterns.flyweight.models.ParacetamolDrug;

/**
 * This is the Flyweight factory used by the client.
 * 
 * @author davide
 */
public class FlyweightFactory {

    private final Map<DrugEnum, Drug> flyweight;

    public FlyweightFactory() {
        this.flyweight = new HashMap<>();
    }

    public Drug getFlyweight(DrugEnum key) {
        Drug retrieved = flyweight.get(key);
        if (retrieved == null) {
            switch (key) {
                case ANTIBIOTIC:
                    retrieved = new AntibioticDrug();
                    flyweight.put(key, retrieved);
                    break;
                case ASPIRIN:
                    retrieved = new AspirinDrug();
                    flyweight.put(key, retrieved);
                    break;
                case PARACETAMOL:
                    retrieved = new ParacetamolDrug();
                    flyweight.put(key, retrieved);
                    break;
                default:
                    throw new IllegalArgumentException("Key not recognized");
            }
        }
        return retrieved;
    }

}

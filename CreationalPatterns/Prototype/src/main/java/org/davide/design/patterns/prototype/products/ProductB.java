/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.prototype.products;

import org.davide.design.patterns.prototype.Prototype;

/**
 *
 * @author davide
 */
public class ProductB implements Prototype<ProductB> {

    private String name;
    private String id;

    public ProductB(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductB{" + "name=" + name + ", id=" + id + '}';
    }

    @Override
    public ProductB clone() {
        return new ProductB(name, id);
    }

}

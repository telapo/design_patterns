/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.prototype.products;

/**
 *
 * @author davide
 */
public class ProductA implements Cloneable {

    private String name;
    private String id;

    public ProductA(String name, String id) {
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
        return "ProductA{" + "name=" + name + ", id=" + id + '}';
    }

    @Override
    public ProductA clone() throws CloneNotSupportedException {
        return new ProductA(this.name, this.id);
    }

}

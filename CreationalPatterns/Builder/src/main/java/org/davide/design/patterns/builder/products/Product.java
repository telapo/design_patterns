/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.builder.products;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author davide
 */
public class Product {
    private String name;
    private String id;
    private LocalDate productionDate;
    private String designer;
    private BigDecimal price;

    public Product(String name, String id, LocalDate productionDate, String designer, BigDecimal price) {
        this.name = name;
        this.id = id;
        this.productionDate = productionDate;
        this.designer = designer;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", id=" + id + ", productionDate=" + productionDate + ", designer=" + designer + ", price=" + price + '}';
    }
    
    
    
}

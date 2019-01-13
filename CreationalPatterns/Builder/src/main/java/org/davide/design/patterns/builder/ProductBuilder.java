/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
import org.davide.design.patterns.builder.products.Product;

/**
 *
 * @author davide
 */
public final class ProductBuilder {

    private String name;
    private String id;
    private LocalDate productionDate;
    private String designer;
    private BigDecimal price;

    public ProductBuilder(final String id) {
        // just an example
        if (StringUtils.isEmpty(id)) {
            throw new IllegalArgumentException("The id cannot be null!");
        }
        this.id = id;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setProductionDate(LocalDate date) {
        // some validation can be done
        if (!date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("The Product must be "
                    + "manufactured before the current date");
        }
        this.productionDate = date;
        return this;
    }

    public ProductBuilder setDesigner(String designer) {
        this.designer = designer;
        return this;
    }

    public ProductBuilder setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Product build() {
        return new Product(name, id, productionDate, designer, price);
    }

}

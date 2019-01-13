/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.davide.design.patterns.builder;

import java.math.BigDecimal;
import java.time.LocalDate;
import org.davide.design.patterns.builder.products.Product;

/**
 *
 * @author davide
 */
public class Client {
    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder("id123456")
                .setDesigner("Davide")
                .setName("Super chair")
                .setProductionDate(LocalDate.now().minusDays(1L))
                .setPrice(BigDecimal.valueOf(12.56));
        
        Product product1 = productBuilder.build();
                
        System.out.println("Product 1: " + product1);
        
        // cloning
        Product product2 = productBuilder.build();
        System.out.println("Product 2 (cloned from the first one): " 
                + product2);
        
        // modification
        productBuilder.setPrice(BigDecimal.valueOf(52));
        Product product3 = productBuilder.build();
        System.out.println("Product 3 (with modifications): " + product3);
    }
}

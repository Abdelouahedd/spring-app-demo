package org.este.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shopping_cart")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShoppingCart {
    @Id
    @GeneratedValue(generator = "shopping_cart_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Customer customer;
    @ManyToMany
    @JoinTable(
            name = "shopping_cart_product",
            joinColumns = @JoinColumn(name = "shopping_cart_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products = new ArrayList<>();

}

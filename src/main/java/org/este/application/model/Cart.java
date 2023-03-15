package org.este.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "cart")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cart {
    @Id
    @GeneratedValue(generator = "cart_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToMany(mappedBy = "cart")
    private List<Order> orders;
    private BigDecimal price;
}

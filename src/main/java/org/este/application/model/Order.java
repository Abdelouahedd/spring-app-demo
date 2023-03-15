package org.este.application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(generator = "order_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}

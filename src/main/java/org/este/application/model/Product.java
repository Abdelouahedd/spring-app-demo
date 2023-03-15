package org.este.application.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue(generator = "product_id_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}

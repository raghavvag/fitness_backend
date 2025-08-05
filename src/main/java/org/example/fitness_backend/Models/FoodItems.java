package org.example.fitness_backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "FoodItem")
public class FoodItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(nullable = false)
    private BigDecimal calories;

    @Column(nullable = false)
    private BigDecimal carbs;

    @Column(nullable = false)
    private BigDecimal protein;

    @Column(nullable = false)
    private BigDecimal fiber;

    @Column(nullable = false)
    private BigDecimal fat;

}

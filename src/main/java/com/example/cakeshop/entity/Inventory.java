package com.example.cakeshop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inventoryId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "availability")
    private boolean availability;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cake_id", referencedColumnName = "id")
    private Cake inventoryCake;
}

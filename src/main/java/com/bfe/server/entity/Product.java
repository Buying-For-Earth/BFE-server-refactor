package com.bfe.server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product extends Datetime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @Column
    String name;
    @Column
    Integer price;
    @Column
    String detail;
    @Column
    String thumbnail;

}

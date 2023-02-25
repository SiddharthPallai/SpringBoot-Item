package com.epicminds.demo.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Sidharth
 */

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "name")
    @NotNull
    @Size(min = 4, message="should be more than 4.......", max = 15)
    String name;
    @Column(name = "price")
    Double price;
    @Column(name = "quantity")
    Integer quantity;
}

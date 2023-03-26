package com.epicminds.demo.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private Integer id;
    @Column(name = "name")
    @NotNull
    @Size(min = 4, message="should be more than 4.......", max = 15)
    private String name;
    @Column(name = "price")
    private  Double price;
    @Column(name = "quantity")
    private Integer quantity;

    // For 1:1 UND and Source
    @OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="item_type_id" /*, referencedColumnName = "id"*/)
    private ItemType itemType;

    // For 1:1 BND
//    @JsonManagedReference
//
//    @OneToOne(cascade = CascadeType.ALL)
//    //@JoinColumn(name="item_type_id")
//    private ItemType itemType;
//    @JsonIgnore
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
//    private List<CartItem> carts;
}

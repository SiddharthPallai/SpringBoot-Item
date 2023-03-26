//package com.epicminds.demo.model;
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
///**
// * @author Sidharth
// */
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name="cart_item")
//public class CartItem implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @ManyToOne
//    @JoinColumn(name="item_id")
//    private Item item;
//
//    @Column(name="quantity")
//    private Integer quantity;
//
//    public CartItem(Integer itemId, Integer qty) {
//    }
//
//    public CartItem(Item i, Integer qty) {
//
//    }
//}
